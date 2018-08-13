package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_cabecera_comun extends Zona_cabecera_comun_ventanas{
	/*
	private Image _logo;
	private JLabel _n_visitasLB;
	private JLabel _visitasLB;
	private JLabel _n_suscripcionesLB;
	private JLabel _suscripcionesLB;
	private JLabel _n_suscriptoresLB;
	private JLabel _suscriptoresLB;
	private JButon _listado_suscripcionesB;
	private JButon _listado_suscriptoresB;
	public Iniciar_sesion _unnamed_Iniciar_sesion_;
	public Confirmar_suscripcion _unnamed_Confirmar_suscripcion_;
	public Listado_suscriptores _unnamed_Listado_suscriptores_;
	*/
	IUsuario_registrado usuarioR= new BD_Principal();
	
	public Zona_cabecera_comun(){
		
		cargarDatosPerfilRegistrado();
		
		
		ver_listado_suscriptores.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setPerfilVisitante("perfilRegistrado");
				UI.getCurrent().getNavigator().navigateTo("listado_suscriptores");
			}
		});
		
		ver_listado_suscripciones.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("listado_suscripciones_registrado");
			}
		});

		logo.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				if(Datos_Navegante.getTipoUsuario().equals("Invitado")) {
	        		UI.getCurrent().getNavigator().navigateTo("");
	        	}else if(Datos_Navegante.getTipoUsuario().equals("Registrado")) {
	        		
		        		UI.getCurrent().getNavigator().navigateTo("usuario_registrado");
		        }else {
	        		UI.getCurrent().getNavigator().navigateTo("usuario_administrador");
	        	}
				
				
			}
		});

	 
	}
	
	void cargarDatosPerfilRegistrado() {
			
		
		Usuario_Registrado_BD usu= usuarioR.cargarDatosPerfilRegistrado(Datos_Navegante.getIdUsuario());
		
		nVisitas.setValue(String.valueOf(usu.getN_visitas()));
		nSuscriptores.setValue(String.valueOf(usu.suscrito.getCollection().size()));
		nSuscripciones.setValue(String.valueOf(usu.suscriptor.getCollection().size()));
		
		
		this.imagen.setSource(new ExternalResource(usu.getMiniatura()));
	};
	
}