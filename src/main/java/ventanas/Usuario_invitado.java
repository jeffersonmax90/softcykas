package ventanas;

import com.vaadin.navigator.View;

public class Usuario_invitado extends Usuario_invitado_ventanas implements View {
	Zona_inicio_cabecera_invitado zi = new Zona_inicio_cabecera_invitado();
	Zona_inicio_comun zc = new Zona_inicio_comun();

	public Usuario_invitado() {
		vertical.removeAllComponents();
		vertical.addComponent(zi);
		vertical.addComponent(zc);
	}
}