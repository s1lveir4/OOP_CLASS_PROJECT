package shared;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.CpfException;

public class Cpf {
	
	private final String cpf;
	private final String validator = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/";
	
	public Cpf(String cpf) throws CpfException {
		
		if (validateCpf(cpf)) {
			this.cpf = cpf;
		}
		else {
			throw new CpfException("Cnpj inválido");
		}
	}
	
	public boolean validateCpf(String cpf) {
		
		Pattern p = Pattern.compile(this.validator);
		Matcher m = p.matcher(cpf);
		
		if (m.matches()) {
			return true;
		}
		
		return false;
	}

	public String getCpf() {
		return cpf;
	}
}
