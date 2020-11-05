import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		String nomes = input.nextLine();
		String[] nomesArray = nomes.split("\\s");
		List<String> listaNomes = Arrays.asList(nomesArray);
		
		System.out.println("Lista com duplicatas: ");
		for(String nome : listaNomes) {
			System.out.print(nome + " ");
		}
		
		Set<String> setNomes = new HashSet<>(listaNomes);
		
		System.out.println("\nLista sem duplicatas: ");
		for(String nome : setNomes) {
			System.out.print(nome + " ");
		}
	}
}	
