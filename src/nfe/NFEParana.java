package nfe;

import java.math.BigDecimal;

import modelo.Produto;

public class NFEParana implements NFE {

	@Override
	public double calculaImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.13");
		
		imposto = imposto.multiply(produto.getValorUnitario());
		return imposto.doubleValue();
	}

}
