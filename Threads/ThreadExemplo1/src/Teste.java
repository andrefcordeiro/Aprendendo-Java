
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programa p1 = new Programa();
		p1.setId(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		Programa p2 = new Programa();
		p2.setId(2);
		
		try {
			t1.join(); /* fara o t2.start() ser executado somente quando t1.start() terminar*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		Thread t2 = new Thread(p2);
		t2.start();

	}

}
