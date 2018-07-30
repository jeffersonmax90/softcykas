package ventanas;

import java.util.List;

import com.vaadin.ui.Panel;

public class Videos_relacionados extends Videos_relacionados_ventanas {
	/*
	private JLabel _videos_relacionadosLB;
	public Zona_inicio_cuerpo_registrado _unnamed_Zona_inicio_cuerpo_registrado_;
	*/
	/*
	Lista_videos lv= new Lista_videos();
	
	public Videos_relacionados(){
		videos_relacionados_layout.addComponent(lv);
	}
	*/
	
	Lista_videos lv= new Lista_videos();
	IUsuario_registrado usu= new BD_Principal();
	
	public Videos_relacionados(){
		CargarVideosRelacionados();
		vertical.removeAllComponents();
		vertical.addComponent(lv);
	}
	
	void CargarVideosRelacionados() {
		int aId=2;
		List<Video_BD> lista= usu.cargarVideosRelacionados(aId);
		Panel p =  new Panel("Panel");
		lv.horizontal.removeAllComponents();	
		for (int i = 0; i < lista.size(); i++) {
			lv.horizontal.addComponent(new Video(lista.get(i)));
		}
		p.setWidth("700");
		p.setHeight("-1");
		p.setContent(lv);
			
			
		panel.setWidth("70%");
		panel.setHeight("-1");
		
	}
}