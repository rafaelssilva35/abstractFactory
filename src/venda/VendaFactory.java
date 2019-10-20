package venda;

import boleto.Boleto;
import nfe.NFE;

public interface VendaFactory {
	
	public NFE criarNFE();
	public Boleto criarBoleto();
	
}
