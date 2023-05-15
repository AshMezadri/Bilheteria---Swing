package controle;

import java.util.ArrayList;

import modelo.IIngressoDAO;
import modelo.Ingresso;
import modelo.Pessoa;
import modelo.Sessao;

public class IngressoDAO implements IIngressoDAO {

	private static ArrayList<Ingresso> listaIngressos;
	private static IngressoDAO instancia;

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
			listaIngressos.add(ingresso);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarIngresso(Ingresso i, Long idIngresso, Sessao sessao, Pessoa pessoa, Double valor,
			Character fileira, Integer numCadeira) {

		for (Ingresso ingresso : listaIngressos) {
			if (ingresso.getIdIngresso().equals(idIngresso)) {
				ingresso.setIdIngresso(idIngresso);
				ingresso.setSessao(sessao);
				ingresso.setPessoa(pessoa);
				ingresso.setValor(valor);
				ingresso.setFileira(fileira);
				ingresso.setNumCadeira(numCadeira);

			}
		}

		return false;
	}

	@Override
	public boolean deletarIngresso(Ingresso i, Long idIngresso) {

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

		return null;
	}

}
