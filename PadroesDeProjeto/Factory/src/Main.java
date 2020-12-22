
public class Main {

	public static void main(String[] args) {
		
		Pizzaria p1 = new Pizzaria1();
		Pizza mussarela = p1.fazerPizza();
		mussarela.abrirMassa();
		mussarela.adicionarMolho();
		mussarela.adicionarIngredientes();
		mussarela.assar();
		mussarela.cortar();
		System.out.println("Pizza de mussarela entregue!!\n");
		
		Pizzaria p2 = new Pizzaria2();
		Pizza calabresa = p2.fazerPizza();
		calabresa.abrirMassa();
		calabresa.adicionarMolho();
		calabresa.adicionarIngredientes();
		calabresa.assar();
		calabresa.cortar();
		System.out.println("Pizza de calabresa entregue!!\n");

	}

}
