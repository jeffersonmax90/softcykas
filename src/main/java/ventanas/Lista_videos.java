package ventanas;

import java.util.List;

public class Lista_videos extends Lista_videos_ventanas{
	/*
	private Vector _videosV;
	public Vector<Video> _unnamed_Video_ = new Vector<Video>();
	
	/*Video v1=new Video();
	Video v2= new Video();
	Video v3=new Video();
	Video v4= new Video();
	
	*/
	IUsuario_no_registrado usuNoRegistrado= new BD_Principal();
	
	public Lista_videos(){
		cargarVideosUltimosSubidos();
	}
	
	
	void cargarVideosUltimosSubidos() {
	
		int aid=2;
		List<Video_BD> lista= usuNoRegistrado.cargarListaUltimosVideosSubidos(2);
	
		horizontal.removeAllComponents();	
		for (int i = 0; i < lista.size(); i++) {
			horizontal.addComponent(new Video(lista.get(i)));
		}

		
	}	
	
}