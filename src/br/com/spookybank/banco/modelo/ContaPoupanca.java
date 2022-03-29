package br.com.spookybank.banco.modelo;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public void saca (double valor) {
		double valorASacar = valor * 0.02;
		super.saca(valorASacar);
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca " + super.toString();
	}

}
