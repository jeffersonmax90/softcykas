package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

public class Zona_cabecera_administrador extends Zona_cabecera_administrador_ventanas {
	/*
	 * private Imagen _perfil; public Perfil_administrador
	 * _unnamed_Perfil_administrador_; public Cambiar_imagen
	 * _unnamed_Cambiar_imagen_;
	 * 
	 * public void cambiar_imagen() { throw new UnsupportedOperationException(); }
	 */
	
	IAdministrador admin= new BD_Principal();
	
	public Zona_cabecera_administrador(){
		
		cargarImagen();
		
		this.cambiar_imagen.addClickListener(new Button.ClickListener() {		
		public void buttonClick(ClickEvent event) {				
			UI.getCurrent().getNavigator().navigateTo("Cambiar_imagen");
			}
		});
	
	}
	
	
	void cargarImagen() {
		Usuario_BD usuario=null;
		
		usuario= admin.cargarImagenAdministrador(Datos_Navegante.getIdUsuario());
		
		if(usuario.getMiniatura()==null){
			
		}else{
		imagen.setSource(new ExternalResource(usuario.getMiniatura()));
		}
	}
	
}