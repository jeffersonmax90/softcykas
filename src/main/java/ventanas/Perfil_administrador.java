package ventanas;

import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Perfil_administrador extends Perfil_administrador_ventanas implements View {
	Zona_cabecera_administrador zc= new Zona_cabecera_administrador();
	Zona_opciones_administrador zopc= new Zona_opciones_administrador();
	
	public Perfil_administrador() {
		logo.setSource(new ExternalResource(
				"https://raw.githubusercontent.com/jeffersonmax90/softcykas/master/src/main/resources/images/logo.png"));
		logo.addClickListener(new ClickListener() {
			@Override
			public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("usuario_administrador");
			}
		});
		vertical.removeAllComponents();
		vertical.addComponent(zc);
		vertical.addComponent(zopc);
	}
}