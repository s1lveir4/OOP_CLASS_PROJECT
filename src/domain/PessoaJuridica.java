package domain;

import exceptions.CnpjException;
import exceptions.EmailException;
import exceptions.PessoaException;
import exceptions.PessoaJuridicaException;
import shared.Cnpj;
import utils.CnpjUtil;

public class PessoaJuridica extends Pessoa {
	
	private static final long serialVersionUID = -3025547871166772130L;
	
	private final Cnpj cnpj;
	private PessoaFisica preposto;
	
	public PessoaJuridica(String nome, String email, String telefone, String cnpj, PessoaFisica preposto) throws PessoaException, PessoaJuridicaException, EmailException, CnpjException {
		
		super(nome, email, telefone);
		
		if (!CnpjUtil.validaCnpj(cnpj)) {
			throw new PessoaJuridicaException("Insira um CNPJ válido.");
		}
		
		if (preposto == null) {
			throw new PessoaJuridicaException("Forneça um preposto válido.");
		}
		
		this.cnpj = new Cnpj(cnpj);
		this.preposto = preposto;
	}

	public Cnpj getCnpj() {
		return cnpj;
	}

	public PessoaFisica getPreposto() {
		return preposto;
	}

	public void setPreposto(PessoaFisica preposto) {
		this.preposto = preposto;
	}
	
	@Override	
	public String getCadastroRF() {
		
		return this.getCnpj().getCnpj();
	}
	
	@Override
	public String listaInformacoes() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nNOME: " + getNome() + " - " + "EMAIL: " + getEmail() + " - " + "TELEFONE: " + getTelefone());
		sb.append("\nCNPJ: " + getCnpj() + "\n");
		sb.append("\nPREPOSTO DA EMPRESA: " + getNome());
		sb.append(this.preposto.listaInformacoes());
		
		return sb.toString();
	}
	
}
