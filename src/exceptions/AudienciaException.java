package exceptions;

public class AudienciaException extends Exception {
	
	private static final long serialVersionUID = -8986220631168372021L;
	
	public AudienciaException(String message) {
		super("Audiencia Exception: " + message);
	}

}
