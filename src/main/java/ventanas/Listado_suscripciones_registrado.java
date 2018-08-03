package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Listado_suscripciones_registrado extends Listado_suscripciones_registrado_ventanas implements View{
	/*
	private JLabel _suscripcionesLB;
	private Vector _suscripcionesV;
	public Zona_cabecera_perfli_Registrado _unnamed_Zona_cabecera_perfli_Registrado_;
	public Suscripcion _unnamed_Suscripcion_;
	*/
	
	IUsuario_registrado usuarioR= new BD_Principal();
	
	public Listado_suscripciones_registrado(){
		cargarListadoSuscripciones();
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
				
			}
		});
	}
	

	void cargarListadoSuscripciones() {
		// TODO Auto-generated method stub
	
		
		
		
		
		List<Usuario_Registrado_BD> lista= usuarioR.cargarListadoSuscripciones(Datos_Navegante.getIdUsuario());
		
		form.removeAllComponents();
		for (int i = 0; i < lista.size(); i++) {
			form.addComponent(new Suscripcion(lista.get(i)));
		}
		
	}
	
	
}