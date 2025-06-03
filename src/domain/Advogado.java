package domain;

import contracts.IPessoa;
import exceptions.AdvogadoException;

public class Advogado implements IPessoa {

	private final long registro;
	private final PessoaFisica pessoaFisica;

	public Advogado(PessoaFisica pessoaFisica, long registro) throws AdvogadoException {

		if (registro <= 0) {
			throw new AdvogadoException("Insira um registro válido.");
		}
		
		if (pessoaFisica == null) {
			throw new AdvogadoException("Insira um cadastro de pessoa válido.");
		}
		
		this.pessoaFisica = pessoaFisica;

		this.registro = registro;
	}

	public String getNome() {
		return pessoaFisica.getNome();
	}

	public String getEmail() {
		return pessoaFisica.getEmail();
	}

	public String getTelefone() {
		return pessoaFisica.getTelefone();
	}

	public String getCadastroRF() {
		return pessoaFisica.getCadastroRF();
	}

	public long getRegistro() {
		return registro;
	}

	public String listaInformacoes() {

		StringBuilder sb = new StringBuilder();

		sb.append("NOME: " + pessoaFisica.getNome() + " - " + "EMAIL: " + pessoaFisica.getEmail() + " - " + "TELEFONE: "
				+ pessoaFisica.getTelefone());
		sb.append("\nCPF: " + pessoaFisica.getCpf() + " - " + "REGISTRO: " + getRegistro());

		return sb.toString();
	}

}
