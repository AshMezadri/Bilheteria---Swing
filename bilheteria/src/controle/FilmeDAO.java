package controle;

import java.time.LocalDateTime;
import java.util.ArrayList;

import modelo.Filme;
import modelo.IFilmeDAO;

public class FilmeDAO implements IFilmeDAO {

	private static ArrayList<Filme> listaFilmes;
	private static FilmeDAO instancia;

	private FilmeDAO() {
	}

	public static FilmeDAO getInstancia() {
		if (instancia == null) {
			instancia = new FilmeDAO();
			listaFilmes = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean cadastrarFilme(Filme filme) {
		if (filme != null) {
			listaFilmes.add(filme);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarFilme(Filme f, String nomeFilme, Integer idFilme, LocalDateTime horarioFilmeDublado,
			LocalDateTime horarioFilmeLegendado) {
		for (Filme filme : listaFilmes) {
			if (filme.getIdFilme().equals(idFilme)) {
				filme.setIdFilme(idFilme);
				filme.setNomeFilme(nomeFilme);
				filme.setHorarioFilmeDublado(horarioFilmeDublado);
				filme.setHorarioFilmeLegendado(horarioFilmeLegendado);

				return true;
			}
		}

		return false;

	}

	@Override
	public boolean deletarFilme(Filme f, Integer idFilme) {

		for (Filme filme : listaFilmes) {
			if (filme.getIdFilme().equals(idFilme)) {
				listaFilmes.remove(filme);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Filme> listaFilmes() {
		if (!listaFilmes.isEmpty()) {
			for (Filme filme : listaFilmes) {

			}
		}
		return null;
	}

	public Filme getFilmeById(int idFilme) {
		for (Filme filme : listaFilmes) {
			if (filme.getIdFilme().equals(idFilme)) {
				return filme;
			}
		}
		return null;
	}

}
