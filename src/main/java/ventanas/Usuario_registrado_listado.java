package ventanas;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Page;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Usuario_registrado_listado extends Usuario_registrado_listado_ventanas {
	/*
	 * private Label _usuario_registradoLB; private Image _miniatura; private Button
	 * _eliminar_usuarioB; public Lista_de_usuarios_registrados
	 * _unnamed_Lista_de_usuarios_registrados_;
	 * 
	 * public void eliminar_usuario() { throw new UnsupportedOperationException(); }
	 */

	IAdministrador admin= new BD_Principal();
	String obtenerId;
	int idusu;
	
public Usuario_registrado_listado(Usuario_Registrado_BD usuarios){
	
	miniatura.setSource(new ExternalResource((usuarios.getMiniatura())));
	nombre_usuario.setValue(usuarios.getNombre()+" "+usuarios.getApellidos());
	id.setVisible(false);
	//casting el id a string
	int id=usuarios.getId();
	String cadena="";
	cadena=String.valueOf(id);
	this.id.setCaption(cadena);
	
	eliminar_button.addClickListener(new ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			idusu=usuarios.getId();
			eliminarUsuarioListaRegistrado();	
			
		}
	});
	
	
	
	
}



void eliminarUsuarioListaRegistrado() {
	
	boolean eliminado= admin.eliminarUsuarioListaRegistrado(idusu);
	
	if(Boolean.TRUE.equals(eliminado)){
		Notification notification = new Notification("¡Usuario elminado con éxito!", "", Notification.Type.HUMANIZED_MESSAGE);
		notification.setDelayMsec(2000);
		notification.show(Page.getCurrent());
		UI.getCurrent().getNavigator().navigateTo("Lista_de_usuarios_registrados");
		
	}
}










}