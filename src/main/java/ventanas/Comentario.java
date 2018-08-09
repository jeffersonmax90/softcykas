package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Comentario extends Comentario_ventanas {
	public Comentario(Comentario_BD comentario_BD) {
		IAdministrador usuario_administrador = new BD_Principal();
		IUsuario_registrado usuario_registrado = new BD_Principal();

		this.comentario.setCaption(comentario_BD.getMensaje());
		this.perfil_usuario.setCaption(comentario_BD.getUsuario().getApodo());

		// Boton eliminar; en caso de no ser propietario del comentario, ni usuario
		// propietario del video ni administrador se elimina el botón.
		if ((Datos_Navegante.getIdUsuario() != Datos_Navegante.getIdPropietario()
				&& comentario_BD.getUsuario().getId() != Datos_Navegante.getIdUsuario())
				|| Datos_Navegante.getTipoUsuario().equals("Invitado"))
			this.eliminar_comentario.setEnabled(false);
		else
			this.eliminar_comentario.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					int n = comentario_BD.getId();

					if (Datos_Navegante.getTipoUsuario().equals("Registrado"))
						usuario_registrado.eliminarComentario(n);
					else
						usuario_administrador.eliminarComentarioAdmin(n);
				}
			});
	}
}
