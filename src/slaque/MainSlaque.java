package slaque;

public class MainSlaque {
	
	public static void main(String[] args) {
		   
		Slaque sl = new Slaque();
	    sl.cadastraCanal("canal");
	    sl.cadastraUsr("Davi", "davi@email.com");
	    sl.cadastraUsr("Daniel", "daniel@email.com");
	    sl.cadastraUsr("Arthur", "arthur@email.com");
	    sl.incluiUsrCanal("canal", "davi@email.com");
	    sl.incluiUsrCanal("canal", "daniel@email.com");
	    sl.incluiUsrCanal("canal", "arthur@email.com");
	    sl.mandarMsg("davi@email.com", "canal", "Olá Mundo");
	    sl.mandarMsg("daniel@email.com", "canal", "Olá");
	    sl.mandarMsg("arthur@email.com", "canal", "Como estão?");
	    sl.mandarMsg("davi@email.com", "canal", "Estou ótimo");
	    sl.mandarMsg("daniel@email.com", "canal", "também estou ótimo");
	    sl.mandarMsg("arthur@email.com", "canal", "Coisa boa");
	    System.out.println(sl.listarMsg("canal"));
	    System.out.println(sl.listarUsr("canal"));
	    sl.cadastraCanal(null);

	
	
	}
	
}
