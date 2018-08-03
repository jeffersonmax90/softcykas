package ventanas;

import com.vaadin.server.ExternalResource;

public class Usuario extends Usuario_ventanas{
	/*
	private Image _miniatura;
	private Label _usuarioLB;
	public Lista_usuarios _unnamed_Lista_usuarios_;
	public Perfil_visitante _unnamed_Perfil_visitante_;
	*/
	
	public Usuario( Usuario_Registrado_BD usuario){
		
		this.imagen.setSource(new ExternalResource(usuario.getMiniatura()));
		this.nombre.setValue(usuario.getNombre()+ " "+usuario.getApellidos());
		
	}
	
	
	
}