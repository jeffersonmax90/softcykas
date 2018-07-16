package ventanas;

public class Main {

	public static void main(String[] args) {
		
		Usuario_Registrado_BD user = new Usuario_Registrado_BD();
		user.setNombre("Dennys");
		user.setApellidos("tomala");
		user.setApodo("Lol");
		user.setContraseña("123");
		user.setEmail("denny@dennys");
		user.setN_visitas(0);
		user.setMiniatura("");
		user.setFecha_nacimiento(null);
		
		BD_Principal bd= new BD_Principal();
		bd.registrarUsuario(user);
		System.out.println(bd.registrarUsuario(user));
	}

}
