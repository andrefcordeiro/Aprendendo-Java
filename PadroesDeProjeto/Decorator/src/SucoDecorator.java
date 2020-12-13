import java.math.BigDecimal;

public abstract class SucoDecorator implements Suco{
	
	private Suco suco;
	
	public SucoDecorator(Suco suco) {
		this.suco = suco;
	}
	
	public Suco getSuco() {
		return this.suco;
	}
	
	public abstract BigDecimal getPreco();
	
	public abstract String getNome();

}