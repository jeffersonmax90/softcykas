package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Listado_suscripciones_registrado extends Listado_suscripciones_registrado_ventanas implements View{
	/*
	private JLabel _suscripcionesLB;
	private Vector _suscripcionesV;
	public Zona_cabecera_perfli_Registrado _unnamed_Zona_cabecera_perfli_Registrado_;
	public Suscripcion _unnamed_Suscripcion_;
	*/
	
	
	public Listado_suscripciones_registrado(){
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				
			}
		});
	}
	
	
}