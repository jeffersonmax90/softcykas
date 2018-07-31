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
		/*
		BD_Categorias noRegistrado = new BD_Categorias();
		List<Categoria_BD> cat = null;
		
			try {
				cat = noRegistrado.listarCategorias();
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
		for (int i = 0; i < cat.size(); i++) {
			System.out.println(cat.get(i).toString()+cat.get(i).getNombre()+cat.get(i).getEdad());
		}
		*/
		
		
	
		
		//Usuario_Registrado_BD u= usu.cargarModificarDatos(1);
		/*
		List<Video_BD> video= new ArrayList<Video_BD>();
		
		video= usu.cargarVideosPropios(9);
		for (Video_BD video_BD : video) {
			System.out.println(video_BD.getId()+" "+ video_BD.getTitulo()+ " "
		);
		}
		*/
		
		/*
		Video_BD video=new Video_BD();
		video= usuR.cargarModificarVideo(2);
		System.out.println(video.getId()+" "+video.getTitulo()+ " "+video.getCategoria_BD());
		
		System.out.println("modificacion");
		video.setTitulo("video2222");
		video.setEtiqueta("etiqueta222");
		video.setRuta("222");
		video.setMiniatura("222");
		video.setDescripcion("2222");
		Categoria_BD cat= new Categoria_BD();
		
		cat.setEdad("+6");
		cat.setNombre("futbol");
		
		video.setCategoria_BD(cat);
		
	
		boolean modificado= usuR.modificarVideo(video);
		System.out.println(video.getId()+" "+video.getTitulo()+ " "+video.getCategoria_BD());
		System.out.println(modificado);
		*/
		
		IUsuario_no_registrado usuR= new BD_Principal();
		IAdministrador ia= new BD_Principal();
		IUsuario_registrado usu= new BD_Principal();
		int aId=9;
		List<Lista_reproduccion_BD> lista= usu.cargarListasReproduccionPropias(aId);
		
		for (Lista_reproduccion_BD video_BD : lista) {
			System.out.println( video_BD.getId() +" "+video_BD.getNombre());
		}
		
	}

}
