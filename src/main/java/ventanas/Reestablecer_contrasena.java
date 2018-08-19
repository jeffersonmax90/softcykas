package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Reestablecer_contrasena extends Reestablecer_contrasena_ventanas implements View {
	IUsuario_no_registrado nr;

	public Reestablecer_contrasena() {
		nr = new BD_Principal();
		
		
		cambiarContrasena.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				if (contrasena1.getValue().equals(contrasena2.getValue())) {
					if (nr.cambiarContasena(codigo_enviado.getValue(), contrasena1.getValue())) {
						Notification notification = new Notification("Se ha cambiado Correctamente", "Puedes Cerrar la ventana",
								Notification.Type.HUMANIZED_MESSAGE);
						notification.setDelayMsec(2000);
						notification.show(Page.getCurrent());
						UI.getCurrent().getNavigator().navigateTo("logIn");
					}
				}
			}
		});
		
		
		
		atras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
		
	}
}