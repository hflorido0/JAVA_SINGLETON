package manager;
import java.util.ArrayList;

public class Manager {
	private static Manager manager;
	private ArrayList<Object> objetos;

	private Manager () {
		this.objetos = new ArrayList<>();
	}
	
	public static Manager getInstance() {
		if (manager == null) {
			manager = new Manager();
		}
		return manager;
	}

	public void init() {
		//TODO: aquí va el código
	}
	
}
