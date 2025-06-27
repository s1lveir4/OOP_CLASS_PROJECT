package domain;

import java.io.Serializable;
import java.util.Date;

import exceptions.DespesaException;

public class Despesa implements Serializable {

	private static final long serialVersionUID = -162989645580313912L;
	
	private final Date data;
	private final String descricao;
	private final double valor;

	public Despesa(Date data, String descricao, double valor) throws DespesaException {

		if (valor <= 0) {
			throw new DespesaException("O valor da despesa deve ser maior do que zero.");
		}

		if (data == null) {
			throw new DespesaException("Insira uma data válida");
		}

		if (descricao == null || descricao.isBlank() || descricao.isEmpty()) {
			throw new DespesaException("A despesa deve possuir uma descrição válida.");
		}

		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public String descricaoDespesa() {

		StringBuilder sb = new StringBuilder();

		sb.append("\nData: " + getData() + " - " + "VALOR: " + getValor());
		sb.append("\nDESCRIÇÃO: " + getDescricao());

		return sb.toString();
	}

}
