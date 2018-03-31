package ventanas;

public class Zona_inicio_cabecera_registrado extends Zona_inicio_cabecera_registrado_ventanas {
	/*
	private JButon _mi_perfilB;
	private JButon _cerrar_sesionB;
	private Image _logo;
	public Usuario_registrado _unnamed_Usuario_registrado_;
	public Perfil_registrado _unnamed_Perfil_registrado_;
	public Buscador _unnamed_Buscador_;
	*/
	Cabecera_buscador_ventanas zici= new Cabecera_buscador();
	
	public Zona_inicio_cabecera_registrado(){
		buscador_layout.addComponent(zici);
	}
	
}