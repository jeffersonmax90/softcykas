package ventanas;

import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_videos_subidos extends Lista_videos_subidos_ventanas {
	/*
	private JTextField _buscar_videoTF;
	private JButon _buscar_videoB;
	private Vector _videos_subidosV;
	public Zona_cuerpo_perfil_registrado _unnamed_Zona_cuerpo_perfil_registrado_;
	public Vector<Video_subido> _unnamed_Video_subido_ = new Vector<Video_subido>();
	*/
	
	
	IUsuario_registrado usuarioR= new BD_Principal();
	Video_BD video= new Video_BD();
	
	
	public Lista_videos_subidos(){
		cargarVideosPropios();
		
		buscarB.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				String texto= buscadorTF.getValue();
				
				if(texto.length()==0){

					cargarVideosPropios();
					
				}
				else{
					buscarVideosPropios();		
				}
			}
		});
	}
	
	
	void buscarVideosPropios() {
		String aNombre= this.buscadorTF.getValue();
		if(aNombre.isEmpty() || aNombre.length()==0 || aNombre.equals("")|| aNombre.equals(null)){
			UI.getCurrent().getNavigator().navigateTo("perfil_registrado");
		}
					
		List<Video_BD> listavideos= usuarioR.buscarVideosPropios(aNombre);
		listaVideosFL.removeAllComponents();
			for (int i = 0; i < listavideos.size(); i++) {
				this.listaVideosFL.addComponent(new Video_subido(listavideos.get(i)));	
			}
		}
	
	void cargarVideosPropios() {
		
		List<Video_BD> listavideos= usuarioR.cargarVideosPropios(Datos_Navegante.getIdUsuario());
		listaVideosFL.removeAllComponents();
		for(int i=0;i<listavideos.size();i++) {
			listaVideosFL.addComponent(new Video_subido(listavideos.get(i)));
		}
	}
	
}