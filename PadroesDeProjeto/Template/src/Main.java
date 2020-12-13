import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void printaMusicas(List<Object> musicas) {
		System.out.println("Musicas contidas na lista: ");		
		for(Object m : musicas) {
			
			System.out.println(((Musica)m).toString());		
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Object> musicas = new ArrayList<Object>();
		musicas.add(new Musica("teardrops", "bmth", "post human"));
		musicas.add(new Musica("levitate", "top", "trench"));
		musicas.add(new Musica("dear diary", "bmth", "post human"));
		
		printaMusicas(musicas);

//		OrdenadorPorArtista oa = new OrdenadorPorArtista();
//		musicas = oa.ordenaMusicas(musicas);
		
		OrdenadorPorNome on = new OrdenadorPorNome();
		musicas = on.ordenaMusicas(musicas);
		
		printaMusicas(musicas);
		
	}

}
