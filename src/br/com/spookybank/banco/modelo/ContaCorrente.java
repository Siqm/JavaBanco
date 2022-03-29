package br.com.spookybank.banco.modelo;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor){
	    super.saldo += valor;
	}
	
	@Override
	public void saca (double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public String toString() {
		return "ContaCorrente " + super.toString();
	}
}



