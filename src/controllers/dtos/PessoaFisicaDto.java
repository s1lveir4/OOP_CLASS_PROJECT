package controllers.dtos;

public class PessoaFisicaDto extends PessoaDto {

	private String cpf;

	public PessoaFisicaDto() {}

	public PessoaFisicaDto(String nome, String email, String telefone, String cpf) {
		super(nome, email, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
