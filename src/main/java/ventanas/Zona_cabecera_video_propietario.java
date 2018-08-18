package ventanas;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_video_propietario extends Zona_cabecera_video_propietario_ventanas {
	public Zona_cabecera_video_propietario() {
		logo.setSource(new ExternalResource(
				"https://raw.githubusercontent.com/jeffersonmax90/softcykas/master/src/main/resources/images/logo.png"));
		logo.addClickListener(new ClickListener() {
			@Override
			public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
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