package controllers.dtos;

public class AdvogadoDto {
	
	private String registro;
	private String cpf;
	private String nome;
	private String email;
	private String telefone;
	
	public AdvogadoDto() {}
	
	public AdvogadoDto(String nome, String email, String telefone, String cpf, String registro) {
		
		this.nome = nome;
		this.email =  email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.registro = registro;
		
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	
	
}
