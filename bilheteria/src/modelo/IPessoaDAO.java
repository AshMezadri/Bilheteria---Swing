package modelo;

import java.util.ArrayList;

public interface IPessoaDAO {

	public boolean cadastrarPessoa(Pessoa pessoa);

	public boolean alterarPessoa(Pessoa pessoa, Long cpf, String nome, String email, String senha);

	public boolean deletarPessoa(Pessoa pessoa, Long cpf);

	public ArrayList<Pessoa> listaPessoas();

}
