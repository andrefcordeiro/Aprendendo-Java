
public enum TrafficLight {
	
	RED(10, "vermelho"),
	GREEN(20,"verde"),
	YELLOW(30,"amarelo");
	
	private final int duracaoLuz;
	private final String nome;
	
	TrafficLight(int duracaoLuz, String nome){
		this.duracaoLuz = duracaoLuz;
		this.nome = nome;
	}
	
	public int getDuracaoLuz() {
		
		return duracaoLuz;
	}
	 
	public String getNome() {
		
		return nome;
	}
}
