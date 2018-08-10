package ventanas;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_comentarios_anadibles extends Lista_comentarios_anadibles_ventanas {
	IUsuario_registrado usuRegistrado = new BD_Principal();

	public Lista_comentarios_anadibles() {
		form_comentarios.removeAllComponents();

		cargarListaComentariosRegistrado();

		anadir.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				anadirComentario();

			}
		});
		
		if(Datos_Navegante.getTipoUsuario().equals("Administrador")){
			anadir_comentario.setVisible(false);
			horizontalLayout.removeAllComponents();
		}
		

	}

	void cargarListaComentariosRegistrado() {
		form_comentarios.removeAllComponents();
		List<Comentario_BD> comentarios = usuRegistrado.cargarListaComentariosRegistrado(Datos_Navegante.getIdVideo());
		if (comentarios == null || comentarios.size() == 0) {
			Label l = new Label();
			l.setValue("No existen comentarios en el video");
			form_comentarios.addComponent(l);
		}
		for (int i = 0; i < comentarios.size(); i++) {
			form_comentarios.addComponent(new Comentario(comentarios.get(i)));
		}

	}

	void anadirComentario() {
		String aComentario = this.comentario.getValue();
		boolean comentarios = usuRegistrado.anadirComentario(Datos_Navegante.getIdVideo(), aComentario);
		this.comentario.clear();
		cargarListaComentariosRegistrado();
		
	}
}
