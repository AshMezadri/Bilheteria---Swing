package modelo;

public class Sessao {
	
	public Integer idSessao;
	public Filme filme;
	public Integer numeroSala;
	public Integer quantIngressosDisp;
	
	public Sessao(Integer idSessao, Filme filme,  Integer numeroSala,Integer quantIngressosDisp) {
		this.idSessao = idSessao;
		this.filme = filme;
		this.numeroSala = numeroSala;
		this.quantIngressosDisp = quantIngressosDisp;
	}
	
	public Sessao() {
		
	}
	
	public Integer getIdSessao() {
		return idSessao;
	}
	public void setIdSessao(Integer idSessao) {
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
	
	@Override
	public String toString() {
		return "Sessao [idSessao =" + idSessao + ", Filme =" + filme + ", Número sala =" + numeroSala
				+ ", Ingressos Disp. =" + quantIngressosDisp + "]";
	}

}
