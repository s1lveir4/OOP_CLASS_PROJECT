package exceptions;

public class PessoaFisicaException extends Exception {

	private static final long serialVersionUID = -5513377916462229440L;

	public PessoaFisicaException(String message) {
		super("Pessoa Fisica Exception" + message);
	}
	
}
