package ventanas;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;



public class Modificar_video extends Modificar_video_ventanas implements View{
	/*
	private JLabel _modificar_videoLB;
	public Video_subido _unnamed_Video_subido_;
	*/
	
	IUsuario_registrado usuR= new BD_Principal();	
	Video_BD video= new Video_BD();
	List<Categoria_BD> listacat;
	List<String> items;
	int idcat;
	@SuppressWarnings("serial")
	public Modificar_video() {
		
		cargarCategorias();
		
		cargarModificarVideo();
		
		atras.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});

		modificar.addClickListener(new Button.ClickListener() {
			@SuppressWarnings("unused")
			public void buttonClick(ClickEvent event) {
				
				modificarVideo();
				/*
				Notification notification = new Notification("Video modificado con éxito"," ",
						Notification.Type.HUMANIZED_MESSAGE);*/
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}

		});

	}
	
	void cargarModificarVideo() {
		
		video= usuR.cargarModificarVideo(Datos_Navegante.getIdVideo());	
		
		idcat= video.getCategoria_BD().getId();
		datosVideos.titulo.setValue(video.getTitulo());
		
		//datosVideos.categoria.setItems(listacat.get(idcat));
		datosVideos.Etiqueta.setValue(video.getEtiqueta());
		datosVideos.rutaVideo.setValue(video.getRuta());
		datosVideos.rutaMiniatura.setValue(video.getMiniatura());
		datosVideos.area_descripcion.setValue(video.getDescripcion());
	}

	void cargarCategorias() {
		List<String> items = new ArrayList<String>();
		if (usuR.cargarCategorias().isEmpty()) {
			Notification notification = new Notification(
					"Sentimos las molestias, no puede añadir video hasta que no haya categorías",
					Notification.Type.HUMANIZED_MESSAGE);
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		}
		listacat= usuR.cargarCategorias();
		//int aux;
		for (Categoria_BD cat : listacat) {
			items.add(cat.getNombre() + " " + cat.getEdad());
			
		}
		
		video= usuR.cargarModificarVideo(Datos_Navegante.getIdVideo());	
		String  aux= video.getCategoria_BD().getNombre()+ " " + video.getCategoria_BD().getEdad();
		items.add(aux);
		datosVideos.categoria.setItems(items);
		
		datosVideos.categoria.setSelectedItem(items.get(items.size()-1));
	}
		
	
	
		
	void modificarVideo() {
		
	boolean modificado=false;
		
			Categoria_BD cat = new Categoria_BD();
			String categoria= datosVideos.categoria.getValue();
			String[] parte= categoria.split(" ");
			String nombre=parte[0];
			String edad=parte[1];
			
			cat.setNombre(nombre);
			cat.setEdad(edad);
			
		//modificar video
		video.setTitulo(datosVideos.titulo.getValue());	
		
		video.setCategoria_BD(cat);
		video.setEtiqueta(datosVideos.Etiqueta.getValue());
		video.setRuta(datosVideos.rutaVideo.getValue());
		video.setMiniatura(datosVideos.rutaMiniatura.getValue());
		video.setDescripcion(datosVideos.area_descripcion.getValue());

		
		modificado= usuR.modificarVideo(video);
	
		if(modificado== true){
			Notification notification = new Notification("Correcto", "Se ha modificado correctamente", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());	
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");		
		}
	}
	
	
}

