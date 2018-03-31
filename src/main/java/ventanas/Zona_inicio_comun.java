package ventanas;

public class Zona_inicio_comun extends Zona_inicio_comun_ventanas {
	/*public Zona_inicio_cuerpo_invitado _unnamed_Zona_inicio_cuerpo_invitado_;
	public Zona_inicio_cuerpo_administrador _unnamed_Zona_inicio_cuerpo_administrador_;
	public Videos_tendencia _unnamed_Videos_tendencia_;
	public Videos_usuarios_registrados _unnamed_Videos_usuarios_registrados_;
	*/
	
	Videos_tendencia vt= new Videos_tendencia();
	Videos_usuarios_registrados vur= new Videos_usuarios_registrados();
	
	public Zona_inicio_comun(){
		videos_tendencias_layout.addComponent(vt);
		videos_usuarios_registrados_layout.addComponent(vur);
	
	}
	
}