package exceptions;

public class AdvogadoException extends Exception {

	private static final long serialVersionUID = 4431742686354776425L;

	public AdvogadoException(String message) {
		super("Advogado Exception: " + message);
	}
	
}
