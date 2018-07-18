package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_datos extends Modificar_datos_ventanas  implements View{
	
	/*private JLabel _modificar_datosLB;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	*/
	
	
	public Modificar_datos(){
		
				
		atras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
		
		modificar.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
					modificar();
				}
			});
	
	
	}
	
	
		void modificar() {
			// TODO Auto-generated method stub

		}
	
}