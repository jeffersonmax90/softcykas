package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_reproduccion_propia extends Lista_reproduccion_propia_ventanas implements View{
	/*
	private Vector _videos_lista_reproduccionV;
	public Listas_reproduccion_propias _unnamed_Listas_reproduccion_propias_;
	public Video_lista_reproduccion _unnamed_Video_lista_reproduccion_;
	*/
	
	
	public Lista_reproduccion_propia(){
	
		
		atras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
	}
}