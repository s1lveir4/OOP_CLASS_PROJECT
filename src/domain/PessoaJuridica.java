package domain;

import exceptions.PessoaException;
import exceptions.PessoaJuridicaException;
import utils.CnpjUtil;

public class PessoaJuridica extends Pessoa {
	
	private final String cnpj;
	private PessoaFisica preposto;
	
	public PessoaJuridica(String nome, String email, String telefone, String cnpj, PessoaFisica preposto) throws PessoaException, PessoaJuridicaException {
		
		super(nome, email, telefone);
		
		if (!CnpjUtil.validaCnpj(cnpj)) {
			throw new PessoaJuridicaException("Insira um CNPJ válido.");
		}
		
		if (preposto == null) {
			throw new PessoaJuridicaException("Forneça um preposto válido.");
		}
		
		this.cnpj = cnpj;
		this.preposto = preposto;
	}

	public String getCnpj() {
		return cnpj;
	}

	public PessoaFisica getPreposto() {
		return preposto;
	}

	public void setPreposto(PessoaFisica preposto) {
		this.preposto = preposto;
	}
	
	public String getCadastroRF() {
		
		return this.getCnpj();
	}
	
	public String listaInformacoes() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nNOME: " + getNome() + " - " + "EMAIL: " + getEmail() + " - " + "TELEFONE: " + getTelefone());
		sb.append("\nCNPJ: " + getCnpj() + "\n");
		sb.append("\nPREPOSTO DA EMPRESA: " + getNome());
		sb.append(this.preposto.listaInformacoes());
		
		return sb.toString();
	}
	
}
