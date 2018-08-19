package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Cambiar_contrasena extends Cambiar_contrasena_ventanas implements View {
	IUsuario_registrado usuario_registrado = new BD_Principal();

	public Cambiar_contrasena() {

		atras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

		cambiarContrasena.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {

				cambiarContrasena();

			}
		});
	}

	void cambiarContrasena() {
		boolean cambiado = false;
		if (contrasena_nueva.getValue().equals(repetir_contrasena.getValue())) {

			cambiado = usuario_registrado.cambiarcontrasena(contrasena_nueva.getValue(), contrasena_actual.getValue(),
					repetir_contrasena.getValue());

			if (Boolean.TRUE.equals(cambiado)) {
				Notification notification = new Notification("Correcto", "Se ha cambiado correctamente",
						Notification.Type.HUMANIZED_MESSAGE);
				notification.setDelayMsec(2000);
				notification.show(Page.getCurrent());
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			} else {
				Notification notification = new Notification("Incorrecto", "La contraseña no coincide",
						Notification.Type.ERROR_MESSAGE);
				notification.setDelayMsec(2000);
				notification.show(Page.getCurrent());
			}
		} else {
			Notification notification = new Notification("Incorrecto", "La contraseña no coincide",
					Notification.Type.ERROR_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
		}

	}

}