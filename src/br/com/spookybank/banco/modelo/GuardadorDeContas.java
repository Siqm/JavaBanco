package br.com.spookybank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicao;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicao = 0;
	}
	
	public void adiciona (Conta ref) {
		this.referencias[posicao] = ref;
		this.posicao++;
	}
	
	public int getLength () {
		return this.posicao;
	}
	
	public Conta getReferencia (int index) {
		return this.referencias[index];
	}

}
