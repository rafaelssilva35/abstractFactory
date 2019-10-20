package principal;

import java.math.BigDecimal;

import loja.LojaFapi;
import modelo.Produto;
import venda.Venda;
import venda.VendaFactory;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		
		produto.setNomeProduto("Notebook DELL");
		produto.setQuantidadeProduto(1);
		produto.setValorUnitario(new BigDecimal(2900));
		
		VendaFactory vendaFactory = new LojaFapi();
		
		Venda venda = new Venda(vendaFactory);
		venda.realizarVenda(produto);
	}

}
