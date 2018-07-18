package ventanas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;



public class Subir_video extends Subir_video_ventanas  implements View{
	/*
	private JLabel _subir_videoLB;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	*/
	
	Categoria_BD cat= new Categoria_BD();
	IUsuario_registrado registrado = new BD_Principal();
	Video_BD video = new Video_BD();
	
	public Subir_video(){
		cargar_categorias();
				
		atras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
		
		subir_video.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
					Subir_video();
				}
			});
	
	
	}
	
	
	void cargar_categorias() {
		List <String> items = new ArrayList<String>();
		for(Categoria_BD cat :  registrado.cargarCategorias()) {
			items.add(cat.toString());
		}		
		anadirDatosVideo.categoria.setItems(items);
	}
	
		
	void Subir_video(){
		
		video.setTitulo(anadirDatosVideo.titulo.getValue());
		Optional<String> catSelecc = anadirDatosVideo.categoria.getSelectedItem();
		String categoria = catSelecc.get();
		//video.setCategoria_BD(categoria);
		video.setEtiqueta(anadirDatosVideo.Etiqueta.getValue());
		//video.set(anadirDatosVideo.rutaVideo.getValue());
		video.setMiniatura(anadirDatosVideo.rutaMiniatura.getValue());
		//video.setFecha_subida(anadirDatosVideo.fecha_video_subido.getValue());
		video.setDescripcion(anadirDatosVideo.descripcion_video.getValue());
		video.setDescripcion(anadirDatosVideo.area_descripcion.getValue());
		
		registrado.subirVideo(video);
		
	}

	
	
	
	
}