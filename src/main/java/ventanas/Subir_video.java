package ventanas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vaadin.navigator.View;
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
		cargar_categorias();

		atras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

		subir_video.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Subir_video();
				Notification notification = new Notification("Video subido con éxito", Notification.Type.HUMANIZED_MESSAGE);
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

	}

	void cargar_categorias() {
		List<Categoria_BD> items = new ArrayList<Categoria_BD>();

		for (Categoria_BD cat : registrado.cargarCategorias()) {
			items.add(cat);
			System.out.println(cat.toString());
		}
		String[] categorias = new String[items.size()];
		anadirDatosVideo.categoria.setItems(categorias);
	}

	void Subir_video() {
		for (Categoria_BD categoria : registrado.cargarCategorias()) {
			if (categoria.toString().equals(anadirDatosVideo.categoria.getSelectedItem().toString())) {
				video.setCategoria_BD(categoria);
				break;
			}
		}
		video.setTitulo(anadirDatosVideo.titulo.getValue());
		video.setEtiqueta(anadirDatosVideo.Etiqueta.getValue());
		video.setRuta(anadirDatosVideo.rutaVideo.getValue());
		video.setMiniatura(anadirDatosVideo.rutaMiniatura.getValue());
		video.setDescripcion(anadirDatosVideo.descripcion_video.getValue());
		video.setDescripcion(anadirDatosVideo.area_descripcion.getValue());

		registrado.subirVideo(video);
	}

}