package ventanas;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;

public class Main {

	public static void main(String[] args) {
		
		//Registrar un Usuario registrado
		/*
		Usuario_Registrado_BD user = new Usuario_Registrado_BD();
		user.setNombre("Dennys");
		user.setApellidos("tomala");
		user.setApodo("Lol");
		user.setContraseña("123");
		user.setEmail("denny@dennys");
		user.setTipoUsuario("Registrado");
		user.setN_visitas(0);
		user.setMiniatura("");
		user.setFecha_nacimiento(null);
		
		BD_Principal bd= new BD_Principal();
		bd.registrarUsuario(user);
		System.out.println(bd.registrarUsuario(user));
		*/
		
		
		//Iniciar sesion
		/*
		IUsuario_no_registrado noRegistrado = new BD_Principal();
		String email="admin@admin";
		String contraseña="123";
		
		Usuario_BD usuario = noRegistrado.iniciarSesion(email, contraseña);
		
		System.out.println(usuario.getTipoUsuario());
		*/
		
		IUsuario_no_registrado usuR= new BD_Principal();
		IAdministrador ia= new BD_Principal();
		IUsuario_registrado usu= new BD_Principal();
		Video_BD v= new Video_BD();
		int aId=1;
		String aComentario="primer comentario";
		Datos_Navegante.setIdUsuario(1);
		Datos_Navegante.setTipoUsuario("Administrador");
		
		boolean lista= usu.deshabilitarComentariosVideosPropios(aId);
		/*for (Comentario_BD video_BD : lista) {
			System.out.println( video_BD.getId() +" "+video_BD.getMensaje());
		}*/
		System.out.println( lista);

	}

}
