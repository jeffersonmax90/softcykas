package ventanas;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_inicio_cabecera_administrador extends Zona_inicio_cabecera_administrador_ventanas {
	/*
	 * private Button _perfil_administradorB; public Usuario_administrador
	 * _unnamed_Usuario_administrador_; public Perfil_administrador
	 * _unnamed_Perfil_administrador_;
	 */
	
	
	public Zona_inicio_cabecera_administrador(){
		
		
		perfil.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				}
			});
		
		cerrar_sesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setTipoUsuario("Invitado");
				Datos_Navegante.setIdUsuario(-1);
				Datos_Navegante.setIdVideo(-1);
				Datos_Navegante.setIdListaReproducion(-1);	
				UI.getCurrent().getNavigator().navigateTo("");
			}
		});
		
	}
}