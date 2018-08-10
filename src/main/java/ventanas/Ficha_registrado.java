package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Ficha_registrado extends Ficha_registrado_ventanas implements View {
	/*
	 * public Video _unnamed_Video_; public Zona_comentarios_video_registrado
	 * _unnamed_Zona_comentarios_video_registrado_; public
	 * Zona_opciones_video_registrado _unnamed_Zona_opciones_video_registrado_;
	 * public Zona_cabecera_video_registrados
	 * _unnamed_Zona_cabecera_video_registrado_;
	 */

	Zona_cabecera_video_registrado zc = new Zona_cabecera_video_registrado();
	Zona_opciones_video_registrado zopc = new Zona_opciones_video_registrado();
	Lista_comentarios_anadibles lcomen = new Lista_comentarios_anadibles();
	Ficha_video fvi = new Ficha_video();

	public Ficha_registrado() {
		vertical.removeAllComponents();
		vertical.addComponent(zc);
		horizontal.removeAllComponents();
		horizontal.addComponent(fvi);
		horizontal.addComponent(zopc);
		verti2.removeAllComponents();
		verti2.addComponent(lcomen);
	}

}
