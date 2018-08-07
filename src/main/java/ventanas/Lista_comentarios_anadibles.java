package ventanas;

import java.util.List;

import com.vaadin.ui.Label;

public class Lista_comentarios_anadibles extends Lista_comentarios_anadibles_ventanas {
	IUsuario_registrado usuRegistrado = new BD_Principal();
	
	public Lista_comentarios_anadibles() {
		anadirComentarios();
		
	}
	
	void anadirComentarios() {
		form_comentarios.removeAllComponents();
		
		List<Comentario_BD> comentarios = usuRegistrado.anadirComentarios(Datos_Navegante.getIdVideo());
		if (comentarios == null || comentarios.size() == 0) {
			Label l = new Label();
			l.setValue("No existen comentarios en el video");
			form_comentarios.addComponent(l);
		}
	}
}