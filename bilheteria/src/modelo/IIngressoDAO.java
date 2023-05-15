package modelo;

import java.util.ArrayList;

public interface IIngressoDAO {

	public boolean cadastrarIngresso(Ingresso ingresso);
	
	public boolean alterarIngresso(Ingresso ingresso, Long idIngresso, Sessao sessao, Pessoa pessoa, Double valor, Character fileira, Integer numCadeira);

	public boolean deletarIngresso(Ingresso ingresso, Long idIngresso);
	
	public ArrayList<Ingresso> listaIngressos();
	
}
