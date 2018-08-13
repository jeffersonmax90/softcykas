package ventanas;

import java.util.List;

import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;

public class Videos_relacionados extends Videos_relacionados_ventanas {
	/*
	private JLabel _videos_relacionadosLB;
	public Zona_inicio_cuerpo_registrado _unnamed_Zona_inicio_cuerpo_registrado_;
	*/

	IUsuario_registrado usu= new BD_Principal();
	Lista_videos lv= new Lista_videos();
	
	public Videos_relacionados(){
		
		CargarVideosRelacionados();
		
	}
	
	void CargarVideosRelacionados() {
		int aId=2;
		vertical.removeAllComponents();
		List<Video_BD> lista= usu.cargarVideosRelacionados(aId);
		
		lv.horizontal.removeAllComponents();	
		if(lista == null || lista.size() == 0){
			Label l= new Label();
			l.setValue("No tienes ningún video relacionado con respecto a la categorías");
			lv.horizontal.addComponent(l);
		}
		for (int i = 0; i < lista.size(); i++) {
			lv.horizontal.addComponent(new Video(lista.get(i)));
		}
		vertical.addComponent(lv);
		
	}
}