package ventanas;

import com.vaadin.navigator.View;

public class Perfil_visitante extends Perfil_visitante_ventanas implements View {
	/*
	public Ficha_video _unnamed_Ficha_video_;
	public Comentario _unnamed_Comentario_;
	public Zona_cabecera_perfil_visitante _unnamed_Zona_cabecera_perfil_visitante_;
	public Zona_cuerpo_perfil_visitante _unnamed_Zona_cuerpo_perfil_visitante_;
	public Usuario _unnamed_Usuario_;
	*/
	
	//Zona_cabecera_perfil_visitante zcabe= new Zona_cabecera_perfil_visitante();
	//Zona_cuerpo_perfil_visitante zcuerp= new Zona_cuerpo_perfil_visitante();
	
	public  Perfil_visitante(){
		vertical.removeAllComponents();
		vertical.addComponent(new Zona_cabecera_perfil_visitante());
		vertical.addComponent(new Zona_cuerpo_perfil_visitante());
	}
}