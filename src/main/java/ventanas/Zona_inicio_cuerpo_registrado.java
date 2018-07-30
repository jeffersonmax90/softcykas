package ventanas;

import com.vaadin.navigator.View;

public class Zona_inicio_cuerpo_registrado extends Zona_inicio_cuerpo_registrado_ventanas implements View {
	/*
	public Usuario_registrado _unnamed_Usuario_registrado_;
	public Videos_tendencia _unnamed_Videos_tendencia_;
	public Videos_de_suscripciones _unnamed_Videos_de_suscripciones_;
	public Videos_relacionados _unnamed_Videos_relacionados_;
	
	
	Videos_tendencia vt= new Videos_tendencia();
	Videos_de_suscripciones vds= new Videos_de_suscripciones();
	Videos_relacionados vr= new Videos_relacionados();
	*/
	public Zona_inicio_cuerpo_registrado(){
		vertical.removeAllComponents();
		vertical.addComponent(new Videos_tendencia());
		vertical.addComponent(new Videos_de_suscripciones());
		vertical.addComponent(new Videos_relacionados());
		
	}
	
}