package ventanas;

public class Lista_usuarios extends Lista_usuarios_ventanas {

	
	
	public Lista_usuarios(Usuario_Registrado_BD usuario){
		
		vertical.removeAllComponents();
		Usuario usu= new Usuario(usuario);
		vertical.addComponent(usu);
		
		
		
		
	}
}
