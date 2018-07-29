package ventanas;

import com.vaadin.navigator.View;

public class Ficha_administrador extends Ficha_administrador_ventanas implements View{
	/*
	 * private Button _eliminarB; private Button _attribute; public Video
	 * _unnamed_Video_; public Zona_comentarios_video_administrador
	 * _unnamed_Zona_comentarios_video_administrador_; public
	 * Zona_opciones_video_administrador
	 * _unnamed_Zona_opciones_video_administrador_; public
	 * Zona_cabecera_video_administrador
	 * _unnamed_Zona_cabecera_video_administrador_;
	 * 
	 * public void eliminar() { throw new UnsupportedOperationException(); }
	 * 
	 * public void operation() { throw new UnsupportedOperationException(); }
	 */
	
	Zona_cabecera_video_administrador zc= new Zona_cabecera_video_administrador();
	Ficha_video fvi= new Ficha_video();
	Zona_opciones_video_administrador zo= new Zona_opciones_video_administrador();
	Lista_comentarios_anadibles lca= new Lista_comentarios_anadibles();
	
	
	public Ficha_administrador(){
		
			vertical.removeAllComponents();
			vertical.addComponent(zc);
			horizontal.removeAllComponents();
			horizontal.addComponent(fvi);
			horizontal.addComponent(zo);
			verti2.removeAllComponents();
			verti2.addComponent(lca);				
			
			}
		

}