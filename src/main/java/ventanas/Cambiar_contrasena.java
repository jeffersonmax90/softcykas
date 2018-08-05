package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
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
	//Usuario_Registrado_BD usu= new Usuario_Registrado_BD();
	IUsuario_registrado usuario_registrado= new BD_Principal();
	
	public Cambiar_contrasena(){
				
				
		atras.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				}
			});
		
		cambiarContrasena.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {				
				cambiarcontrasena();
				}
			});
	
	}
	
	
	
	void cambiarcontrasena() {
	
	boolean cambiado= false;
	if(contrasena_nueva.getValue().equals(repetir_contrasena.getValue())){
		cambiado=usuario_registrado.cambiarcontrasena(contrasena_nueva.getValue(),contrasena_actual.getValue(),	repetir_contrasena.getValue());	
		if(Boolean.TRUE.equals(cambiado)){
			Notification notification = new Notification("Correcto", "Se ha cambiado correctamente", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());	
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");	
		}else{
			Notification notification = new Notification("Incorrecto", "La contraseña no coincide", Notification.Type.ERROR_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());	
		}
	}else{
		Notification notification = new Notification("Incorrecto", "La contraseña no coincide", Notification.Type.ERROR_MESSAGE);
		notification.setDelayMsec(2000);
		notification.show(Page.getCurrent());		
	}
	
		
		
	}
	
}