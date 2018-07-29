package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_video_propietario extends Zona_cabecera_video_propietario_ventanas {
	/*
	 * private Image _logo; private Botton _perfilB; public Ficha_propietario
	 * _unnamed_Ficha_propietario_; public Perfil_registrado
	 * _unnamed_Perfil_registrado_;
	 */
	
	
	public Zona_cabecera_video_propietario(){
		
		logo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("usuario_registrado");
			}
		});
		
		mi_perfil.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});
		
		
	}
}