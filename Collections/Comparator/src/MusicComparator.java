import java.util.Comparator;

public class MusicComparator implements Comparator<Music> {
	
	//comparação recebe o tipo de comparacao a ser feita: por artista ou por titulo
	private String comparacao;
	
	public MusicComparator(String comparacao) {
		
		if(comparacao.compareTo("titulo") == 0) {
			this.comparacao = comparacao;
		}
		else if(comparacao.compareTo("artista") == 0) {
			this.comparacao = comparacao;
		}
		else {
			this.comparacao = "artista";
		}
	}
	
	@Override
	public int compare(Music m1, Music m2) {
		// TODO Auto-generated method stub
		
		if(this.comparacao.compareTo("titulo") == 0) { //compara pelo titulo
			return m1.getTitulo().compareTo(m2.getTitulo());
		}
		
		return m1.getArtista().compareTo(m2.getArtista()); //compara pelo artista
	
	}
	
}
