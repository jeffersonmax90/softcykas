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
		cargarImagenRegistrado();
		
		ver_listado_suscriptores.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("listado_suscriptores");
			}
		});
		
		ver_listado_suscripciones.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("listado_suscripciones_registrado");
			}
		});

	 
	}
	
	void cargarImagenRegistrado() {
		/*
		int id=-1;
		if (Datos_Navegante.getTipoUsuario().equals("Invitado")) {
			id= Datos_Navegante.getIdPerfilvistante();
		}else if (Datos_Navegante.getTipoUsuario().equals("Registrado")) {
			if(Datos_Navegante.getEstado()==0){
				//cargo mi propio perfil 
				id=  Datos_Navegante.getIdUsuario();
			}else if (Datos_Navegante.getEstado()!=0){
				//cargo perfil de otra persona
				id= Datos_Navegante.getIdPerfilvistante();
			}
			
		} else if (Datos_Navegante.getTipoUsuario().equals("Administrador")){
			
			id= Datos_Navegante.getIdPerfilvistante();
		}
		
		*/
		
		
		Usuario_Registrado_BD usu= usuarioR.cargarImagenRegistrado(Datos_Navegante.getIdUsuario());
		
		this.imagen.setSource(new ExternalResource(usu.getMiniatura()));
	};
	
}