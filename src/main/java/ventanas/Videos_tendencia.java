package ventanas;

import java.util.List;

public class Videos_tendencia extends Videos_tendencias_ventanas {
	/*
	 * private JLabel _tendenciasLB; public Zona_inicio_comun
	 * _unnamed_Zona_inicio_comun_; public Zona_inicio_cuerpo_registrado
	 * _unnamed_Zona_inicio_cuerpo_registrado_;
	 */

	IUsuario_no_registrado usuNoRegistrado = new BD_Principal();
	Lista_videos lv = new Lista_videos();

	public Videos_tendencia() {
		cargarVideosTendencia();

	}

	void cargarVideosTendencia() {
		verticalLista.removeAllComponents();
		
		List<Video_BD> lista = usuNoRegistrado.cargarVideosTendencia();
		
		lv.horizontal.removeAllComponents();
	
		for (int i = 0; i < lista.size(); i++) {
			lv.horizontal.addComponent(new Video(lista.get(i)));
		}

		verticalLista.addComponent(lv);
	}
}