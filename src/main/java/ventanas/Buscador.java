package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import java.util.List;

public class Buscador extends Buscador_ventanas implements View {
	IUsuario_no_registrado usuNoRegistrado = new BD_Principal();

	public Buscador() {
		this.formLista.removeAllComponents();
		if (Datos_Navegante.getTipoBusqueda().equals("Videos")) {
			buscarVideos();
		} else if (Datos_Navegante.getTipoBusqueda().equals("Usuarios")) {
			buscarUsuarios();
		}
	}

	void buscarVideos() {
		List<Video_BD> lista = usuNoRegistrado.buscarVideos(Datos_Navegante.getBusqueda());
		formLista.removeAllComponents();
		if (lista == null || lista.size() == 0) {
			Label l = new Label();
			l.setValue("No hay videos que coincidan con la búsqueda");
			formLista.addComponent(l);
		}
		for (int i = 0; i < lista.size(); i++) {
			formLista.addComponent(new Video(lista.get(i)));
		}
	}

	void buscarUsuarios() {
		List<Usuario_Registrado_BD> lista = usuNoRegistrado.buscarUsuarios(Datos_Navegante.getBusqueda());
		formLista.removeAllComponents();
		if (lista == null || lista.size() == 0) {
			Label l = new Label();
			l.setValue("No existen usuarios que coincidan con la búsqueda");
			formLista.addComponent(l);
		}
		for (int i = 0; i < lista.size(); i++) {
			formLista.addComponent(new Usuario(lista.get(i)));
		}
	}
}
