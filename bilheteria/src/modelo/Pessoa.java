package modelo;

public class Pessoa {

	public Long cpf;
	public String email, nome, senha;

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.getNome() + " //CPF : " + this.getCpf() + " //Email : " + this.getEmail() + " //Senha : " + this.getSenha() ;
	}

}
