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
		//encontra qual usuario incluir
		Usuario usr = usuarios.get(email);
		canais.get(nome).incluirUsr(usr);
	}
	
	public void excluiUsrCanal(String nome, String email) {
		Usuario usr = usuarios.get(email);
		canais.get(nome).excluirUsr(usr);
	}
	
	public void mandarMsg(String email, String mensagem) {
		
	}
	
//	public String listarMsg(String nome) {
//		
//	}
//	
//	public String listarUsr(String nome) {
//		
//	}
	
}
