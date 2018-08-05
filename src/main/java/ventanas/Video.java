package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;



public class Video extends Video_ventanas {
	/*private Label _tituloLB;
	private Image _miniatura;
	public Lista_videos _unnamed_Lista_videos_;
	public Ficha_invitado _unnamed_Ficha_invitado_;
	public Ficha_registrado _unnamed_Ficha_registrado_;
	public Ficha_propietario _unnamed_Ficha_propietario_;
	public Ficha_administrador _unnamed_Ficha_administrador_;

	public void reproducir() {
		throw new UnsupportedOperationException();
	}

	public void Elegir_tipo_video() {
		throw new UnsupportedOperationException();
	}
	
	*/
	public Video(){
		
	}
	
	
	private int idAutor;
	public Video( Video_BD video){
		this.miniaturaVideo.setSource(new ExternalResource(video.getMiniatura()));
		this.idVideo.setVisible(false);
		int id=video.getId();
		String cadena="";
		cadena=String.valueOf(id);
		this.idVideo.setValue(cadena);
		this.tituloVideo.setCaption(video.getTitulo());
		
		idAutor=video.getPropietario().getORMID();
		
	//Boton titulo
		this.tituloVideo.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				int n= video.getId();
				Datos_Navegante.setIdVideo(n);
	        	if(Datos_Navegante.getTipoUsuario().equals("Invitado")) {
	        		UI.getCurrent().getNavigator().navigateTo("Ficha_invitado");
	        	}else if(Datos_Navegante.getTipoUsuario().equals("Registrado")) {
	        		if(Datos_Navegante.getIdUsuario()==idAutor) {
		        		UI.getCurrent().getNavigator().navigateTo("Ficha_propietario");
		        	}else {
		        	
		        		UI.getCurrent().getNavigator().navigateTo("Ficha_registrado");
		        	}
	        	}
	        	else {
	        		UI.getCurrent().getNavigator().navigateTo("Ficha_administrador");
	        	}
			}
		});
		
		}
	
	}
	
