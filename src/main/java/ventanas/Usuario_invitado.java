package ventanas;

public class Usuario_invitado extends Usuario_invitado_ventanas {
	/*
	public Zona_inicio_cabecera_invitado _unnamed_Zona_inicio_cabecera_invitado_;
	public Zona_inicio_cuerpo_invitado _unnamed_Zona_inicio_cuerpo_invitado_;
	*/
	
	Zona_inicio_cabecera_invitado zici= new Zona_inicio_cabecera_invitado();
	Zona_inicio_cuerpo_invitado zicuerpo=new Zona_inicio_cuerpo_invitado();
	
	public Usuario_invitado(){
		inicio.addComponent(zici);
		cuerpo.addComponent(zicuerpo);
	}
	
	
}