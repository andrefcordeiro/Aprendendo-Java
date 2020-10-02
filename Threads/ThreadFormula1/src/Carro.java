import java.util.Random;

public class Carro implements Runnable {

	private String nome;
	private int tempoTotal;
	
	public Carro(String nome) {
		this.nome = nome;
		tempoTotal = 0;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		int tempoVolta;
		
		for(int i=1; i<=65; i++) {
			System.out.println("Carro: " + this.nome + " Volta: " + i);
			tempoVolta = r.nextInt(1000);
			this.tempoTotal = tempoTotal + tempoVolta;
			
			try {
				Thread.sleep(tempoVolta);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public int getTempoTotal() {
		return this.tempoTotal;
	}

}
