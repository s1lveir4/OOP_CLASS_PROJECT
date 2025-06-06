package domain;

import java.util.Date;

import exceptions.DespesaExcption;

public class Despesa {
	
	private final Date data;
	private final String descricao;
	private final double valor;
	
	public Despesa(Date data, String descricao, double valor) throws DespesaExcption{
		
		if (valor <= 0) {
			throw new DespesaExcption("O valor da despesa deve ser maior do que zero.");
		}
		
		if (data == null) {
			throw new DespesaExcption("Insira uma data válida");
		}
		
		if (descricao == null || descricao.isBlank() || descricao.isEmpty()) {
			throw new DespesaExcption("A despesa deve possuir uma descrição válida.");
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
