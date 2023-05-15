package controle;

import java.util.ArrayList;

import modelo.Filme;
import modelo.ISessaoDAO;
import modelo.Sessao;

public class SessaoDAO implements ISessaoDAO {

	private static ArrayList<Sessao> listaSessoes;
	private static SessaoDAO instancia;

	private SessaoDAO() {
	}

	public static SessaoDAO getInstancia() {

		if (instancia == null) {
			instancia = new SessaoDAO();
			listaSessoes = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean cadastrarSessao(Sessao sessao) {

		if (sessao != null) {
			listaSessoes.add(sessao);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarSessao(Sessao s, String idSessao, Filme filme, Integer numeroSala,
			Integer quantIngressosDisp) {

		for (Sessao sessao : listaSessoes) {
			if (sessao.getIdSessao().equals(idSessao)) {
				sessao.setIdSessao(idSessao);
				sessao.setFilme(filme);
				sessao.setNumeroSala(numeroSala);
				sessao.setQuantIngressosDisp(quantIngressosDisp);

				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deletarSessao(Sessao s, String idSessao) {

		for (Sessao sessao : listaSessoes) {
			if (sessao.getIdSessao().equals(idSessao)) {
				listaSessoes.remove(sessao);

				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Sessao> listaSessoes() {

		return null;
	}

}
