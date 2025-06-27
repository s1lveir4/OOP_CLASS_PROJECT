package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import enumerations.EFaseProcesso;
import exceptions.AudienciaException;
import exceptions.DespesaException;
import exceptions.ProcessoException;

public class Processo implements Serializable {

	private static final long serialVersionUID = -127104746683406190L;
	
	private final long numero;
	private final Date dataAbertura;
	private EFaseProcesso fase;
	
	private Pessoa cliente;
	private Pessoa parteContraria;
	private Tribunal tribunal;
	
	private ArrayList<Audiencia> audiencias = new ArrayList<>();
	private ArrayList<Despesa> custas = new ArrayList<>();
	
	public Processo(long numero, Date dataAbertura, EFaseProcesso fase, Pessoa cliente, Pessoa parteContraria,
					Tribunal tribunal) throws ProcessoException{
		
		if (numero <= 0) {
			throw new ProcessoException("O numero do processo deve ser maior que zero.");
		}
		
		if (dataAbertura == null) {
			throw new ProcessoException("Insira uma data válida.");
		}
		
		if (fase == null) {
			throw new ProcessoException("Forneça uma fase válida para o processo.");
		}
		
		if (cliente == null) {
			throw new ProcessoException("Forneça um cliente válido para o processo");
		}
		
		if (parteContraria == null) {
			throw new ProcessoException("Forneça uma parte contrária válida para o processo.");
		}
		
		if (tribunal == null) {
			throw new ProcessoException("Forneça um tribunal válido para o processo.");
		}
		
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.fase = fase;
		this.cliente = cliente;
		this.parteContraria = parteContraria;
		this.tribunal = tribunal;
	}
	
	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Pessoa getParteContraria() {
		return parteContraria;
	}

	public void setParteContraria(Pessoa parteContraria) {
		this.parteContraria = parteContraria;
	}


	public EFaseProcesso getFase() {
		return fase;
	}

	public void setFase(EFaseProcesso fase) {
		this.fase = fase;
	}

	public String getAudiencias() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nAUDIENCIAS DO PROCESSO " + getNumero() + ":\n");
		
		for (Audiencia a : audiencias) {
			
			sb.append("------------------------------------------------");
			sb.append(a.listaInformacoes());
			sb.append("\n------------------------------------------------\n");
			
		}
		
		return sb.toString();
		
	}
	
	public void addAudiencia(Date data, String recomendacao, Advogado advogado) throws AudienciaException {
		
		this.audiencias.add(new Audiencia(data, recomendacao, advogado));
	}

	public String getCustas() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nCUSTAS DO PROCESSO " + getNumero() + ":\n");
		
		for (Despesa d : custas) {
			
			sb.append("------------------------------------------------");
			sb.append(d.descricaoDespesa());
			sb.append("\n------------------------------------------------\n");
			
		}
		
		return sb.toString();
		
	}

	public void addDespesa(Date data, String descricao, double valor) throws DespesaException{
		
		this.custas.add(new Despesa(data, descricao, valor));
	}
	
	public long getNumero() {
		return numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("=============================================================\n");
		sb.append("NUMERO DO PROCESSO: " + getNumero());
		sb.append("\nFASE: " + getFase());
		sb.append("\nCLIENTE:");
		sb.append(this.cliente.listaInformacoes());
		sb.append("\nPARTE CONTRÁRIA:");
		sb.append(this.parteContraria.listaInformacoes());
		sb.append("\nTRIBUNAL:");
		sb.append(this.tribunal.listaInformacoes());
		sb.append("\n=============================================================");
		
		return sb.toString();
	}
	
	
	
}
