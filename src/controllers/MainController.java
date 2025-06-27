package controllers;

import java.io.Serializable;

import persistence.Serializer;

/* 
 * Design Pattern Singleton 
 */
public class MainController implements Serializable {

	private static final long serialVersionUID = 3326741752317644589L;

	private static MainController instance;
	
	//TODO private TribunalController tribunalController;

	// declarar os demais controladores

	
	private MainController() {
		
		//TODO tribunalController = new TribunalController();
		
		// instanciar os demais controladores
		
	}

	public static MainController getInstance() {
		return instance;
	}

	/*TODO
	public static TribunalController getTribunalController() {
		return instance.tribunalController;
	}*/

	// implementar metodos acessadores estaticos para os demais controladores
	
	
	public static void load() {

		instance = Serializer.readFile();

		if (instance == null) {
			instance = new MainController();
		}
	}

	public static void save() {
		Serializer.writeFile(instance);
	}
}
