import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Funcionario func1 = new Funcionario("Nome1",1500.00);
		Funcionario func2 = new Funcionario("Nome2", 1650.00);
		
		Funcionario.setVale(10);
		
		System.out.println("func1: " +  func1.getNome());
		System.out.println(func1.getVale());
		System.out.println("func2: " + func2.getNome());
		System.out.println(func2.getVale());
		
		Funcionario.setVale(11);
		
		System.out.println("func1: " +  func1.getNome());
		System.out.println(func1.getVale());
		System.out.println("func2: " + func2.getNome());
		System.out.println(func2.getVale());
		
	}
	
}
