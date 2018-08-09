package ventanas;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_comentarios_deshabilitables extends Lista_comentarios_deshabilitables_ventanas {
	IUsuario_registrado usuRegistrado = new BD_Principal();

	public Lista_comentarios_deshabilitables() {
		anadirComentarios();

		// Falta implementar
		deshabilitar_comentarios.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			
			}
		});
	}

	void anadirComentarios() {
		form_comentarios.removeAllComponents();

		List<Comentario_BD> comentarios = usuRegistrado.anadirComentarios(Datos_Navegante.getIdVideo());
		if (comentarios == null || comentarios.size() == 0) {
			Label l = new Label();
			l.setValue("No existen comentarios en el video");
			form_comentarios.addComponent(l);
		}

		for (int i = 0; i < comentarios.size(); i++) {
			form_comentarios.addComponent(new Comentario(comentarios.get(i)));
		}
	}
}