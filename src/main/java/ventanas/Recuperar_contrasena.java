package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Recuperar_contrasena extends Recuperar_contrasena_ventanas implements View {
	/*private JLabel _emailLB;
	private JTextField _emailTF;
	private JButon _atrasB;
	private JButon _enviarB;
	public Iniciar_sesion _unnamed_Iniciar_sesion_;
	*/
	
	
	
	
	
	public Recuperar_contrasena() {		
	
		atras.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("logIn");
			}
		});
		
	}
	
	
	
}

