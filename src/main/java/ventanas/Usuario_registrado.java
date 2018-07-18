package ventanas;

//import org.omg.CORBA.portable.IndirectionException;


import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Usuario_registrado extends Usuario_registrado_ventanas implements View {
	/*
	public Zona_inicio_cabecera_registrado _unnamed_Zona_inicio_cabecera_registrado_;
	public Zona_inicio_cuerpo_registrado _unnamed_Zona_inicio_cuerpo_registrado_;
	*/
	
	
	
	public Usuario_registrado() {
		
		zicr.mi_perfil.addClickListener(new Button.ClickListener() {		
				@Override
				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
		
		zicr.cerrar_sesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("");
			}
		});
		
		
	}
	
}