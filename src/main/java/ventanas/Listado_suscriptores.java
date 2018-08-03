package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Listado_suscriptores extends Listado_suscriptores_ventanas implements View {
	/*
	private JLabel _suscripcionesLB;
	public Zona_cabecera_comun _unnamed_Zona_cabecera_comun_;
	*/
	IUsuario_registrado usuarioR= new BD_Principal();
	
	public Listado_suscriptores(){
		cargarListadoSuscriptores();
		atras.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				//Datos_Navegante.setPerfilVisitante("");
				// TODO Auto-generated method stub
				if(Datos_Navegante.getTipoUsuario().equals("Invitado")) {
					UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
		    	}else if(Datos_Navegante.getTipoUsuario().equals("Registrado")) {
		    		if(Datos_Navegante.getPerfilVisitante().equals("perfilRegistrado")) {
		    			Datos_Navegante.setPerfilVisitante("");
		    			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		        	}else {
		        	
		        		UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
		        	}
		    	}else{
		    		UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
		    	
		    	}
							
			}
		});
	}

	void cargarListadoSuscriptores() {
		// TODO Auto-generated method stub
		int id= 0;
		if(Datos_Navegante.getTipoUsuario().equals("Invitado")) {
    		id= Datos_Navegante.getIdPerfilvistante();
    	}else if(Datos_Navegante.getTipoUsuario().equals("Registrado")) {
    		if(Datos_Navegante.getPerfilVisitante().equals("perfilRegistrado")) {
    			id= Datos_Navegante.getIdUsuario();
        	}else {
        	
        		id= Datos_Navegante.getIdPerfilvistante();
        	}
    	}else{
    		id= Datos_Navegante.getIdPerfilvistante();
    	
    	}
		
		
		List<Usuario_Registrado_BD> lista= usuarioR.cargarListadoSuscriptores(id);
		

		form.removeAllComponents();
		for (int i = 0; i < lista.size(); i++) {
			form.addComponent(new Lista_usuarios(lista.get(i)));
		}
		
	}
	
}