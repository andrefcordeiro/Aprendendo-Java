
public class Main {
	
	public static void main(String args[]) {
		
		Porta c = new Porta();
		Morador m = new Morador();
		Papagaio p = new Papagaio();
		
		c.Attach(m); //adiciona um observador morador na lista de observadores da porta
		c.Attach(p); //adiciona um observador morador na lista de observadores da porta
		
		c.abrirPorta(); //abre a porta
	}
}
