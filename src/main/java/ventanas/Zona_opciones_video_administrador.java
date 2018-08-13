package ventanas;

import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_opciones_video_administrador extends Zona_opciones_video_administrador_ventanas {
	/*
	 * private Button _descargar_videoB; private Button _eliminar_videoB; public
	 * Ficha_administrador _unnamed_Ficha_administrador_; public
	 * Confirmar_eliminar_video _unnamed_Confirmar_eliminar_video_;
	 */
	
	IAdministrador usuAdministrador= new BD_Principal();
	public Zona_opciones_video_administrador(){
		
		descargar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				descargarVideo();
			}
		});
		
		eliminar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				eliminarVideoAdmin();
				
			}

		
		});
	}
	
	
	void descargarVideo() {
		Notification notification = new Notification("Copia el enlace que hay en la descripción", "", Notification.Type.HUMANIZED_MESSAGE);
		notification.setDelayMsec(2000);
	    notification.show(Page.getCurrent());	
    
		String url="http://www.descargaryoutube.com/";
		String osName = System.getProperty("os.name");
		try {
			 if (osName.startsWith("Windows")) {
	                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			 }
		} catch (Exception e) {
		}
		
	}
	void eliminarVideoAdmin() {
		boolean eliminado=false;
		
		eliminado= usuAdministrador.eliminarVideoAdmin(Datos_Navegante.getIdVideo());
		
				
		if(Boolean.TRUE.equals(eliminado)){
			Notification notification = new Notification("¡Se ha eliminado el video con éxito!", "", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
		}
		
	}
	
	
}