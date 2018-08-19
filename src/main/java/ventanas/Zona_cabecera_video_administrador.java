package ventanas;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_video_administrador extends Zona_cabecera_video_administrador_ventanas{
	/*
	 * private Button _perfil_administradorB; public Ficha_administrador
	 * _unnamed_Ficha_administrador_; public Perfil_administrador
	 * _unnamed_Perfil_administrador_;
	 */
	
	
	public Zona_cabecera_video_administrador(){
			
			logo.addClickListener(new ClickListener() {
				@Override
				public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
					UI.getCurrent().getNavigator().navigateTo("usuario_administrador");
				}
			});
			
			mi_perfil.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				}
			});
	}
}