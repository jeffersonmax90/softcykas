package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Cambiar_imagen extends Cambiar_imagen_ventanas implements View {
	/*
	 * private Label _seleccionar_imagenLB; private Button _seleccionar_imagenB;
	 * public Zona_cabecera_administrador _unnamed_Zona_cabecera_administrador_;
	 * 
	 * public void cambiar_imagen() { throw new UnsupportedOperationException(); }
	 */
	
	
	public Cambiar_imagen(){
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				
			}
		});
	}
}