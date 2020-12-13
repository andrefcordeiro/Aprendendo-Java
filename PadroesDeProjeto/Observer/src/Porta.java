import java.util.HashSet;
import java.util.Set;

public class Porta implements Subject{

	Set<Observer> observadores = new HashSet<Observer>();
	private boolean portaAberta = false;
	
	/* adiciona um observador na conjunto (Set) de observadores */
	@Override
	public void Attach(Observer o) {
		observadores.add(o);
		
	}
	
	/* remove um observador na conjunto (Set) de observadores */
	@Override
	public void Detach(Observer o) {
		observadores.remove(o);
		
	}
	
	/* notifica todos os observadores dentro do conjunto caso a porta tenha sido aberta */
	@Override
	public void Notify() {
		
		if(this.portaAberta) {
			
		for(Observer observ : this.observadores) {
			observ.update(this);
		}
		}
	}
	
	/* retorna o estado da porta */
	public boolean isPortaAberta() {
		return this.portaAberta;
	}
	
	/* abre a porta, setando o atributo portaAberta como true e invocando o método Notify */
	public void abrirPorta() {
		this.portaAberta = true;
		this.Notify();
	}
}
