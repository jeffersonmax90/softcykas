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

	Zona_inicio_cabecera_invitado zi = new Zona_inicio_cabecera_invitado();
	Zona_inicio_comun zc = new Zona_inicio_comun();

	public Usuario_invitado() {

		vertical.removeAllComponents();
		vertical.addComponent(zi);
		vertical.addComponent(zc);
	}

}