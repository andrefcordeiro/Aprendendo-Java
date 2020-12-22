
public abstract class Pizza {
	
	public void abrirMassa() {
		System.out.println("Abrindo massa...");
	}
	
	public void assar() {
		System.out.println("Assando a pizza...");
	}
	
	public void cortar() {
		System.out.println("Cortando a pizza...");
	}
	
	public abstract void adicionarMolho();
	
	public abstract void adicionarIngredientes();
}
