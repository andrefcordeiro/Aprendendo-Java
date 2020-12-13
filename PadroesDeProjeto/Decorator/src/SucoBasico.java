import java.math.BigDecimal;

public class SucoBasico implements Suco {
	
	private String nome; //fruta + adicionais
	
	public SucoBasico(String fruta) {
		this.nome = fruta;
	}
	
	public BigDecimal getPreco() {
		return new BigDecimal("3.00");
		
	}
	
	public String getNome() {
		return "Suco: " + this.nome;
	}
	
}
