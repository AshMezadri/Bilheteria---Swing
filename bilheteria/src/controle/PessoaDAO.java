package controle;

import java.util.ArrayList;

import modelo.Filme;
import modelo.IPessoaDAO;
import modelo.Pessoa;

public class PessoaDAO implements IPessoaDAO {

	private static ArrayList<Pessoa> listaPessoas;
	private static PessoaDAO instancia;

	private PessoaDAO() {
	}

	public static PessoaDAO getInstancia() {
		if (instancia == null) {
			instancia = new PessoaDAO();
			listaPessoas = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean cadastrarPessoa(Pessoa pessoa) {
		if (pessoa != null) {
			listaPessoas.add(pessoa);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarPessoa(Pessoa p, Long cpf, String nome, String email, String senha) {
	    for (Pessoa pessoa : listaPessoas) {
	        if (pessoa.getSenha().equals(senha)) {
	            if (cpf != null) {
	                pessoa.setCpf(cpf);
	            }
	            if (nome != null) {
	                pessoa.setNome(nome);
	            }
	            if (email != null) {
	                pessoa.setEmail(email);
	            }
	            pessoa.setSenha(senha);
	            return true;
	        }
	    }
	    return false;
	}


	@Override
	public boolean deletarPessoa(Pessoa p, Long cpf) {

		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getCpf() == (cpf)) {
				listaPessoas.remove(pessoa);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Pessoa> listaPessoas() {

		return listaPessoas;
	}
	
	public Pessoa getPessoaByCPF(Long cpf) {
	    for (Pessoa pessoa : listaPessoas) {
	        if (pessoa.getCpf() == (cpf)) {
	            return pessoa;
	        }
	    }
	    return null;
	}




}
