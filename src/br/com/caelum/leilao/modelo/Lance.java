package br.com.caelum.leilao.modelo;


import java.util.Calendar;

public class Lance{

	private Long id;
	private double valor;
	private Calendar data;
	private Usuario usuario;
	private Leilao leilao;

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Leilao getLeilao() {
		return leilao;
	}
	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
