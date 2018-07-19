package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_historial extends Lista_historial_ventanas  implements View{
	/*
	private JLabel _historialLB;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	*/
	
	
	public Lista_historial(){
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				
			}
		});
	}
}