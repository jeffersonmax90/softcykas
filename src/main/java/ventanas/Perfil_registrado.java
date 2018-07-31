package ventanas;

import java.util.Collections;
import java.util.List;

import org.hibernate.internal.util.compare.ComparableComparator;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;



public class Perfil_registrado  extends Perfil_registrado_ventanas implements View{
	/*
	public Zona_cabecera_video_registrado _unnamed_Zona_cabecera_video_registrado_;
	public Zona_cabecera_video_propietario _unnamed_Zona_cabecera_video_propietario_;
	public Zona_inicio_cabecera_registrado _unnamed_Zona_inicio_cabecera_registrado_;
	public Zona_cabecera_perfli_Registrado _unnamed_Zona_cabecera_perfli_Registrado_;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	public Zona_cuerpo_perfil_registrado _unnamed_Zona_cuerpo_perfil_registrado_;
	*/
	Zona_cabecera_perfli_Registrado zc= new Zona_cabecera_perfli_Registrado();
	Zona_cuerpo_perfil_registrado zcuerp= new Zona_cuerpo_perfil_registrado();
	
	
	public Perfil_registrado() {
		vertical.removeAllComponents();
		vertical.addComponent(zc);
		horizontal.removeAllComponents();
		horizontal.addComponent( new Zona_opciones_perfil_registrado());
		horizontal.addComponent(zcuerp);
	}	
		
}
