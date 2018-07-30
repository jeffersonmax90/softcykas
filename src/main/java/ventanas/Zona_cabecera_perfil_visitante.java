package ventanas;

public class Zona_cabecera_perfil_visitante extends Zona_cabecera_perfil_visitante_ventanas {
	/*
	public Perfil_visitante _unnamed_Perfil_visitante_;
	public Listado_suscripciones_visitante _unnamed_Listado_suscripciones_visitante_;
	*/
	Zona_cabecera_comun zcabeComun= new Zona_cabecera_comun();
	
	public Zona_cabecera_perfil_visitante(){
	vertical.removeAllComponents();
	vertical.addComponent(zcabeComun);
	vertical2.addComponent(suscribirse);
	}
	
}