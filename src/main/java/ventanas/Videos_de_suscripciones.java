package ventanas;

import java.util.List;

public class Videos_de_suscripciones extends Videos_de_suscripciones_ventanas {
	/*
	private JLabel _actividad_suscripcionesLB;
	public Zona_inicio_cuerpo_registrado _unnamed_Zona_inicio_cuerpo_registrado_;
	*/
	
	IUsuario_registrado usu= new BD_Principal();
	Lista_videos lv= new Lista_videos();
	
	public Videos_de_suscripciones(){
		cargarVideosSuscripciones();
		
	}

	void cargarVideosSuscripciones() {
		vertical.removeAllComponents();
		List<Video_BD> lista= usu.cargarVideosSuscripciones(Datos_Navegante.getIdUsuario());
		
			lv.horizontal.removeAllComponents();			
			for (int i = 0; i < lista.size(); i++) {
				lv.horizontal.addComponent(new Video(lista.get(i)));
			}
	
			vertical.addComponent(lv);
	}
	
	
}