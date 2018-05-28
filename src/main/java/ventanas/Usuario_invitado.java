package ventanas;

import com.example.softcykas.MyUI;
import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

public class Usuario_invitado extends Usuario_invitado_ventanas implements View {
	/*
	 * public Zona_inicio_cabecera_invitado _unnamed_Zona_inicio_cabecera_invitado_;
	 * public Zona_inicio_cuerpo_invitado _unnamed_Zona_inicio_cuerpo_invitado_;
	 */

	public Usuario_invitado() {
		cabecera.iniciar_sesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
	}

}