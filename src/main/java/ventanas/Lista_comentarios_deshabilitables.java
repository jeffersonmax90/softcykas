package ventanas;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_comentarios_deshabilitables extends Lista_comentarios_deshabilitables_ventanas {
	IUsuario_registrado usuRegistrado = new BD_Principal();
	List<Comentario_BD> comentarios ;
	public Lista_comentarios_deshabilitables() {
		form_comentarios.removeAllComponents();

		cargarListaComentariosVideosPropios();
		cargarBotonDeshabilitar();
		
		
		deshabilitar_comentarios.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				deshabilitarComentariosVideosPropios();
			}

			
		});
	}

	void cargarBotonDeshabilitar() {
		Video_BD v= usuRegistrado.cargarBotonDeshabilitar(Datos_Navegante.getIdVideo());
		if(Boolean.TRUE.equals(v.getComentarios_deshabilitados())){
			this.deshabilitar_comentarios.setStyleName("friendly");
		}else{
			this.deshabilitar_comentarios.setStyleName("");
		}
		
		
	}

	void cargarListaComentariosVideosPropios() {
		form_comentarios.removeAllComponents();

		comentarios = usuRegistrado.cargarListaComentariosVideosPropios(Datos_Navegante.getIdVideo());
		if (comentarios == null || comentarios.size() == 0) {
			Label l = new Label();
			l.setValue("No existen comentarios en el video");
			form_comentarios.addComponent(l);
		}
		for (int i = 0; i < comentarios.size(); i++) {
			form_comentarios.addComponent(new Comentario(comentarios.get(i)));
		}

	}
	
	void deshabilitarComentariosVideosPropios() {
		
		boolean aux= usuRegistrado.deshabilitarComentariosVideosPropios(Datos_Navegante.getIdVideo());
		if(Boolean.TRUE.equals(aux)){
			this.deshabilitar_comentarios.setStyleName("friendly");
		}else{
			this.deshabilitar_comentarios.setStyleName("");
		}
	}

}