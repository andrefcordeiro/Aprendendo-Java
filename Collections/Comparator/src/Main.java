import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	
	public static void buscaMusicaPorArtista(ArrayList<Music> musicas, String artista) {
		
		int index = Collections.binarySearch(musicas, new Music(" ", artista), new MusicComparator("artista"));
		Music m = musicas.get(index);
		System.out.println("\nDados da música: ");
		System.out.println("Titulo: " + m.getTitulo() + " Artista: " + m.getArtista() + "\n");
	}
	
	public static void buscaMusicaPorTitulo(ArrayList<Music> musicas, String titulo) {
		
		int index = Collections.binarySearch(musicas, new Music(titulo, " "), new MusicComparator("titulo"));
		Music m = musicas.get(index);
		System.out.println("\nDados da música: ");
		System.out.println("Titulo: " + m.getTitulo() + " Artista: " + m.getArtista() + "\n");
		
	}
	
	public static void ordenaMusicasPorArtista(ArrayList<Music> musicas) {
		
		Collections.sort(musicas, new MusicComparator("artista"));
	}
	
	public static void ordenaMusicasPorTitulo(ArrayList<Music> musicas) {
		
		Collections.sort(musicas, new MusicComparator("titulo"));
	}
	
	
	public static void main(String[] args) {
		ArrayList<Music> musicas = new ArrayList<>();
		
		Music m1 = new Music("teardrops", "bmth");
		Music m2 = new Music("morph", "top");
		Music m3 = new Music("presença", "hoteoeira");
		Music m4 = new Music("deusexmachina", "fresno");
		musicas.add(m1);
		musicas.add(m2);
		musicas.add(m3);
		musicas.add(m4);
		
		Scanner input = new Scanner(System.in);
		int op = 0;
		String comparacao;
		
		do {
			System.out.println("1 - Ordenar as músicas por título ");
			System.out.println("2 - Ordenar as músicas por artista ");
			System.out.println("3 - Buscar música por título ");
			System.out.println("4 - Buscar música por artista ");
			System.out.println("5 - Embaralhar lista de músicas ");
			System.out.println("6 - Printar lista ");
			System.out.println("-1 - Encerrar programa ");
			
			op = input.nextInt();
			
			switch(op) {
				
				case 1:
					ordenaMusicasPorTitulo(musicas);
					break;
					
				case 2:
					ordenaMusicasPorArtista(musicas);
					break;
					
				case 3:
					ordenaMusicasPorTitulo(musicas);
					System.out.println("Informe o título da música: ");
					comparacao = input.next();
					buscaMusicaPorTitulo(musicas, comparacao);
					break;
					
					
				case 4:
					ordenaMusicasPorArtista(musicas);
					System.out.println("Informe o artista da música: ");
					comparacao = input.next();
					buscaMusicaPorArtista(musicas, comparacao);
					break;
					
					
				case 5:
					Collections.shuffle(musicas);
					break;
					
				case 6:
					System.out.println("---------------------------------------------");
					for(Music musica : musicas) {
						System.out.println("Titulo: '" + musica.getTitulo() + "' Artista: '" + musica.getArtista() + "'");
					}
					System.out.println("---------------------------------------------");
					break;
					
				case -1:
					break;
			}
			
			
		}while(op != -1);
		
		
	}

}
