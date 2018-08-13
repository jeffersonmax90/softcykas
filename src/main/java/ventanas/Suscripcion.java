package ventanas;

import java.util.List;

import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Suscripcion extends Suscripcion_ventanas {
	/*
	private JButon _dejar_seguirB;
	public Listado_suscripciones_registrado _unnamed_Listado_suscripciones_registrado_;
	public Confirmar_dejar_de_seguir _unnamed_Confirmar_dejar_de_seguir_;

	public void dejar_seguir() {
		throw new UnsupportedOperationException();
	}
	*/
	IUsuario_registrado usuR= new BD_Principal();
	Usuario_Registrado_BD usuarioSuscrito;
	
	public Suscripcion( Usuario_Registrado_BD usuario){
		horizontal.removeAllComponents();
		
		Usuario usu = new Usuario(usuario);
		horizontal.addComponent(usu);
		horizontal.addComponent(dejarDeSeguir);
		
		dejarDeSeguir.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				int n= usuario.getId();
				usuarioSuscrito=usuario;
				Datos_Navegante.setIdPerfilvistante(n);
				
				dejarSeguir();
				
			
			}
		});
	}
		
	private void dejarSeguir() {
		
		boolean correcto= usuR.dejarSeguir(Datos_Navegante.getIdPerfilvistante());
		
		if(Boolean.TRUE.equals(correcto)){
			Notification notification = new Notification("¡Has dejado de seguir a!", ""+usuarioSuscrito.getNombre()+" "+usuarioSuscrito.getApellidos(), Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());
			UI.getCurrent().getNavigator().navigateTo("listado_suscripciones_registrado");
		}
		
	}
	
	
}