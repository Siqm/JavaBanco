package br.com.spookybank.banco.modelo;

public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
	}

	public double getBonificacao() {
		return this.getSalario() * 0.5;
	}

}
