package modelo;

import java.util.ArrayList;

public interface ISessaoDAO {

	public boolean cadastrarSessao(Sessao sessao);

	public boolean alterarSessao(Sessao sessao, Integer idSessao, Filme filme,  Integer numeroSala,Integer quantIngressosDisp);

	public boolean deletarSessao(Sessao sessao, Integer idSessao);

	public ArrayList<Sessao> listaSessoes();

}
