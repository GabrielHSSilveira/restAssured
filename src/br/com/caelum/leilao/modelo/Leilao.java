package br.com.caelum.leilao.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Leilao {

	private Long id;
	private String nome;
	private Double valorInicial;
	private Usuario usuario;
	private boolean usado;
	
	public Leilao() {}
	
	public Leilao(Long id, String nome, Double valorInicial, Usuario usuario,
			boolean usado) {
		super();
		this.id = id;
		this.nome = nome;
		this.valorInicial = valorInicial;
		this.usuario = usuario;
		this.usado = usado;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	public Double getValorInicial() {
		return valorInicial;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (usado ? 1231 : 1237);
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result
				+ ((valorInicial == null) ? 0 : valorInicial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Leilao other = (Leilao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (usado != other.usado)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (valorInicial == null) {
			if (other.valorInicial != null)
				return false;
		} else if (!valorInicial.equals(other.valorInicial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Leilao [id=" + id + ", nome=" + nome + ", valorInicial="
				+ valorInicial + ", usuario=" + usuario + ", usado=" + usado
				+ "]";
	}
}
