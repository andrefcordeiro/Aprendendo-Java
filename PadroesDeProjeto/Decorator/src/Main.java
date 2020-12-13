import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a fruta a ser usada no suco: ");
		String nome = input.next();
		
		Suco s = new SucoBasico(nome);
		
		int op;
		
		do {
			System.out.println("\n-=-=-=-=-=--=-=--=-=--=-=--=-=--=-=--=-=--=-=--=-=-");
			System.out.println("ADICIONAIS: ");
			System.out.println("1 - Adicionar leite ao suco [ + R$ 1,00 ]");
			System.out.println("2 - Adicionar leite condensado ao suco [ + R$ 2,00 ]");
			System.out.println("3 - Finalizar");
			System.out.println("-=-=-=-=-=--=-=--=-=--=-=--=-=--=-=--=-=--=-=--=-=-\n");
			op = input.nextInt();
			
			switch(op) {
			
				case 1:
					s = new SucoDecoratorLeite(s);
					break;
				
				case 2:					
					s = new SucoDecoratorLeiteCondensado(s);
					break;
			}
			
		}while(op != 3);
		
	
		System.out.println(s.getNome());
		System.out.print("\nPreço final do suco: R$");
		System.out.println(s.getPreco());
	}

}
