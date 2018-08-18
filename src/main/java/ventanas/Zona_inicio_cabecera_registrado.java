package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_inicio_cabecera_registrado extends Zona_inicio_cabecera_registrado_ventanas  {
	public Zona_inicio_cabecera_registrado() {
		
		mi_perfil.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});
		
		cerrar_sesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setTipoUsuario("Invitado");
				Datos_Navegante.setIdUsuario(-1);
				Datos_Navegante.setIdVideo(-1);
				Datos_Navegante.setIdListaReproducion(-1);	
				UI.getCurrent().getNavigator().navigateTo("");
			}
		});
	}
	
	
}