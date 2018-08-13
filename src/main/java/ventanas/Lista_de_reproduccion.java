package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_de_reproduccion extends Lista_de_reproduccion_ventanas implements View {
	/*
	private Label _lista_reproduccionLB;
	private Button _quitar_videoB;
	public Listas_de_reproduccion _unnamed_Listas_de_reproduccion_;
	*/
	//Video_lista_reproduccion vlr= new Video_lista_reproduccion();
	//Video_lista_reproduccion vlr= new Video_lista_reproduccion();
	
	IUsuario_no_registrado usuNoRegistrado= new BD_Principal();
	
	public Lista_de_reproduccion(){
		
		cargarVideosListaReproduccionVisitante();
		
		atras.addClickListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
			}
		});
	}

	void cargarVideosListaReproduccionVisitante() {
		form.removeAllComponents();
		
		List<Video_BD> lista= usuNoRegistrado.cargarVideosListaReproduccionVisitante(Datos_Navegante.getIdListaReproducion());
		
		if(lista == null || lista.size() == 0){
			Label l= new Label();
			l.setValue("Tu lista esá vacía");
			form.addComponent(l);
		}
		
		for (int i = 0; i < lista.size(); i++) {
				form.addComponent(new Video(lista.get(i)));
			}
	}
	
	
	
	
}