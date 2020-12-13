
public class Musica {
	
	private String nome;
	private String artista;
	private String album;
	
	
	public Musica(String nome, String artista, String album) {
		this.nome = nome;
		this.artista = artista;
		this.album = album;
		
	}
	
	public String toString() {
		return "Nome: " + this.nome + " | Artista: " + artista + " | Album: " + album; 
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}


}
