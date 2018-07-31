package ventanas;



import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_perfil_visitante extends Zona_cabecera_perfil_visitante_ventanas {
	/*
	public Perfil_visitante _unnamed_Perfil_visitante_;
	public Listado_suscripciones_visitante _unnamed_Listado_suscripciones_visitante_;
	*/
	//Zona_cabecera_comun zcabeComun= new Zona_cabecera_comun();
	
	IUsuario_registrado usuR= new BD_Principal();
	
	public Zona_cabecera_perfil_visitante(){
	
		cargarDatosPerfilVisitante();
		
		ver_listado_suscriptores.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("listado_suscriptores");
			}
		});
		
		ver_listado_suscripciones.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("Listado_suscripciones_visitante");
			}
		});
		

		suscribirse.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				seguirUsuario();
			}
		});
		
		
	}

	
	
	void cargarDatosPerfilVisitante() {
		Usuario_Registrado_BD usu= usuR.cargarDatosPerfilVisitante(Datos_Navegante.getIdPerfilvistante());

		nVisitas.setValue(String.valueOf(usu.getN_visitas()));
		nSuscriptores.setValue(String.valueOf(usu.suscriptor.getCollection().size()));
		nSuscripciones.setValue(String.valueOf(usu.suscrito.getCollection().size()));
		imagen.setSource(new ExternalResource(usu.getMiniatura()));
		if(Datos_Navegante.getTipoUsuario().equals("Registrado")){
		Usuario_Registrado_BD usuNavegante= usuR.cargarDatosPerfilVisitante(Datos_Navegante.getIdUsuario());
		
		
		for( Object o: usuNavegante.suscriptor.getCollection()){
			Usuario_Registrado_BD u=  (Usuario_Registrado_BD)o;
			if(u.getId()==Datos_Navegante.getIdPerfilvistante()){
				suscribirse.setStyleName("friendly");
				break;
			}else{
				suscribirse.setStyleName("");
				break;
			}
		}
		
		}else {
			suscribirse.setVisible(false);
			
			
		}
	}
	
	void seguirUsuario() {
		boolean seguirUsuario=false;
		seguirUsuario= usuR.seguirUsuario(Datos_Navegante.getIdUsuario(), Datos_Navegante.getIdPerfilvistante());
		
		if(Boolean.TRUE.equals(seguirUsuario)){
			suscribirse.setStyleName("friendly");
		}else {
			suscribirse.setStyleName("");
		}
		cargarDatosPerfilVisitante();
	}
	
	
}