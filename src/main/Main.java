package main;

import java.util.Date;

import domain.Advogado;
import domain.Pessoa;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Processo;
import domain.Tribunal;
import enumerations.EFaseProcesso;
import exceptions.AdvogadoException;
import exceptions.AudienciaException;
import exceptions.DespesaException;
import exceptions.PessoaException;
import exceptions.PessoaFisicaException;
import exceptions.PessoaJuridicaException;
import exceptions.ProcessoException;
import exceptions.TribunalException;

// PEDRO HENRIQUE FARIAS SILVEIRA

public class Main {

	public static void main(String[] args) {

		// PESSOAS
		Pessoa p1 = null;
		try {
			p1 = new PessoaFisica("Antonio", "antonio@exemplo.com", "24977654534", "84789654611");
		} catch (PessoaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PessoaFisicaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pessoa p5 = null;
		try {
			p5 = new PessoaFisica("Bruno", "bruno@exemplo.com", "24977654534", "72681973662");
		} catch (PessoaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PessoaFisicaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Pessoa p2 = null;
		try {
			p2 = new PessoaJuridica("Empresa Fantasia LTDA", "emailcomercial@empresafantasialtda",  "2497760709", "9857162787000184", ((PessoaFisica) p5));
		} catch (PessoaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PessoaJuridicaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Advogado p3 = null;
		try {
			p3 = new Advogado(new PessoaFisica("Maria", "maria@exemplo.com", "24977378193", "82873774853"), 18264785471L);
		} catch (AdvogadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PessoaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PessoaFisicaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Advogado p4 = null;
		try {
			p4 = new Advogado(new PessoaFisica("Carlos", "carlos@exemplo.com", "24966451787", "98578901723"), 76498162709L);
		} catch (AdvogadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PessoaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PessoaFisicaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TRIBUNAIS
		Tribunal tr1 = null;
		try {
			tr1 = new Tribunal("MTR", "Primeira Vara do Trablho", "Quarta Seção");
		} catch (TribunalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Processo pr1 = null;
		try {
			pr1 = new Processo(48682737173L, new Date(), EFaseProcesso.INSTRUCAO, p1, p2, tr1);
		} catch (ProcessoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pr1.addAudiencia(new Date(), "Ser pontual.", ((Advogado) p3));
		} catch (AudienciaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr1.addAudiencia(new Date(), "Trazer as evidências.", ((Advogado) p4));
		} catch (AudienciaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr1.addDespesa(new Date(), "Hospedagem na cidade da audiência", 399.99);
		} catch (DespesaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pr1.addDespesa(new Date(), "Hospedagem na cidade da audiência", 399.99);
		} catch (DespesaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(pr1.toString());
		System.out.println(pr1.getAudiencias());
		System.out.println(pr1.getCustas());
		

	}

}
