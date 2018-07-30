package ventanas;

import java.util.List;

import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Video;

public class Videos_usuarios_registrados extends Videos_usuarios_registrados_ventanas {
	/*
	private JLabel _videos_subidosLB;
	public Zona_inicio_comun _unnamed_Zona_inicio_comun_;
	*/
	
	
	//Lista_videos lv= new Lista_videos();
	
	public Videos_usuarios_registrados(){
		//cargarVideosUltimosSubidos();
		
		vertical.removeAllComponents();
		vertical.addComponent(new Lista_videos());
		}

	
		
		
}