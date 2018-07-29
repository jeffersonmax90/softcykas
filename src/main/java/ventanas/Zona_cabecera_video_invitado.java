package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_video_invitado extends Zona_cabecera_video_invitado_ventanas {
	/*private Button _iniciar_sesionB;
	private Image _logoI;
	public Ficha_invitado _unnamed_Ficha_invitado_;
	public Iniciar_sesion _unnamed_Iniciar_sesion_;*/
	
	
	public Zona_cabecera_video_invitado(){
		
		logo.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("");
			}
		});
		
		iniciar_sesion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
		
		
	}
	
	
	
}