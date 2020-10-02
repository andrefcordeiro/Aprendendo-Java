
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Carro felipe = new Carro("Felipe");
		Carro lewis = new Carro("Lewis");
		
		Thread tf = new Thread(felipe);
		tf.start();
		
		Thread tl = new Thread(lewis);
		tl.start();

		
		tl.join();
		tf.join();
	
		
		if(felipe.getTempoTotal() < lewis.getTempoTotal()) {
			System.out.println("Felipe foi o vencedor!");
		}
		else if(felipe.getTempoTotal() > lewis.getTempoTotal()) {
			System.out.println("Lewis foi o vencedor!");
		}
		else {
			System.out.println("Empate!");
		}
	}

}
