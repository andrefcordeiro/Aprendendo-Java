
public class Funcionario {
	
	private String nome;
	private double sal;
	public static int vale;
	
	public Funcionario(String nome, double sal) {
		this.nome = nome;
		this.sal = sal;
		
	}
	
	public static void setVale(int valor) {
		vale = valor;
		
	}
	
	public int getVale() {
		return vale;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getNome() {
		
		return nome;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public double getSal() {
		
		return sal;
	}
}
