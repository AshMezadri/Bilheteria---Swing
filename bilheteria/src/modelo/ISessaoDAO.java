package modelo;

import java.util.ArrayList;

public interface ISessaoDAO {

	public boolean cadastrarSessao(Sessao sessao);

	public boolean alterarSessao(Sessao sessao, Long idSessao, Filme filme,  Integer numeroSala,Integer quantIngressosDisp);

	public boolean deletarSessao(Sessao sessao, Long idSessao);

	public ArrayList<Sessao> listaSessoes();

}
