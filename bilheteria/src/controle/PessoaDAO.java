package controle;

import java.util.ArrayList;

import modelo.IPessoaDAO;
import modelo.Pessoa;

public class PessoaDAO implements IPessoaDAO {

	private static ArrayList<Pessoa> ListaPessoas;
	private static PessoaDAO instancia;

	private PessoaDAO() {
	}

	public static PessoaDAO getInstancia() {
		if (instancia == null) {
			instancia = new PessoaDAO();
			ListaPessoas = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean cadastrarPessoa(Pessoa pessoa) {
		if (pessoa != null) {
			ListaPessoas.add(pessoa);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarPessoa(Pessoa p, Long cpf, String nome, String email, String senha) {

		for (Pessoa pessoa : ListaPessoas) {
			if (pessoa.getCpf() == (cpf)) {
				pessoa.setCpf(cpf);
				pessoa.setNome(nome);
				pessoa.setEmail(email);
				pessoa.setSenha(senha);

				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletarPessoa(Pessoa p, Long cpf) {

		for (Pessoa pessoa : ListaPessoas) {
			if (pessoa.getCpf() == (cpf)) {
				ListaPessoas.remove(pessoa);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Pessoa> ListaPessoas() {

		return null;
	}
}
