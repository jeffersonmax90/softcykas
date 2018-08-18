package ventanas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Cabecera_buscador extends Cabecera_buscador_ventanas {
	public Cabecera_buscador() {
		inicializar();

		buscar.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setBusqueda(buscarTF.getValue());
				if (titulo.getSelectedItem().equals("")) {
					UI.getCurrent().getNavigator().navigateTo("usuario_invitado");
				} else if (Datos_Navegante.getTipoBusqueda().equals("Elige Busqueda")) {
					UI.getCurrent().getNavigator().navigateTo("");
				} else {
					UI.getCurrent().getNavigator().navigateTo("Buscador");
				}
			}
		});

		this.titulo.addValueChangeListener(event -> {
			String tipo = (String) event.getValue();
			Datos_Navegante.setTipoBusqueda(tipo);
		});

	}

	void inicializar() {		
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		FileResource resource = new FileResource(new File(basepath + "src/main/resources/images/logo.png"));
		logo = new Image("Garbitube", resource);
		
		System.out.println(logo.getWidth());
		
		List<String> lista = new ArrayList<String>();
		lista.add("Elige Busqueda");
		lista.add("Videos");
		lista.add("Usuarios");

		titulo.setItems(lista);
		titulo.setSelectedItem(lista.get(0));
	}
}