package exceptions;

public class PessoaJuridicaException extends Exception {

	private static final long serialVersionUID = 8731637414009536851L;

	public PessoaJuridicaException(String message) {
		super("Pessoa Juridica Exception: " + message);
	}
	
}
