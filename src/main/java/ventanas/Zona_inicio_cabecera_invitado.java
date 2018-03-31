package ventanas;

import com.vaadin.ui.Component;

public class Zona_inicio_cabecera_invitado extends Zona_inicio_cabecera_invitado_ventanas {
	/*private Image _logo;
	private JButon _iniciar_sesionB;
	public Usuario_invitado _unnamed_Usuario_invitado_;
	public Iniciar_sesion _unnamed_Iniciar_sesion_;
	public Buscador _unnamed_Buscador_;
	*/
	
	Cabecera_buscador cb= new Cabecera_buscador();
	
	
	public Zona_inicio_cabecera_invitado(){
	buscador_layout.addComponent(cb);
		
		
		
	}
}