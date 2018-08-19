package ventanas;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Recuperar_contrasena extends Recuperar_contrasena_ventanas implements View {
	IUsuario_no_registrado nr;
	public Recuperar_contrasena() {
		nr = new BD_Principal();
		atras.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
		
		enviar.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				if(nr.recuperarContrasena(escribir_email.getValue())){
					try {			
						HtmlEmail email = new HtmlEmail();
						email.setHostName("smtp.gmail.com");
						email.setSmtpPort(465);
						email.setSSLOnConnect(true);			
						email.setAuthentication("garbitube@gmail.com", "viscabarsa");
						email.setFrom("garbitube@gmail.com");
						email.addTo(escribir_email.getValue());				
						email.setSubject("Recuperación de contraseña");
						email.setHtmlMsg("Introduce este código en el popup:"+Datos_Navegante.getRecuperarContraseña());				
						email.send();		
						Datos_Navegante.setRecuperarContraseña("");
						Window w=new Window("Cambiar contraseña");
						w.setContent(new Reestablecer_contrasena());
						w.center();		
						w.setResponsive(true);
						UI.getCurrent().addWindow(w);
					}catch (EmailException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}
}
