package ventanas;

public class Zona_inicio_cuerpo_administrador extends Zona_inicio_cuerpo_administrador_ventanas {
	/*
	 * public Usuario_administrador _unnamed_Usuario_administrador_; public
	 * Zona_inicio_comun _unnamed_Zona_inicio_comun_;
	 */
	
	
	public Zona_inicio_cuerpo_administrador(){
		
		vertical.removeAllComponents();
		vertical.addComponentAsFirst(new Zona_inicio_comun());
	}
}