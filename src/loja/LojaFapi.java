package loja;

import boleto.Boleto;
import boleto.BoletoBancoInter;
import nfe.NFE;
import nfe.NFEParana;
import venda.VendaFactory;

public class LojaFapi implements VendaFactory{

	@Override
	public NFE criarNFE() {
		NFE nfe = new NFEParana();
		return nfe;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoBancoInter();
		return boleto;
	}

}
