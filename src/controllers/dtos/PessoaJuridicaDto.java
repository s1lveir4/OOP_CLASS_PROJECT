package controllers.dtos;

public class PessoaJuridicaDto extends PessoaDto {

	private String cnpj;

	private String cpfPreposto;
	private String nomePreposto;
	private String emailPreposto;
	private String telefonePreposto;

	public PessoaJuridicaDto() {
	}

	public PessoaJuridicaDto(String nome, String email, String telefone, String cnpj, String cpfPreposto,
			String nomePreposto, String emailPreposto, String telefonePreposto) {
		
		super(nome, email, telefone);
		this.cnpj = cnpj;
		this.cpfPreposto = cpfPreposto;
		this.nomePreposto = nomePreposto;
		this.emailPreposto = emailPreposto;
		this.telefonePreposto = telefonePreposto;
	
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpfPreposto() {
		return cpfPreposto;
	}

	public void setCpfPreposto(String cpfPreposto) {
		this.cpfPreposto = cpfPreposto;
	}

	public String getNomePreposto() {
		return nomePreposto;
	}

	public void setNomePreposto(String nomePreposto) {
		this.nomePreposto = nomePreposto;
	}

	public String getEmailPreposto() {
		return emailPreposto;
	}

	public void setEmailPreposto(String emailPreposto) {
		this.emailPreposto = emailPreposto;
	}

	public String getTelefonePreposto() {
		return telefonePreposto;
	}

	public void setTelefonePreposto(String telefonePreposto) {
		this.telefonePreposto = telefonePreposto;
	}

}
