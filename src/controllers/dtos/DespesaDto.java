package controllers.dtos;

import java.util.Date;

public class DespesaDto {

	private Date data;
	private String descricao;
	private double valor;
	
	public DespesaDto() {}
	
	public DespesaDto(Date data, String descricao, double valor) {
		
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
