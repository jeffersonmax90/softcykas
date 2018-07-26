package ventanas;

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
		
		
		IUsuario_registrado usu= new BD_Principal();
		//Usuario_Registrado_BD u= usu.cargarModificarDatos(1);
		
		Video_BD  video= new Video_BD(); 
		Categoria_BD categoria1= new Categoria_BD();
		categoria1.setEdad("+3");
		categoria1.setNombre("baile");
		
		video.setTitulo("video1");
		
		video.setEtiqueta("etiqueta1");
		video.setRuta("ruta1");
		video.setCategoria_BD(categoria1);
		video.setMiniatura("miniatura1");
		video.setDescripcion("descripcion1");
		video.setVisualizaciones(0);
		
		boolean correcto= false;
		
		correcto=usu.subirVideo(video);
		System.out.println(Datos_Navegante.getIdUsuario());
		System.out.println(correcto);			
		
	}

}
