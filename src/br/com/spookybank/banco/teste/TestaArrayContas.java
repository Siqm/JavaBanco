package br.com.spookybank.banco.teste;

import java.util.ArrayList;

import br.com.spookybank.banco.modelo.Conta;
import br.com.spookybank.banco.modelo.ContaCorrente;
import br.com.spookybank.banco.modelo.ContaPoupanca;
import br.com.spookybank.banco.modelo.GuardadorDeContas;

public class TestaArrayContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(132, 159);
		ContaPoupanca cp = new ContaPoupanca(11, 22);
		// O <> Serve para definir/limitar que tipo de Objeto eu terei dentro do array
		//<> São chamados de Generics
		ArrayList <Conta> al = new ArrayList <Conta> ();
		
		al.add(cc);
		al.add(cp);
		al.contains(cc);
		
		System.out.println(al.get(0)); 
		System.out.println(al.size());
		
//		for(int i = 0; i < lista.size(); i++) {
//      	Object oRef = lista.get(i);
//      	System.out.println(oRef);
		
		// For aprimorado usando uma sintaxe mais compacta
		for (Object oRef : al) {
			System.out.println(oRef);
        }
	}
	
}
