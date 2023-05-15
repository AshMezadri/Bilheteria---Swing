package modelo;

public class Sessao {
	
	public String idSessao;
	public Filme filme;
	public Integer numeroSala;
	public Integer quantIngressosDisp;
	
	public Sessao(String idSessao, Filme filme,  Integer numeroSala,Integer quantIngressosDisp) {
		this.idSessao = idSessao;
		this.filme = filme;
		this.numeroSala = numeroSala;
		this.quantIngressosDisp = quantIngressosDisp;
	}
	
	public String getIdSessao() {
		return idSessao;
	}
	public void setIdSessao(String idSessao) {
		this.idSessao = idSessao;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Integer getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}
	public Integer getQuantIngressosDisp() {
		return quantIngressosDisp;
	}
	public void setQuantIngressosDisp(Integer quantIngressosDisp) {
		this.quantIngressosDisp = quantIngressosDisp;
	}
	

}
