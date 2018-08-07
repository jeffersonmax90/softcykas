package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Comentario extends Comentario_ventanas {
	public Comentario(Comentario_BD comentario_BD) {

		this.comentario.setCaption(comentario_BD.getMensaje());
		this.perfil_usuario.setCaption(comentario_BD.getUsuario().getApodo());

		// Boton eliminar
		this.eliminar_comentario.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				int n = comentario_BD.getId();
				// Completar cuando esté arreglada la tabla de comentarios de la BD.
			}
		});
	}
}
