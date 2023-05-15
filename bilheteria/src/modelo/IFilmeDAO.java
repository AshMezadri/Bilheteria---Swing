package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IFilmeDAO {

	public boolean cadastrarFilme(Filme filme);

	public boolean alterarFilme(Filme filme, String nomeFilme, String idFilme, LocalDateTime horarioFilmeDublado, LocalDateTime horarioFilmeLegendado);

	public boolean deletarFilme(Filme filme, String idFilme);

	public ArrayList<Filme> listaFilmes();
	
}
