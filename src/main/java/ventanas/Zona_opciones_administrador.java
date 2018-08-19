package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_opciones_administrador extends Zona_opciones_administrador_ventanas {
	public Zona_opciones_administrador() {
		this.crear_categorias.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Crear_categoria");
			}
		});

		this.lista_usuarios.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Lista_de_usuarios_registrados");
			}
		});

		this.lista_videos.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Lista_total_videos_subidos");
			}
		});
		this.volveAtras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("usuario_administrador");
			}
		});

		this.cerrar_sesion.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setTipoUsuario("Invitado");
				Datos_Navegante.setIdUsuario(-1);
				Datos_Navegante.setIdVideo(-1);
				Datos_Navegante.setIdListaReproducion(-1);
				UI.getCurrent().getNavigator().navigateTo("");
			}
		});
	}
}
