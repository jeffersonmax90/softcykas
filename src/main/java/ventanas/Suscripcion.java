package ventanas;

import com.vaadin.ui.Button;

public class Suscripcion extends Suscripcion_ventanas {
	/*
	private JButon _dejar_seguirB;
	public Listado_suscripciones_registrado _unnamed_Listado_suscripciones_registrado_;
	public Confirmar_dejar_de_seguir _unnamed_Confirmar_dejar_de_seguir_;

	public void dejar_seguir() {
		throw new UnsupportedOperationException();
	}
	*/
	
	
	public Suscripcion( Usuario_Registrado_BD usuario){
		horizontal.removeAllComponents();
		
		Usuario usu = new Usuario(usuario);
		horizontal.addComponent(usu);
		//Button  dejarDeSeguir= new Button();
		
		horizontal.addComponent(dejarDeSeguir);
		//dejarDeSeguir
		
	}
	
}