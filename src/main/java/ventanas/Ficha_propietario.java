package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Ficha_propietario extends Ficha_propietario_ventanas implements View{
	/*
	 * public Video _unnamed_Video_; public Zona_comentarios_video_propietario
	 * _unnamed_Zona_comentarios_video_propietario_; public
	 * Zona_cabecera_video_propietario _unnamed_Zona_cabecera_video_propietario_;
	 * public Zona_opciones_video_propietario
	 * _unnamed_Zona_opciones_video_propietario_;
	 */
	
	Zona_cabecera_video_propietario zc= new Zona_cabecera_video_propietario();
	Zona_opciones_video_propietario zopc= new Zona_opciones_video_propietario();
	Lista_comentarios_deshabilitables lcd= new Lista_comentarios_deshabilitables();
	Ficha_video fvi= new Ficha_video();
	
	public Ficha_propietario(){
	vertical.removeAllComponents();	
	vertical.addComponent(zc);
	horizontal.removeAllComponents();
	horizontal.addComponent(fvi);
	horizontal.addComponent(zopc);
	verti2.removeAllComponents();
	verti2.addComponent(lcd);
		
	}
	
	
	
}