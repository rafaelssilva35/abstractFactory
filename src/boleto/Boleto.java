package boleto;

import modelo.Produto;

public interface Boleto {
	public void emitir(Produto produto, double imposto);
}
