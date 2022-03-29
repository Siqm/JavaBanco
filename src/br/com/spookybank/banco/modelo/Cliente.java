package br.com.spookybank.banco.modelo;

/**
 * Está classe representa um cliente
 * 
 * @author Rafael Siq
 *
 */
public class Cliente implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	private String nome;
	private String cpf;
	private String profissao;	
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Cliente () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}