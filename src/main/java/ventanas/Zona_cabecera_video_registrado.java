package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_video_registrado extends Zona_cabecera_video_registrado_ventanas {
	/*
	 * private Image _logoI; private Button _perfiB; public Ficha_registrado
	 * _unnamed_Ficha_registrado_; public Perfil_registrado
	 * _unnamed_Perfil_registrado_;
	 */
	
	public Zona_cabecera_video_registrado(){
		
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