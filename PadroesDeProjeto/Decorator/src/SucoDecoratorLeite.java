import java.math.BigDecimal;

public class SucoDecoratorLeite extends SucoDecorator {

	public SucoDecoratorLeite(Suco suco) {
		super(suco);
	}

	@Override
	public BigDecimal getPreco() {
		Suco s = super.getSuco();
		
		return s.getPreco().add(new BigDecimal("1.00"));
		
	}

	@Override
	public String getNome() {
		Suco s = super.getSuco();
		
		return s.getNome() + " + Leite";
	}

}
