
public class OrdenadorPorNome extends Ordenador {

	@Override
	public int comparaMusica(Musica m1, Musica m2) {
		int valor = m1.getNome().compareTo(m2.getNome());
		
		if(valor < 0)
			return -1;
		
		if (valor > 0)
			return 1;
		
		return valor;
	}

}
