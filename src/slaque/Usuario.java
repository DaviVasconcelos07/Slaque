package slaque;

import java.util.Objects;

public class Usuario {
	private String nome;
	private String email;
	
	public Usuario(String nome, String email) {
		if(nome==null|| email==null) {
			throw new IllegalArgumentException("Nome ou email inválidos");
		}
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Usuario))
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "; Email: "+ email;
	}

}
