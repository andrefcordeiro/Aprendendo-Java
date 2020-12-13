
public class OrdenadorPorArtista extends Ordenador {
	
	@Override
	public int comparaMusica(Musica m1, Musica m2) {
		int valor = m1.getArtista().compareTo(m2.getArtista());
		
		if(valor < 0)
			return -1;
		
		if (valor > 0)
			return 1;
		
		return valor;
	
	}

}
