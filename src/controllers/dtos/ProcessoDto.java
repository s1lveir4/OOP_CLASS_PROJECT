package controllers.dtos;

import java.util.ArrayList;
import java.util.Date;

public class ProcessoDto {
	
	private long numero;
	private Date dataAbertura;
	private String fase;
	
	private PessoaDto cliente;
	private PessoaDto parteContraria;
	private TribunalDto tribunal;
	
	private ArrayList<AudienciaDto> audiencias = new ArrayList<>();
	private ArrayList<DespesaDto> custas = new ArrayList<>();
	
	private ProcessoDto() {}
	
	public ProcessoDto(long numero, Date dataAbertura, String fase, PessoaDto cliente, PessoaDto parteContraria,
			TribunalDto tribunal) {

		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.fase = fase;
		this.cliente = cliente;
		this.parteContraria = parteContraria;
		this.tribunal = tribunal;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
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

	public PessoaDto getCliente() {
		return cliente;
	}

	public void setCliente(PessoaDto cliente) {
		this.cliente = cliente;
	}

	public PessoaDto getParteContraria() {
		return parteContraria;
	}

	public void setParteContraria(PessoaDto parteContraria) {
		this.parteContraria = parteContraria;
	}

	public TribunalDto getTribunal() {
		return tribunal;
	}

	public void setTribunal(TribunalDto tribunal) {
		this.tribunal = tribunal;
	}
	
	public void addAudiencia(AudienciaDto audiencia) {
		this.audiencias.add(audiencia);
	}
	
	public void addCusta(DespesaDto custa) {
		this.custas.add(custa);
	}
}
