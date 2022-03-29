package br.com.spookybank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException {
	
	public SaldoInsuficienteException (String msg) {
		super (msg);
	}
}
