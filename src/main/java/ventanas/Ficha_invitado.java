package ventanas;

import com.vaadin.navigator.View;

public class Ficha_invitado extends Ficha_invitado_ventanas implements View {
	Zona_cabecera_video_invitado zc = new Zona_cabecera_video_invitado();
	Ficha_video fv = new Ficha_video();

	public Ficha_invitado() {
		vertical.removeAllComponents();
		vertical.addComponent(zc);
		vertical.addComponent(fv);
	}
}