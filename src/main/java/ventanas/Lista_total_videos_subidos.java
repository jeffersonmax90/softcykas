package ventanas;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Lista_total_videos_subidos extends Lista_total_videos_subidos_ventanas implements View {
	/*
	 * private TextField _buscar_videoTF; private Button _buscar_videoB; private
	 * Vector _videos_administradorV; public Zona_opciones_administrador
	 * _unnamed_Zona_opciones_administrador_;
	 */

	IAdministrador usuAdmin = new BD_Principal();
	Video_BD video = new Video_BD();

	public Lista_total_videos_subidos() {
		
		cargarListaTotalVideosSubidos();

		buscar.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				
				buscarVideoListaTotal();
				
			}

		});

		atras.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("perfil_administrador");
			}
		});
	}

	void cargarListaTotalVideosSubidos() {
		
		List<Video_BD> listavideos = usuAdmin.cargarListaTotalVideosSubidos(Datos_Navegante.getIdUsuario());
		
		listaVideosFL.removeAllComponents();
		for (int i = 0; i < listavideos.size(); i++) {
			listaVideosFL.addComponent(new Video(listavideos.get(i)));
		}
	}
	
	
	private void buscarVideoListaTotal() {
		String aNombre= this.buscardorTF.getValue();
		if(aNombre.isEmpty() || aNombre.length()==0 || aNombre.equals("")|| aNombre.equals(null)){
			UI.getCurrent().getNavigator().navigateTo("Lista_total_videos_subidos");
		}
		
		List<Video_BD> listavideos = usuAdmin.buscarVideoListaTotal(aNombre);
		
		listaVideosFL.removeAllComponents();
		for (int i = 0; i < listavideos.size(); i++) {
			listaVideosFL.addComponent(new Video(listavideos.get(i)));
		}
	}
}