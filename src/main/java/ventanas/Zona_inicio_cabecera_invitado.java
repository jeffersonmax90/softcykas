package ventanas;

import com.example.softcykas.MyUI;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_inicio_cabecera_invitado extends Zona_inicio_cabecera_invitado_ventanas implements View {
	public Zona_inicio_cabecera_invitado() {
		iniciar_sesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
	}
}
