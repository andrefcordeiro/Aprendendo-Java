
public class Pizzaria2 extends Pizzaria {

	/* faz pizza de mussarela */
	
	@Override
	public Pizza fazerPizza() {
		Pizza p = new PizzaMussarela();
		
		return p;
	}

}
