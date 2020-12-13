import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Ordenador {
	
	public int partition(Object vetor[], int inicio, int fim)
	{
	    Object pivot = vetor[fim];
	    int i = inicio;
	    Object aux;

	    for (int j = inicio; j < fim; j++)
	    {
//	        if (vetor[j] <= pivot)
	    	if (this.comparaMusica((Musica)vetor[j], (Musica)pivot) != 1)
	        {
	            aux = vetor[j];
	            vetor[j] = vetor[i];
	            vetor[i] = aux;
	            i = i + 1;
	        }
	    }

	    aux = vetor[i];
	    vetor[i] = vetor[fim];
	    vetor[fim] = aux;

	    return i;
	}
	
	public void quickSort(Object vetor[], int inicio, int fim) {
		int p;
		
		 if (inicio < fim)
		    {
		        p = this.partition(vetor, inicio, fim);
		        quickSort(vetor, inicio, p - 1);
		        quickSort(vetor, p + 1, fim);  
		    }
	}
	
	public List<Object> ordenaMusicas(List<Object> musicas) {
		
		Object[] arrayCopy = musicas.toArray();
		quickSort(arrayCopy, 0, arrayCopy.length-1);

		return Arrays.asList(arrayCopy);
		
	}
	
	public abstract int comparaMusica(Musica m1, Musica m2);
}
