package controllers.dtos;

public class AudienciaDto {

	private String data;
	private String recomendacao;
	
	private String cpfAdvogado;
	private String nomeAdvogado;
	private String emailAdvogado;
	private String telefoneAdvogado;
	
	public AudienciaDto() {}

	public AudienciaDto(String data, String recomendacao, String cpfAdvogado, String nomeAdvogado, String emailAdvogado,
			String telefoneAdvogado) {	
		
		this.data = data;
		this.recomendacao = recomendacao;
		this.cpfAdvogado = cpfAdvogado;
		this.nomeAdvogado = nomeAdvogado;
		this.emailAdvogado = emailAdvogado;
		this.telefoneAdvogado = telefoneAdvogado;
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}

	public String getCpfAdvogado() {
		return cpfAdvogado;
	}

	public void setCpfAdvogado(String cpfAdvogado) {
		this.cpfAdvogado = cpfAdvogado;
	}

	public String getNomeAdvogado() {
		return nomeAdvogado;
	}

	public void setNomeAdvogado(String nomeAdvogado) {
		this.nomeAdvogado = nomeAdvogado;
	}

	public String getEmailAdvogado() {
		return emailAdvogado;
	}

	public void setEmailAdvogado(String emailAdvogado) {
		this.emailAdvogado = emailAdvogado;
	}

	public String getTelefoneAdvogado() {
		return telefoneAdvogado;
	}

	public void setTelefoneAdvogado(String telefoneAdvogado) {
		this.telefoneAdvogado = telefoneAdvogado;
	}
	
	
}
