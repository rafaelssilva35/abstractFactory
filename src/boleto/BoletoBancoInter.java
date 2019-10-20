package boleto;

import modelo.Produto;

public class BoletoBancoInter implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("Boleto banco INTER");
		System.out.println("##########################");
		System.out.println("produto " + produto.getNomeProduto());
		System.out.println("valor do produto  " + produto.getValorUnitario());
		System.out.println("imposto " + imposto);		
	}

}
