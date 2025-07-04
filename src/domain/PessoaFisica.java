package domain;

import contracts.IPessoa;
import exceptions.CpfException;
import exceptions.EmailException;
import exceptions.PessoaException;
import shared.Cpf;

public class PessoaFisica extends Pessoa implements IPessoa {

	private static final long serialVersionUID = 6797012348199170294L;

	private final Cpf cpf;

	public PessoaFisica(String nome, String email, String telefone, String cpf) throws PessoaException, CpfException, EmailException {

		super(nome, email, telefone);
		
		this.cpf = new Cpf(cpf);
		
	}

	public Cpf getCpf() {
		return cpf;
	}

	@Override
	public String getCadastroRF() {

		return this.getCpf().getCpf();
	}

	@Override
	public String listaInformacoes() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nNOME: " + getNome() + " - " + "EMAIL: " + getEmail() + " - " + "TELEFONE: " + getTelefone());
		sb.append("\nCPF: " + getCpf() + "\n");

		return sb.toString();
	}

}
