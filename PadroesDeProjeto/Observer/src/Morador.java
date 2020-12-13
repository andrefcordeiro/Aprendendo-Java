
public class Morador implements Observer{

	private String portaAberta;
	private String nome;
	
	/* método executado sempre que o estado do subject que esta classe observa for setado*/
	@Override
	public void update(Subject s) {
		Porta porta = (Porta) s;
		if(porta.isPortaAberta()) {
			System.out.println("Morador percebeu que a porta abriu");
		}
	}

}
