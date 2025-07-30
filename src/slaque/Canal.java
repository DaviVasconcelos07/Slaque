package slaque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Canal {
	private String nome;
	private ArrayList <Mensagem> mensagens = new ArrayList<>();
	private HashSet <Usuario> usuarios = new HashSet<>();
	
	public Canal(String nome) {
		if(nome== null) {
			throw new IllegalArgumentException("nome inválido");
		}
		this.nome = nome;
	}
	
	public void incluirUsr(Usuario usr) {
		usuarios.add(usr);
	}
	
	public void excluirUsr(Usuario usr) {
		usuarios.remove(usr);
	}
	
	public void mandarMsg(Usuario usr, String texto) {
		if(texto==null) {
			throw new IllegalArgumentException("Entrada inválida");
		}
		Mensagem msg = new Mensagem(usr, texto);
		mensagens.add(msg);
	}
	
	public String listarMsg() {
		String listaMensagens = "";
		for(Mensagem msg: mensagens) {
			listaMensagens += (mensagens.indexOf(msg) +1) + ". " + msg.toString()+ "\n";
		}
		return listaMensagens;
	}
	
	
	public String listarUsr() {
		String listaUsers= "";
		for(Usuario user: usuarios) {
			listaUsers += user.toString()+ "\n"; 
		}
		return listaUsers;
	}

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
