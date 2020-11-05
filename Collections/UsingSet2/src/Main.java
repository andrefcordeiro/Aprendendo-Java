import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite uma frase: ");
		
		Scanner input = new Scanner(System.in);
		String frase = input.nextLine();
		frase = frase.replaceAll("\\p{Punct}", "");
		frase.toLowerCase();
		
		String[] palavrasFrase = frase.split("\\s+");
		List<String> listaPalavras = Arrays.asList(palavrasFrase);
		
		
		System.out.println("Lista com duplicatas: ");
		System.out.print(listaPalavras);

		Set<String> setFrase = new HashSet<>(listaPalavras);
		
		System.out.println("\n\nLista sem duplicatas: ");
		System.out.print(setFrase);
		
		System.out.printf("\n\nQuantidade de palavras duplicadas: %d", listaPalavras.size() - setFrase.size());

	}

}
