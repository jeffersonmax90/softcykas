package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;


import ventanas.ProyectoSoftCykasFilter.NormalServletRequestFactory;


public class Iniciar_sesion extends Iniciar_sesion_ventanas implements View {
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
				
			}
		});
	}

	void iniciar_sesion() {
		Usuario_BD usuario = noRegistrado.iniciarSesion(emailTF.getValue(), contrasenaTF.getValue());			
		String tipoUsuario= usuario.getTipoUsuario();	
		
	
		
		if(tipoUsuario.equals("Registrado")){	
			Datos_Navegante.setIdUsuario(usuario.getId());
			Datos_Navegante.setApodo(usuario.getApodo());
			Datos_Navegante.setTipoUsuario("Registrado");
			
			Notification notification = new Notification("Bienvenido ", ""+ usuario.getApodo(), Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());	
			UI.getCurrent().getNavigator().navigateTo("usuario_registrado");			
		}else if(tipoUsuario.equals("Administrador")){	
			Datos_Navegante.setIdUsuario(usuario.getId());
			Datos_Navegante.setTipoUsuario("Administrador");
			UI.getCurrent().getNavigator().navigateTo("usuario_administrador");		
			Notification notification = new Notification("Bienvenido ", ""+ usuario.getApodo(), Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());	
			
		}else if(tipoUsuario.equals("incorrecto")){
		Notification notification = new Notification("Intentelo de nuevo!", "El Email o la contraseña está incorrecta", Notification.Type.HUMANIZED_MESSAGE);
		notification.setDelayMsec(2000);
		notification.show(Page.getCurrent());	
	 }
	
		
	}
}
	
