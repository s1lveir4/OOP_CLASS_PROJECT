package exceptions;

public class DespesaException extends Exception {

	private static final long serialVersionUID = 3960560162415478583L;

	public DespesaException(String message) {
		super("Despesa Exception: " + message);
	}
	
}
