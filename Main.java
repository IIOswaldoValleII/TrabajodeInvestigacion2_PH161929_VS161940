class Main {
  public static void main(String[] args) {

  	//La construccion no se permite porque Conexion es una clase private, para ahorrar memoria al hacer las conexiones
  	//Conexion c = new Conexion();
    Conexion c = Conexion.getInstancia();
		c.conectar();//Proceso para iniciar sesion
		c.desconectar();//Proceso para cerrar sesion
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
		//Imprime el valor del proceso que se esta realizando, si es True la conexion se cierra.
  }
}