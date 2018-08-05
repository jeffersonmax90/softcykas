package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Listado_suscripciones_visitante extends Listado_suscripciones_visitante_ventanas implements View{
	/*private JLabel _suscripcionesLB;
	public Zona_cabecera_perfil_visitante _unnamed_Zona_cabecera_perfil_visitante_;
	*/
	IUsuario_registrado usuarioR= new BD_Principal();
	
	public Listado_suscripciones_visitante(){
		
		cargarListadoSuscripcionesVisitante();
		
		atras.addClickListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
			}
		});
		
		
	}

	void cargarListadoSuscripcionesVisitante() {
		List<Usuario_Registrado_BD> lista= usuarioR.cargarListadoSuscripciones(Datos_Navegante.getIdPerfilvistante());
		
		form.removeAllComponents();
		for (int i = 0; i < lista.size(); i++) {
			form.addComponent(new Lista_usuarios(lista.get(i)));
		}
		
	}
	
	
	
}