package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Perfil_administrador extends Perfil_administrador_ventanas implements View{
	/*
	 * public Zona_inicio_cabecera_administrador
	 * _unnamed_Zona_inicio_cabecera_administrador_; public
	 * Zona_cabecera_video_administrador
	 * _unnamed_Zona_cabecera_video_administrador_; public
	 * Zona_cabecera_administrador _unnamed_Zona_cabecera_administrador_; public
	 * Zona_opciones_administrador _unnamed_Zona_opciones_administrador_;
	 */
	
	Zona_cabecera_administrador zc= new Zona_cabecera_administrador();
	Zona_opciones_administrador zopc= new Zona_opciones_administrador();
	

	
	public Perfil_administrador(){
		
		vertical.removeAllComponents();
		vertical.addComponent(zc);
		vertical.addComponent(zopc);
		
		
		
		
		
		
		
	}

	 
	
}