package controllers.dtos;

public class PessoaJuridicaDto {

	private String cnpj;
	private String nome;
	private String email;
	private String telefone;

	private String cpfPreposto;
	private String nomePreposto;
	private String emailPreposto;
	private String telefonePreposto;

	public PessoaJuridicaDto() {}

	public PessoaJuridicaDto(String cnpj, String nome, String email, String telefone, String cpfPreposto,
			String nomePreposto, String emailPreposto, String telefonePreposto) {
		
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
