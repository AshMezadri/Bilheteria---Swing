package controle;

import java.util.ArrayList;

import modelo.Filme;
import modelo.IIngressoDAO;
import modelo.Ingresso;
import modelo.Pessoa;
import modelo.Sessao;

public class IngressoDAO implements IIngressoDAO {

	private static ArrayList<Ingresso> listaIngressos;
	private static IngressoDAO instancia;
	private static Integer contador = 100;

	private IngressoDAO() {
	}

	public static IngressoDAO getInstancia() {
		if (instancia == null) {
			instancia = new IngressoDAO();
			listaIngressos = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean cadastrarIngresso(Ingresso ingresso) {
		if (ingresso != null) {
			contador++;
			ingresso.setIdIngresso(contador);
			listaIngressos.add(ingresso);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarIngresso(Ingresso i, Integer idIngresso, Sessao sessao, Pessoa pessoa, Filme filme, Double valor,
			Character fileira, Integer numCadeira) {

		for (Ingresso ingresso : listaIngressos) {
			if (ingresso.getIdIngresso().equals(idIngresso)) {
				ingresso.setIdIngresso(idIngresso);
				ingresso.setSessao(sessao);
				ingresso.setPessoa(pessoa);
				ingresso.setFilme(filme);
				ingresso.setValor(valor);
				ingresso.setFileira(fileira);
				ingresso.setNumCadeira(numCadeira);

			}
		}

		return false;
	}

	@Override
	public boolean deletarIngresso(Ingresso i, Integer idIngresso) {

		for (Ingresso ingresso : listaIngressos) {
			if (ingresso.getIdIngresso().equals(idIngresso)) {
				listaIngressos.remove(ingresso);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public ArrayList<Ingresso> listaIngressos() {

		return listaIngressos;
	}
	
	public Ingresso getIngressoById(Integer idIngresso) {
		for (Ingresso ingresso : listaIngressos) {
			if (ingresso.getIdIngresso().equals(idIngresso)) {
				return ingresso;
			}
		}
		return null;
	}

}
