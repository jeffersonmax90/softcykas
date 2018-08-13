package ventanas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Subir_video extends Subir_video_ventanas implements View {
	/*
	 * private JLabel _subir_videoLB; public Zona_opciones_perfil_registrado
	 * _unnamed_Zona_opciones_perfil_registrado_;
	 */

	Categoria_BD cat = new Categoria_BD();
	IUsuario_registrado registrado = new BD_Principal();
	Video_BD video = new Video_BD();

	public Subir_video() {
		cargarCategorias();

		atras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

		subir_video.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				subirVideo();
				
				Notification notification = new Notification("Video subido con éxito",
						Notification.Type.HUMANIZED_MESSAGE);
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

	}

	void cargarCategorias() {
		List<String> items = new ArrayList<String>();

		if (registrado.cargarCategorias().isEmpty()) {
			Notification notification = new Notification(
					"Sentimos las molestias, no puede añadir video hasta que no haya categorías",
					Notification.Type.HUMANIZED_MESSAGE);
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		}

		for (Categoria_BD cat : registrado.cargarCategorias()) {
			items.add(cat.getNombre() + " " + cat.getEdad());
		}
		items.add("Elige categoria");
		anadirDatosVideo.categoria.setItems(items);
		anadirDatosVideo.categoria.setSelectedItem(items.get(items.size()-1));
	}

	void subirVideo() {
		
		Categoria_BD cat = new Categoria_BD();
		// separo la palabra categoria
		String categoria = anadirDatosVideo.categoria.getValue();
		String[] parte = categoria.split(" ");
		String nombre = parte[0];
		String edad = parte[1];

		cat.setNombre(nombre);
		cat.setEdad(edad);
	
	
		video.setCategoria_BD(cat);		
		video.setTitulo(anadirDatosVideo.titulo.getValue());
		video.setEtiqueta(anadirDatosVideo.Etiqueta.getValue());

		String linkFinal = "https://www.youtube.com/v/";
		String source = anadirDatosVideo.rutaVideo.getValue();
		if (source.contains("https://youtu.be")) {
			String[] parse = source.split("/");
			source = parse[parse.length - 1];
			if (source.contains("?")) {
				String[] parse2 = source.split("\\?");
				source = parse2[0];
			}
		} else {
			String[] parse = source.split("=");
			if (parse.length == 2)
				source = parse[1];
			else {
				String[] parse2 = parse[1].split("&");
				source = parse2[0];
			}
		}
		linkFinal += source;

		video.setRuta(linkFinal);
		String ruta;
		if (anadirDatosVideo.rutaMiniatura.getValue().isEmpty()) {
			ruta = "http://i41.tinypic.com/2uqf48w.jpg";
		} else {
			ruta = anadirDatosVideo.rutaMiniatura.getValue();
		}

		video.setMiniatura(ruta);
		video.setDescripcion(anadirDatosVideo.area_descripcion.getValue());
		video.setComentarios_deshabilitados(false);
		
	
		registrado.subirVideo(video);

		Notification notification = new Notification("¡Has subido un video con éxito!","",Notification.Type.HUMANIZED_MESSAGE);
		notification.setDelayMsec(2000);
		notification.show(Page.getCurrent());
		UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
	}

}