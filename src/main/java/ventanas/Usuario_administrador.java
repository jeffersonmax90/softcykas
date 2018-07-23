package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Usuario_administrador extends Usuario_administrador_ventanas implements View{
	/*
	 * public Zona_inicio_cabecera_administrador
	 * _unnamed_Zona_inicio_cabecera_administrador_; public
	 * Zona_inicio_cuerpo_administrador _unnamed_Zona_inicio_cuerpo_administrador_;
	 */
	
	
	public Usuario_administrador(){
		
		
		zcva.mi_perfil.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				}
			});
		
		
	
	}
	
	
	
	
	
}