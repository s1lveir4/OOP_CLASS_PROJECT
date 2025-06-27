package domain;

import contracts.IPessoa;
import exceptions.PessoaException;
import exceptions.PessoaFisicaException;
import utils.CpfUtil;

public class PessoaFisica extends Pessoa implements IPessoa {

	private static final long serialVersionUID = 6797012348199170294L;

	private final String cpf;

	public PessoaFisica(String nome, String email, String telefone, String cpf) throws PessoaException, PessoaFisicaException{

		super(nome, email, telefone);
		
		if (!CpfUtil.validaCpf(cpf)) {
			throw new PessoaFisicaException("Insira um CPF válido.");
		}
		
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String getCadastroRF() {

		return this.getCpf();
	}

	@Override
	public String listaInformacoes() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nNOME: " + getNome() + " - " + "EMAIL: " + getEmail() + " - " + "TELEFONE: " + getTelefone());
		sb.append("\nCPF: " + getCpf() + "\n");

		return sb.toString();
	}

}
