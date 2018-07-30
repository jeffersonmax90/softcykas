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
		
		vertical.removeAllComponents();
		vertical.addComponent(new Zona_inicio_cabecera_administrador());
		vertical.addComponent(new Zona_inicio_cuerpo_administrador());
		
		
		
		
	
	}
	
	
	
	
	
}