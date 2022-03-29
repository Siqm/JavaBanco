package br.com.spookybank.banco.teste;

import br.com.spookybank.banco.modelo.ContaCorrente;
import br.com.spookybank.banco.modelo.ContaPoupanca;
import br.com.spookybank.banco.modelo.SaldoInsuficienteException;

public class TestaContas {
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(19, 24653);
		cc.deposita(200);
		
		ContaPoupanca cp = new ContaPoupanca (222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: "+ cc.getSaldo());
		System.out.println("CP: "+ cp.getSaldo());
		
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);

		System.out.println(nome);
		System.out.println(cc);
		System.out.println(cp);
	}
}
