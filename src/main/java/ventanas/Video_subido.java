package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Video_subido extends Video_subido_ventanas {
	/*
	private Button _eliminarB;
	private Button _modificarB;
	public Lista_videos_subidos _unnamed_Lista_videos_subidos_;
	public Modificar_video _unnamed_Modificar_video_;

	public void eliminar() {
		throw new UnsupportedOperationException();
	}

	public void modificar() {
		throw new UnsupportedOperationException();
	}
	*/
	IUsuario_registrado usuarioR= new BD_Principal();
	public String obtenerId;
	int idVideo;
	
	
	public Video_subido( Video_BD video){
	
			this.video.tituloVideo.setCaption(video.getTitulo());
			this.video.miniaturaVideo.setSource(new ExternalResource(video.getMiniatura()));
			this.video.idVideo.setVisible(false);
			//casting el id a string
			int id=video.getId();
			
			String cadena="";
			cadena=String.valueOf(id);
			this.video.idVideo.setValue(cadena);
			
			
			this.video.tituloVideo.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					String n=Video_subido.this.video.idVideo.getValue();
					int numero=Integer.parseInt(n);
					Datos_Navegante.setIdVideo(numero);
					UI.getCurrent().getNavigator().navigateTo("Ficha_propietario");
				}
			});
			
	
			this.modificar.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					String n=Video_subido.this.video.idVideo.getValue();
					int numero=Integer.parseInt(n);
					Datos_Navegante.setIdVideo(numero);
					Notification notification = new Notification("Correcto", ""+n, Notification.Type.HUMANIZED_MESSAGE);
					notification.setDelayMsec(2000);
					notification.show(Page.getCurrent());	
					UI.getCurrent().getNavigator().navigateTo("Modificar_video");
				}
			});
			
			this.eliminar.addClickListener(new Button.ClickListener() {
				@Override
				public void buttonClick(ClickEvent event) {
					String n=Video_subido.this.video.idVideo.getValue();
					int numero=Integer.parseInt(n);
					Datos_Navegante.setIdVideo(numero);
					
					eliminarVideoSubido();
				}

				
			});
	
		}
		
	void eliminarVideoSubido() {
		boolean borrado=false;
		borrado= usuarioR.eliminarVideoSubido(Datos_Navegante.getIdVideo());
		if(borrado== true){
			Notification notification = new Notification("El Video se ha eliminado", "", Notification.Type.HUMANIZED_MESSAGE);
			notification.setDelayMsec(2000);
			notification.show(Page.getCurrent());	
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");	
		}
	}
}
	