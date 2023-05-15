package modelo;

public class Ingresso {

	public Long idIngresso;
	public Sessao sessao;
	public Pessoa pessoa;
	public Double valor;
	public Character fileira;
	public Integer numCadeira;
	
	public Ingresso(Long idIngresso, Sessao sessao, Pessoa pessoa, Double valor, Character fileira, Integer numCadeira) {
        this.idIngresso = idIngresso;
        this.sessao = sessao;
        this.pessoa = pessoa;
        this.valor = valor;
        this.fileira = fileira;
        this.numCadeira = numCadeira;
    }

	public Long getIdIngresso() {
		return idIngresso;
	}

	public void setIdIngresso(Long idIngresso) {
		this.idIngresso = idIngresso;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Character getFileira() {
		return fileira;
	}

	public void setFileira(Character fileira) {
		this.fileira = fileira;
	}

	public Integer getNumCadeira() {
		return numCadeira;
	}

	public void setNumCadeira(Integer numCadeira) {
		this.numCadeira = numCadeira;
	}
	
	

}
