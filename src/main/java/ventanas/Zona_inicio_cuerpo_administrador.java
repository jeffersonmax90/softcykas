package ventanas;

public class Zona_inicio_cuerpo_administrador extends Zona_inicio_cuerpo_administrador_ventanas {
	/*
	 * public Usuario_administrador _unnamed_Usuario_administrador_; public
	 * Zona_inicio_comun _unnamed_Zona_inicio_comun_;
	 */
	
	Videos_tendencia vt= new Videos_tendencia();
	Videos_usuarios_registrados vur= new Videos_usuarios_registrados();
	
	public Zona_inicio_cuerpo_administrador(){
		vertical2.removeAllComponents();
		vertical2.addComponent(vt);
		vertical2.addComponent(vur);
	}
}