package ventanas;

public class Zona_cuerpo_perfil_registrado extends Zona_cuerpo_perfil_registrado_ventanas{
	Lista_videos_subidos lvs=new Lista_videos_subidos();
	Listas_reproduccion_propias lrp=new Listas_reproduccion_propias();
	
	public Zona_cuerpo_perfil_registrado(){
		verticalVideos.removeAllComponents();
		verticalVideos.addComponent(lvs);
		verticalListas.removeAllComponents();
		verticalListas.addComponent(lrp);
	}
}