package br.com.spookybank.banco.modelo;

public abstract interface Autenticavel {

	void setSenha(int senha);

    boolean autentica(int senha);
}
