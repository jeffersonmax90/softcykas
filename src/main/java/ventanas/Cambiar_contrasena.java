package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Cambiar_contrasena extends Cambiar_contrasena_ventanas  implements View{
	/*
	private JLabel _contrasena_actualLB;
	private JTextField _contrasena_actualTF;
	private JLabel _contrasena_nuevaLB;
	private JTextField _contrasena_nuevaTF;
	private JLabel _repetir_contrasenaLB;
	private JTextField _repetir_contrasenaTF;
	private JButon _atrasB;
	private JButon _aceptarB;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;

	public void cambiar_contrasena() {
		throw new UnsupportedOperationException();
	}
	*/
	
	
	public Cambiar_contrasena(){
		
				
		atras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
		
		aceptar.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				aceptar();
				}
			});
	
	}
	
	void aceptar() {
		// TODO Auto-generated method stub
		
	}
	
}