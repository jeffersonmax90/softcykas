package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Perfil_registrado  extends Perfil_registrado_ventanas implements View{
	/*
	public Zona_cabecera_video_registrado _unnamed_Zona_cabecera_video_registrado_;
	public Zona_cabecera_video_propietario _unnamed_Zona_cabecera_video_propietario_;
	public Zona_inicio_cabecera_registrado _unnamed_Zona_inicio_cabecera_registrado_;
	public Zona_cabecera_perfli_Registrado _unnamed_Zona_cabecera_perfli_Registrado_;
	public Zona_opciones_perfil_registrado _unnamed_Zona_opciones_perfil_registrado_;
	public Zona_cuerpo_perfil_registrado _unnamed_Zona_cuerpo_perfil_registrado_;
	*/
	IUsuario_registrado usuarioR= new BD_Principal();
	Video_BD video= new Video_BD();
	public Perfil_registrado() {
		cargarVideosPropios();
		
		zona_opciones_perfil_registrado.inicio.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("usuario_registrado");
			}
		});
		
		zona_opciones_perfil_registrado.subir_video.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("subir_video");
			}
		});
		zona_opciones_perfil_registrado.modificarDatos.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("modificar_datos");
			}
		});
		
		zona_opciones_perfil_registrado.cambiarContrasena.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("cambiar_contrasena");
			}
		});
		
		zona_opciones_perfil_registrado.historial.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("lista_historial");
			}
		});
		
		zona_opciones_perfil_registrado.videosUltimosSubidos.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("lista_ultimos_videos_subidos");
			}
		});
		
		zona_opciones_perfil_registrado.cerrarSesion.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("");
			}
		});
		
		cabecera.zcv.ver_listado_suscriptores.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("listado_suscriptores");
			}
		});
		
		cabecera.zcv.ver_listado_suscripciones.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("listado_suscripciones_registrado");
			}
		});
		
		zona_opciones_perfil_registrado.nombre_usuario.setValue(Datos_Navegante.getApodo().toUpperCase());
		
		
		
	}
	
	
	
	



void cargarVideosPropios() {
	// TODO Auto-generated method stub
		List<Video_BD> listavideos= usuarioR.cargarVideosPropios(Datos_Navegante.getIdUsuario());
		zona_cuerpo_perfil_registrado.lv.listaVideosFL.removeAllComponents();
		for (Video_BD lv : listavideos) {
			Video_BD v= lv;
			Video_subido vs= new Video_subido();
			
			vs.video.tituloVideo.setCaption(v.getTitulo());
			vs.video.video.setSource(new ExternalResource(v.getRuta()));
			zona_cuerpo_perfil_registrado.lv.listaVideosFL.addComponent(vs);
			
			vs.video.tituloVideo.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					UI.getCurrent().getNavigator().navigateTo("Ficha_propietario");
				}
			});
			
		//	video.setSource(new ExternalResource(vid.getMiniatura()));
		//	user.setSource(new ExternalResource(vid.getPropietario_video().getAvatar()));
		}
}

	
}