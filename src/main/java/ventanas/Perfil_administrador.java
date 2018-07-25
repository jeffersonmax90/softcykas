package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Perfil_administrador extends Perfil_administrador_ventanas implements View{
	/*
	 * public Zona_inicio_cabecera_administrador
	 * _unnamed_Zona_inicio_cabecera_administrador_; public
	 * Zona_cabecera_video_administrador
	 * _unnamed_Zona_cabecera_video_administrador_; public
	 * Zona_cabecera_administrador _unnamed_Zona_cabecera_administrador_; public
	 * Zona_opciones_administrador _unnamed_Zona_opciones_administrador_;
	 */
	
	IAdministrador admin= new BD_Principal();
	
	public Perfil_administrador(){
		cargarImagen();
		
		zcav.cambiar_imagen.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("Cambiar_imagen");
				}
			});
		
		zoav.crear_categorias.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("Crear_categoria");
				}
			});
		
		zoav.lista_usuarios.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("Lista_de_usuarios_registrados");
				}
			});
		
		zoav.lista_videos.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("Lista_total_videos_subidos");
				}
			});
		zoav.volveAtras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("usuario_administrador");
				}
			});
		
		zoav.cerrar_sesion.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("");
				}
			});
		
		
		
	}

	 void cargarImagen() {
		Usuario_BD usuario=null;
		usuario= admin.cargarImagenAdministrador(Datos_Navegante.getIdUsuario());
		zcav.imagen.setSource(new ExternalResource(usuario.getMiniatura()));
		}
	
}