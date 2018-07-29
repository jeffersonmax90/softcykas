package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_opciones_video_administrador extends Zona_opciones_video_administrador_ventanas {
	/*
	 * private Button _descargar_videoB; private Button _eliminar_videoB; public
	 * Ficha_administrador _unnamed_Ficha_administrador_; public
	 * Confirmar_eliminar_video _unnamed_Confirmar_eliminar_video_;
	 */
	
	
	public Zona_opciones_video_administrador(){
		
		descargar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
		
		eliminar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_lista");
			}
		});
	}
}