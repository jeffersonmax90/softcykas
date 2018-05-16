package ventanas;


import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;


public class Registrarse extends Registrarse_ventanas {
	/*private JLabel _registrar_usuarioLB;
	public Iniciar_sesion _unnamed_Iniciar_sesion_;
	*/
	Usuario_Registrado_BD user= new Usuario_Registrado_BD();
	
	public Registrarse(){
		registrar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				enviarDatos();
			}
		});
			
		
	}

		void enviarDatos() {
		// TODO Auto-generated method stub
		user.setNombre(anadirDatos.nombre.getValue());
		user.setApellidos(anadirDatos.apellidos.getValue());
		user.setApodo(anadirDatos.apodo.getValue());
		user.setContraseña(anadirDatos.contrasena.getValue());
		user.setEmail(anadirDatos.correo.getValue());
		user.setN_visitas(0);
		user.setMiniatura(anadirDatos.seleccionarFoto.toString());
	}

	
	
}