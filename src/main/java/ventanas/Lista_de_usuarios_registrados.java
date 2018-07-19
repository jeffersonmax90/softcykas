package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_de_usuarios_registrados extends Lista_de_usuarios_registrados_ventanas implements View {
	/*
	 * private TextField _buscar_usuarioTF; private Button _buscar_usuarioB; private
	 * Vector _usuarios_registradosV; public Zona_opciones_administrador
	 * _unnamed_Zona_opciones_administrador_; public
	 * Vector<Usuario_registrado_listado> _unnamed_Usuario_registrado_listado_ = new
	 * Vector<Usuario_registrado_listado>();
	 */
	
	
	public Lista_de_usuarios_registrados(){
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
				
			}
		});
	}
	
}