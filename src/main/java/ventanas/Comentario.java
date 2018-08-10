package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Comentario extends Comentario_ventanas {

	IAdministrador usuario_administrador = new BD_Principal();
	IUsuario_registrado usuario_registrado = new BD_Principal();
	int n;
	private int idAutor;

	public Comentario(Comentario_BD comentario_BD) {
		this.comentario.setCaption(comentario_BD.getMensaje());
		this.imagen_perfil_comentario.setSource(new ExternalResource(comentario_BD.getUsuario().getMiniatura()));
		this.perfil_usuario.setCaption(comentario_BD.getUsuario().getApodo());

		perfil_usuario.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				int idvisitante = comentario_BD.getUsuario().getId();
				Datos_Navegante.setIdPerfilvistante(idvisitante);
				if (Datos_Navegante.getIdUsuario() != idvisitante)
					UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
			}
		});

		// Boton eliminar; en caso de no ser propietario del comentario, ni usuario
		// propietario del video ni administrador se elimina el botón.
		if (Datos_Navegante.getIdUsuario() != Datos_Navegante.getIdPropietario()
				&& comentario_BD.getUsuario().getId() != Datos_Navegante.getIdUsuario()
				&& !Datos_Navegante.getTipoUsuario().equals("Administrador"))
			this.eliminar_comentario.setVisible(false);
		else
			this.eliminar_comentario.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					n = comentario_BD.getId();
					idAutor = comentario_BD.getUsuario().getId();
					if (Datos_Navegante.getTipoUsuario().equals("Registrado"))
						eliminarComentario();
					else
						eliminarComentarioAdmin();
				}
			});
	}

	void eliminarComentario() {
		boolean eliminado = usuario_registrado.eliminarComentario(n);
		if (Datos_Navegante.getIdUsuario() == idAutor)
			UI.getCurrent().getNavigator().navigateTo("Ficha_registrado");
		else
			UI.getCurrent().getNavigator().navigateTo("Ficha_propietario");
	}

	void eliminarComentarioAdmin() {
		boolean eliminado = usuario_administrador.eliminarComentarioAdmin(n);
		UI.getCurrent().getNavigator().navigateTo("Ficha_administrador");
	}
}
