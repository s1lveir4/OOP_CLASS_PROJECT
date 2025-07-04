package domain;

import java.io.Serializable;

import contracts.IPessoa;
import exceptions.EmailException;
import exceptions.PessoaException;
import shared.Email;

public abstract class Pessoa implements IPessoa, Serializable {

	private static final long serialVersionUID = -631559883794721892L;

	private String nome;
	private Email email;
	private String telefone;

	public Pessoa(String nome, String email, String telefone) throws PessoaException, EmailException {

		if (nome == null || nome.isBlank() || nome.isEmpty()) {
			throw new PessoaException("Insira um nome válido.");
		}

		if (telefone == null || telefone.isBlank() || telefone.isEmpty()) {
			throw new PessoaException("Insira um telefone válido.");
		}

		this.nome = nome;
		this.email = new Email(email);
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email.getEmailAddress();
	}

	public void setEmail(String email) throws EmailException{
		this.email = new Email(email);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public abstract String getCadastroRF();


}
