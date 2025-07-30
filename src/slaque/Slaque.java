package slaque;
import java.util.ArrayList;
import java.util.HashMap;

public class Slaque {

	private HashMap<String, Usuario> usuarios = new HashMap<>();
	private HashMap<String, Canal> canais = new HashMap<>();	
	
	public Slaque() {	
	
	}
	
	public void cadastraUsr(String nome, String email) {
		Usuario usr = new Usuario(nome, email);
		usuarios.put(email, usr);
	}
	
	public void cadastraCanal(String nome) {
		Canal cn = new Canal(nome); 
		canais.put(nome, cn);
	}
	
	public void incluiUsrCanal(String nome, String email) {
		if(nome==null|| email==null) {
			throw new IllegalArgumentException("Parâmetro inválido");
		}
		Usuario usr = usuarios.get(email);
		canais.get(nome).incluirUsr(usr);
	}
	
	public void excluiUsrCanal(String nome, String email) {
		if(nome==null|| email==null) {
			throw new IllegalArgumentException("parâmetro inválido");
		}
		Usuario usr = usuarios.get(email);
		canais.get(nome).excluirUsr(usr);
	}
	
	public void mandarMsg(String email, String nome, String mensagem) {
		if(email==null|| nome==null|| mensagem==null) {
			throw new IllegalArgumentException("parâmetro inválido");
		}
		canais.get(nome).mandarMsg(usuarios.get(email), mensagem);
	}
	
	public String listarMsg(String nome) {
		if(nome==null) {
			throw new IllegalArgumentException("Canal inválido");
		}
		return canais.get(nome).listarMsg();
	}
	
	public String listarUsr(String nome) {
		if(nome==null) {
			throw new IllegalArgumentException("Canal inválido");
		}
		return canais.get(nome).listarUsr();
	}
	
}
