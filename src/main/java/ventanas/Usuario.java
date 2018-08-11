package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Usuario extends Usuario_ventanas{
	/*
	private Image _miniatura;
	private Label _usuarioLB;
	public Lista_usuarios _unnamed_Lista_usuarios_;
	public Perfil_visitante _unnamed_Perfil_visitante_;
	*/
	
	public Usuario( Usuario_Registrado_BD usuario){
		
		this.imagen.setSource(new ExternalResource(usuario.getMiniatura()));
		this.nombre.setCaption(usuario.getNombre()+ " "+usuario.getApellidos());
		
		nombre.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				int idvisitante = usuario.getId();
				Datos_Navegante.setIdPerfilvistante(idvisitante);
				if (Datos_Navegante.getIdUsuario() != idvisitante)
					UI.getCurrent().getNavigator().navigateTo("Perfil_visitante");
			}
		});
		
	}
	
	
	
}