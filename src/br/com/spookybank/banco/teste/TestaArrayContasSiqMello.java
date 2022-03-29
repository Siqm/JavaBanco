package br.com.spookybank.banco.teste;

import java.util.ArrayList;

import br.com.spookybank.banco.modelo.Conta;
import br.com.spookybank.banco.modelo.ContaCorrente;
import br.com.spookybank.banco.modelo.ContaPoupanca;
import br.com.spookybank.banco.modelo.GuardadorDeContas;

public class TestaArrayContasSiqMello {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(132, 159);
		ContaPoupanca cp = new ContaPoupanca(11, 22);
		// O <> Serve para definir/limitar que tipo de Objeto eu terei dentro do array
		//<> São chamados de Generics
		ArrayList <Conta> listaContas = new ArrayList <Conta> ();
		
		listaContas.add(cc);
		listaContas.add(cp);
		listaContas.contains(cc);
		
		System.out.println(listaContas.get(0)); 
		System.out.println(listaContas.size());
		
		ContaCorrente cc2 = new ContaCorrente(132, 159);
		
		
		//sobreescrevi o método .equals() na classe Conta para comparar a agencia e número das contas
		System.out.println(listaContas.contains(cc2));
		
//		for(int i = 0; i < lista.size(); i++) {
//      	Object oRef = lista.get(i);
//      	System.out.println(oRef);
		
		// For aprimorado usando uma sintaxe mais compacta
		for (Object oRef : listaContas) {
			System.out.println(oRef);
        }
		
		
		
	}
	
}
