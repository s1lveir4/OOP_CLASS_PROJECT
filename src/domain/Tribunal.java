package domain;

import java.io.Serializable;

import exceptions.TribunalException;

public class Tribunal implements Serializable {

	private static final long serialVersionUID = 8328235635187663056L;
	
	private final String sigla;
	private  String nome;
	private  String secao;

	public Tribunal(String sigla, String nome, String secao) throws TribunalException {

		// TODO fazer a verificacao da sigla usando regex
		if (sigla == null || sigla.isBlank() || sigla.isEmpty()) {
			throw new TribunalException("Insira uma sigla válida.");
		}

		// TODO fazer a verificacao da descricao usando regex
		if (nome == null || nome.isBlank() || nome.isEmpty()) {
			throw new TribunalException("Insira uma nome válido.");
		}

		// TODO fazer a verificacao da descricao usando regex
		if (secao == null || secao.isBlank() || secao.isEmpty()) {
			throw new TribunalException("Insira uma secao válida.");
		}

		this.sigla = sigla;
		this.nome = nome;
		this.secao = secao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getSecao() {
		return secao;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public StringBuilder listaInformacoes() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nSIGLA: " + getSigla() + " - " + "SECAO: " + getSecao());
		sb.append("\nNome: " + getNome());

		return sb;
	}

}
