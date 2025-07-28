package slaque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Canal {
	private String nome;
	private ArrayList <Mensagem> msg = new ArrayList<>();
	private HashSet <Usuario> usuarios = new HashSet<>();
	
	public Canal(String nome) {
		
	}
	
	public void incluirUsr(Usuario usr) {
		
	}
	
	public void excluirUsr(Usuario usr) {
		
	}
	
	public void mandarMsg(Usuario usr, String texto) {
		
	}
	
//	public String listarMsg() {
//		
//	}
//	
//	public String listarUsr() {
//		
//	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Canal))
			return false;
		Canal other = (Canal) obj;
		return Objects.equals(nome, other.nome);
	}
	

	
	

}
