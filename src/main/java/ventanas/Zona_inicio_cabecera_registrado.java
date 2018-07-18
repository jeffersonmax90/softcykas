package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_inicio_cabecera_registrado extends Zona_inicio_cabecera_registrado_ventanas  {
	/*
	private JButon _mi_perfilB;
	private JButon _cerrar_sesionB;
	private Image _logo;
	public Usuario_registrado _unnamed_Usuario_registrado_;
	public Perfil_registrado _unnamed_Perfil_registrado_;
	public Buscador _unnamed_Buscador_;
	*/
	/*
	Cabecera_buscador_ventanas zici= new Cabecera_buscador();
	
	public Zona_inicio_cabecera_registrado(){
		buscador_layout.addComponent(zici);
	}
	*/
	

	public Zona_inicio_cabecera_registrado() {
		
		mi_perfil.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
			}
		});
		
		cerrar_sesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
	}
	
	
}