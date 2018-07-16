package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


import ventanas.ProyectoSoftCykasFilter.NormalServletRequestFactory;


public class Iniciar_sesion extends Iniciar_sesion_ventanas implements View {
	/*
	private JLabel _emailLB;
	private JTextField _emailTF;
	private JLabel _contrasenaLB;
	private JTextField _contrasenaTF;
	private JCheckBox _recordar_contrasenaCH;
	private JButon _recuperar_contrasenaB;
	private JButon _registrarseB;
	private JButon _atrasB;
	private JButon _iniciar_sesionB;
	public Zona_inicio_cabecera_invitado _unnamed_Zona_inicio_cabecera_invitado_;
	public Zona_cabecera_video_invitado _unnamed_Zona_cabecera_video_invitado_;
	public Zona_cabecera_comun _unnamed_Zona_cabecera_comun_;
	public Recuperar_contrasena _unnamed_Recuperar_contrasena_;
	public Registrarse _unnamed_Registrarse_;
	*/
	
	IUsuario_no_registrado noRegistrado = new BD_Principal();
	
	public Iniciar_sesion() {
		
	
		
		
		registrarse.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("registrase");
			}
		});
	
	
		atras.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("usuario_invitado");
			}
		});
		
		recuperar_contrasena.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("recuperar_contrasena");
			}
		});
		
		
		iniciar.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				iniciar_sesion();
				//UI.getCurrent().getNavigator().navigateTo("usuario_registrado");
			}
		});
		
	}

	void iniciar_sesion() {
		 Usuario_BD usu = noRegistrado.iniciarSesion(emailTF.getValue(), contrasenaTF.getValue());
			
		
		
	
	
	
	 }
}
	
