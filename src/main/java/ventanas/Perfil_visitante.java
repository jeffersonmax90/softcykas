package ventanas;

import com.vaadin.navigator.View;

public class Perfil_visitante extends Perfil_visitante_ventanas implements View {
	public  Perfil_visitante(){
		vertical.removeAllComponents();
		vertical.addComponent(new Zona_cabecera_perfil_visitante());
		vertical.addComponent(new Zona_cuerpo_perfil_visitante());
	}
}