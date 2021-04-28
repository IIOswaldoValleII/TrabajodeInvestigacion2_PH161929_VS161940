public class Conexion {
	

	private static Conexion instancia;
	//private static Conexion instancia = new Conexion();
	

	private Conexion() {
		
	}
	
	//Para obtener la instancia unicamente por este metodo
	
	//Creacion de GetInstancia() para uso de cualquier usuario sin crear uno solo por usuario

	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}

	
	//Método de prueba de conexion
	public void conectar() {
		System.out.println("Me conecté a la BD");
	}
	
	//Método de prueba de desconexion
	public void desconectar() {
		System.out.println("Me desconecté de la BD");
	}

}
