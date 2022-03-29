package br.com.spookybank.banco.teste;

import br.com.spookybank.banco.modelo.*;

public class TestaReferencias {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		EditorVideo ev = new EditorVideo();
		Designer d = new Designer();
		
		g.setSalario(4000);
		ev.setSalario(2000);
		d.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
		
		String num = "12";
		int teste = Integer.parseInt(num);
		System.out.println(teste);
		
		
	}
}
