package slaque;

public class Mensagem {
	
	private Usuario usr;
	private String texto;
	
	public Mensagem(Usuario usr, String texto) {
		if(usr==null|| texto==null) {
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		this.usr = usr;
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return usr.getNome() + ": " + texto;
	}
}
