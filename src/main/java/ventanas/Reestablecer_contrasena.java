package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
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
						UI.getCurrent().getNavigator().navigateTo("logIn");
					}
				}
			}
		});
	}
}