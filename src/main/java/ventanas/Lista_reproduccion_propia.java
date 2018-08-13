package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_reproduccion_propia extends Lista_reproduccion_propia_ventanas implements View{
	/*
	private Vector _videos_lista_reproduccionV;
	public Listas_reproduccion_propias _unnamed_Listas_reproduccion_propias_;
	public Video_lista_reproduccion _unnamed_Video_lista_reproduccion_;
	*/
	
	IUsuario_registrado usu= new BD_Principal();
	
	
	public Lista_reproduccion_propia(){
	
		cargarVideosListaReproduccionPropia();
		
		atras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
	}

	void cargarVideosListaReproduccionPropia() {
		
		form.removeAllComponents();
		
		List<Video_BD> lista= usu.cargarVideosListaReproduccionPropia(Datos_Navegante.getIdListaReproducion());
		
		if(lista == null || lista.size() == 0){
			Label l= new Label();
			l.setValue("Tu lista esá vacía");
			form.addComponent(l);
		}
		
		for (int i = 0; i < lista.size(); i++) {
				form.addComponent(new Video_lista_reproduccion(lista.get(i)));
			}
	}
}