package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;



public class Modificar_datos extends Modificar_datos_ventanas  implements View{
	
	/*private JLabel _modificar_datosLB;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	*/
	Usuario_Registrado_BD usu= new Usuario_Registrado_BD();
	IUsuario_registrado usuario_registrado= new BD_Principal();
	
	
	
	public Modificar_datos(){
		cargarModificarDatos();
				
		atras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
		
		modificarDatos.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				modificarDatos();
				}
			});
	
	
	}
	
	
		void cargarModificarDatos() {
		usu=  usuario_registrado.cargarModificarDatos(Datos_Navegante.getIdUsuario());
		datosUsuario.nombre.setValue(usu.getNombre());
		datosUsuario.apellidos.setValue(usu.getApellidos());
		datosUsuario.apodo.setValue(usu.getApodo());
		datosUsuario.correo.setValue(usu.getEmail());
		datosUsuario.contrasena.setVisible(false);//setValue(usu.getContraseña());
		datosUsuario.repContrasena.setVisible(false);//setValue(usu.getContraseña());		
		datosUsuario.urlPhoto.setValue(usu.getMiniatura());
		
		}
	
		void modificarDatos() {
		boolean modificado= false;
		usu.setNombre(datosUsuario.nombre.getValue());	
		usu.setApellidos(datosUsuario.apellidos.getValue());
		usu.setApodo(datosUsuario.apodo.getValue());
		usu.setContraseña(datosUsuario.contrasena.getValue());
		usu.setEmail(datosUsuario.correo.getValue());
		usu.setMiniatura(datosUsuario.urlPhoto.getValue());
		
		
		modificado=	usuario_registrado.modificarDatos(usu);
		if(modificado== true){
		Notification notification = new Notification("Correcto", "Se ha modificado correctamente", Notification.Type.HUMANIZED_MESSAGE);
		notification.setDelayMsec(2000);
		notification.show(Page.getCurrent());	
		UI.getCurrent().getNavigator().navigateTo("perfil_registrado");		
		}
		}
		 
		 
}