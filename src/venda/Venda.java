package venda;

import boleto.Boleto;
import modelo.Produto;
import nfe.NFE;

public class Venda {

	private NFE notaFiscal;
	private Boleto boleto;
	
	public Venda(VendaFactory vendaFactory) {
		this.notaFiscal = vendaFactory.criarNFE();
		this.boleto = vendaFactory.criarBoleto();
	}
	
	public void realizarVenda(Produto produto)
	{
		double imposto = notaFiscal.calculaImposto(produto);
		boleto.emitir(produto, imposto);
		
	}
}
