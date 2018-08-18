package ventanas;

public class Zona_inicio_comun extends Zona_inicio_comun_ventanas {
	Videos_tendencia vt= new Videos_tendencia();
	Videos_usuarios_registrados vur= new Videos_usuarios_registrados();
	public Zona_inicio_comun(){
		vertical.removeAllComponents();
		vertical.addComponent(vt);
		vertical.addComponent(vur);
	}
}