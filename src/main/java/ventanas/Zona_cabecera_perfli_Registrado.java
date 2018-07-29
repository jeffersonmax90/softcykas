package ventanas;

public class Zona_cabecera_perfli_Registrado extends Zona_cabecera_perfli_Registrado_ventanas {
	/*
	public Perfil_registrado _unnamed_Perfil_registrado_;
	public Listado_suscripciones_registrado _unnamed_Listado_suscripciones_registrado_;
	*/
	
	Zona_cabecera_comun zcc= new Zona_cabecera_comun();
	
	public Zona_cabecera_perfli_Registrado(){
		vertical.removeAllComponents();
		vertical.addComponent(zcc);
	}
	
	
	
	
	
}