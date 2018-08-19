package ventanas;

public class Zona_inicio_cuerpo_administrador extends Zona_inicio_cuerpo_administrador_ventanas {
	Videos_tendencia vt= new Videos_tendencia();
	Videos_usuarios_registrados vur= new Videos_usuarios_registrados();
	
	public Zona_inicio_cuerpo_administrador(){
		vertical2.removeAllComponents();
		vertical2.addComponent(vt);
		vertical2.addComponent(vur);
	}
}