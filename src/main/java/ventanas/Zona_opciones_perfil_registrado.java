package ventanas;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Zona_opciones_perfil_registrado extends Zona_opciones_perfil_registrado_ventanas implements View {
	/*
	private JButon _inicioB;
	private JButon _subir_videoB;
	private JButon _modificar_datosB;
	private JButon _cambiar_contrasenaB;
	private JButon _historialB;
	private JButon _ultimos_videos_subidosB;
	private JButon _cerrar_sesionB;
	public Perfil_registrado _unnamed_Perfil_registrado_;
	public Modificar_datos _unnamed_Modificar_datos_;
	public Lista_ultimos_videos_subidos _unnamed_Lista_ultimos_videos_subidos_;
	public Lista_historial _unnamed_Lista_historial_;
	public Cambiar_contrasena _unnamed_Cambiar_contrasena_;
	public Subir_video _unnamed_Subir_video_;
	*/
	IUsuario_registrado usuR= new BD_Principal();
	Usuario_Registrado_BD usu = new Usuario_Registrado_BD();
	
	public Zona_opciones_perfil_registrado(){
		cargarNombrePerfilRegistrado();
		
		volverAtras.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("usuario_registrado");
			}
		});
		
		subirVideo.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("subir_video");
			}
		});
		modificarDatos.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("modificar_datos");
			}
		});
		
		cambiarContrasena.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("cambiar_contrasena");
			}
		});
		
		historial.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("lista_historial");
			}
		});
		
		videosUltimosSubidos.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("lista_ultimos_videos_subidos");
			}
		});
		
		cerrarSesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				Datos_Navegante.setTipoUsuario("Invitado");
				Datos_Navegante.setIdUsuario(-1);
				Datos_Navegante.setIdVideo(-1);
				Datos_Navegante.setIdListaReproducion(-1);				
				UI.getCurrent().getNavigator().navigateTo("");
			}
		});
		
	}

	
	
	void cargarNombrePerfilRegistrado() {
		
		usu= usuR.cargarNombrePerfilRegistrado(Datos_Navegante.getIdUsuario());
		nombre_usuario.setValue(usu.getNombre()+" "+usu.getApellidos());
	}
	
	
}