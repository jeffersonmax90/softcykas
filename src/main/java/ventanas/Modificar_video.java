package ventanas;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_video extends Modificar_video_ventanas implements View {
	IUsuario_registrado registrado = new BD_Principal();
	Video_BD video = new Video_BD();
	List<Categoria_BD> listaCategorias;

	public Modificar_video() {
		cargarCategoriasModificar();
		cargarModificarVideo();

		atras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

		modificar.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				modificarVideo();
			}
		});
	}

	void cargarModificarVideo() {
		video = registrado.cargarModificarVideo(Datos_Navegante.getIdVideo());
		datosVideos.categoria.setValue(video.getCategoria_BD().getNombre() + " " + video.getCategoria_BD().getEdad());
		datosVideos.titulo.setValue(video.getTitulo());
		datosVideos.Etiqueta.setValue(video.getEtiqueta());
		datosVideos.rutaVideo.setValue(video.getRuta());
		datosVideos.rutaMiniatura.setValue(video.getMiniatura());
		datosVideos.area_descripcion.setValue(video.getDescripcion());
	}

	void cargarCategoriasModificar() {
		List<String> items = new ArrayList<String>();
		if (registrado.cargarCategorias().isEmpty()) {
			Notification notification = new Notification(
					"Sentimos las molestias, no puede modificar el video hasta que no haya categorías",
					Notification.Type.HUMANIZED_MESSAGE);
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		}
		listaCategorias = registrado.cargarCategoriasModificar();
		
		for (Categoria_BD cat : registrado.cargarCategoriasModificar()) {
			items.add(cat.getNombre() + " " + cat.getEdad());
		}
		datosVideos.categoria.setItems(items);
	}

	void modificarVideo() {
		
		String categoria = datosVideos.categoria.getValue();
		String[] parte = categoria.split(" ");
		String nombre = parte[0];
		String edad = parte[1];

		Categoria_BD cat = null;
		
		//busqueda de la categoria
		for (Categoria_BD cate : listaCategorias) {
			if ((cate.getNombre().equals(nombre))
					&& (cate.getEdad().equals(edad))) {
				cat = cate;
			}
		}
		
		
		video.setCategoria_BD(cat);
		video.setTitulo(datosVideos.titulo.getValue());
		video.setEtiqueta(datosVideos.Etiqueta.getValue());

		String linkFinal = "https://www.youtube.com/v/";
		String source = datosVideos.rutaVideo.getValue();
		if (!video.getRuta().equals(datosVideos.rutaVideo.getValue())) {
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
		}

		String ruta;
		if (datosVideos.rutaMiniatura.getValue().isEmpty()) {
			ruta = "http://i41.tinypic.com/2uqf48w.jpg";
		} else {
			ruta = datosVideos.rutaMiniatura.getValue();
		}

		video.setMiniatura(ruta);
		video.setDescripcion(datosVideos.area_descripcion.getValue());

		boolean modificado = registrado.modificarVideo(video);
		if (modificado) {
			Notification notification = new Notification("¡Has modificado el video con éxito!", "",
					Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		}else{
			Notification notification = new Notification("Nooo se ha subido!", "",
					Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			//UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			
		}
	}
}
