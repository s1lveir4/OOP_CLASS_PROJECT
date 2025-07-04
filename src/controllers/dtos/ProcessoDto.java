package controllers.dtos;

import java.util.Date;

public class ProcessoDto {
	
	private String numero;
	private Date dataAbertura;
	private String fase;
	
	private String cadastroRfCliente;
	private String cadastroRfParteContraria;
	private String siglaTribunal;

	
	private ProcessoDto() {}


	public ProcessoDto(String numero, Date dataAbertura, String fase, String cadastroRfCliente,
			String cadastroRfParteContraria, String siglaTribunal) {
		super();
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.fase = fase;
		this.cadastroRfCliente = cadastroRfCliente;
		this.cadastroRfParteContraria = cadastroRfParteContraria;
		this.siglaTribunal = siglaTribunal;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Date getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}


	public String getFase() {
		return fase;
	}


	public void setFase(String fase) {
		this.fase = fase;
	}


	public String getCadastroRfCliente() {
		return cadastroRfCliente;
	}


	public void setCadastroRfCliente(String cadastroRfCliente) {
		this.cadastroRfCliente = cadastroRfCliente;
	}


	public String getCadastroRfParteContraria() {
		return cadastroRfParteContraria;
	}


	public void setCadastroRfParteContraria(String cadastroRfParteContraria) {
		this.cadastroRfParteContraria = cadastroRfParteContraria;
	}


	public String getSiglaTribunal() {
		return siglaTribunal;
	}


	public void setSiglaTribunal(String siglaTribunal) {
		this.siglaTribunal = siglaTribunal;
	}

	
	
}
