
public class Papagaio implements Observer {

	@Override
	public void update(Subject s) {
		Porta porta = (Porta) s;
		if(porta.isPortaAberta()) {
			System.out.println("Papagaio grita ap�s a porta abrir");
		}

	}

}
