package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Listado_suscriptores extends Listado_suscriptores_ventanas implements View {
	/*
	private JLabel _suscripcionesLB;
	public Zona_cabecera_comun _unnamed_Zona_cabecera_comun_;
	*/
	
	public Listado_suscriptores(){
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				
			}
		});
	}
	
}