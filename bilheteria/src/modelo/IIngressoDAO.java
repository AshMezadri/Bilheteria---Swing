package modelo;

import java.util.ArrayList;

public interface IIngressoDAO {

	public boolean cadastrarIngresso(Ingresso ingresso);
	
	public boolean alterarIngresso(Ingresso ingresso, Integer idIngresso, Sessao sessao, Pessoa pessoa, Filme filme, Double valor, Character fileira, Integer numCadeira);

	public boolean deletarIngresso(Ingresso ingresso, Integer idIngresso);
	
	public ArrayList<Ingresso> listaIngressos();
	
}
