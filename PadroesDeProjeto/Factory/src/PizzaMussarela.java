
public class PizzaMussarela extends Pizza {

	@Override
	public void adicionarMolho() {
		System.out.println("Adicionando molho da pizza de mussarela...");

	}

	@Override
	public void adicionarIngredientes() {
		
		System.out.print("Adicionando os seguintes ingredientes na pizza de mussarela: ");
		System.out.println("mussarela, tomate, orégano");
	}	

}
