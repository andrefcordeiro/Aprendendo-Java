import java.math.BigDecimal;

public class SucoDecoratorLeiteCondensado extends SucoDecorator {

	public SucoDecoratorLeiteCondensado(Suco suco) {
		super(suco);
	}

	@Override
	public BigDecimal getPreco() {
		Suco s = super.getSuco();
		
		return s.getPreco().add(new BigDecimal("2.00"));
		
	}

	@Override
	public String getNome() {
		Suco s = super.getSuco();
		
		return s.getNome() + " + Leite condensado";
	}

}
