package ventanas;

public class Lista_reproduccion_propia extends Lista_reproduccion_propia_ventanas {
	/*
	private Vector _videos_lista_reproduccionV;
	public Listas_reproduccion_propias _unnamed_Listas_reproduccion_propias_;
	public Video_lista_reproduccion _unnamed_Video_lista_reproduccion_;
	*/
	
	Video_lista_reproduccion v1= new Video_lista_reproduccion();
	Video_lista_reproduccion v2= new Video_lista_reproduccion();
	Video_lista_reproduccion v3= new Video_lista_reproduccion();
	
	public Lista_reproduccion_propia(){
		video_layout1.addComponent(v1);
		video_layout2.addComponent(v2);
		video_layout3.addComponent(v3);
	}
}