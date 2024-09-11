
public class Filaa {

	private static Filaa instancia;
	
	private Filaa() {}
	
	public static Filaa getInstancia(){
		if(instancia == null) {
			instancia = new Filaa();
	}
		return instancia;
	}


public void ImprimeDocumento() {}
public void RemoveDocumento( ) {}
public void RemoveTodosDocumentos( ) {}
}