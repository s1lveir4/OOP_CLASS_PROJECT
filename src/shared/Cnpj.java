package shared;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.CnpjException;

public class Cnpj implements Serializable {
	
	private static final long serialVersionUID = -5453903433421581426L;
	
	private final String cnpj;
	private final String validator = "^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$";
	
	public Cnpj(String cnpj) throws CnpjException {
		
		if (validateCnpj(cnpj)) {
			this.cnpj = cnpj;
		}
		else {
			throw new CnpjException("Cnpj inválido");
		}
	}
	
	public boolean validateCnpj(String cnpj) {
		
		Pattern p = Pattern.compile(this.validator);
		Matcher m = p.matcher(cnpj);
		
		if (m.matches()) {
			return true;
		}
		
		return false;
	}

	public String getCnpj() {
		return cnpj;
	}
}
