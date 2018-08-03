package ventanas;

import java.util.List;

public class Lista_videos_agenos extends Lista_videos_agenos_ventanas {
	/*
	private Label _videos_subidosLB;
	private Buton _ver_masB;
	public Zona_cuerpo_perfil_visitante _unnamed_Zona_cuerpo_perfil_visitante_;
	*/
	
	IUsuario_no_registrado usuNoRegistrado= new BD_Principal();
	Lista_videos lv= new Lista_videos();
	
	public Lista_videos_agenos(){
		cargarVideoUsuarioRegistrado();
	}

	void cargarVideoUsuarioRegistrado() {
		vertical.removeAllComponents();
		List<Video_BD> lista= usuNoRegistrado.cargarVideosUsuarioRegistrado(Datos_Navegante.getIdPerfilvistante());
		
			lv.horizontal.removeAllComponents();			
			for (int i = 0; i < lista.size(); i++) {
				lv.horizontal.addComponent(new Video(lista.get(i)));
			}
	
			vertical.addComponent(lv);	}
	
}