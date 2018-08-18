package ventanas;

import com.vaadin.navigator.View;

public class Perfil_registrado extends Perfil_registrado_ventanas implements View {
	Zona_cabecera_perfli_Registrado zc = new Zona_cabecera_perfli_Registrado();
	Zona_cuerpo_perfil_registrado zcuerp = new Zona_cuerpo_perfil_registrado();

	public Perfil_registrado() {
		vertical.removeAllComponents();
		vertical.addComponent(zc);
		horizontal.removeAllComponents();
		horizontal.addComponent(new Zona_opciones_perfil_registrado());
		horizontal.addComponent(zcuerp);
	}
}
