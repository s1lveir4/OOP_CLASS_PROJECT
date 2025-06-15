package domain;

import exceptions.TribunalException;

public class Tribunal {

	private final String sigla;
	private final String descricao;
	private final String secao;

	public Tribunal(String sigla, String descricao, String secao) throws TribunalException {

		// TODO fazer a verificacao da sigla usando regex
		if (sigla == null || sigla.isBlank() || sigla.isEmpty()) {
			throw new TribunalException("Insira uma sigla válida.");
		}

		// TODO fazer a verificacao da descricao usando regex
		if (descricao == null || descricao.isBlank() || descricao.isEmpty()) {
			throw new TribunalException("Insira uma descricao válida.");
		}

		// TODO fazer a verificacao da descricao usando regex
		if (secao == null || secao.isBlank() || secao.isEmpty()) {
			throw new TribunalException("Insira uma secao válida.");
		}

		this.sigla = sigla;
		this.descricao = descricao;
		this.secao = secao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSecao() {
		return secao;
	}

	public StringBuilder listaInformacoes() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nSIGLA: " + getSigla() + " - " + "SECAO: " + getSecao());
		sb.append("\nDESCRIÇÃO: " + getDescricao());

		return sb;
	}

}
