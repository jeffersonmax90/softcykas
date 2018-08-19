package ventanas;

public class Zona_cabecera_perfli_Registrado extends Zona_cabecera_perfli_Registrado_ventanas {
	public Zona_cabecera_perfli_Registrado() {
		vertical.removeAllComponents();
		vertical.addComponent(new Zona_cabecera_comun());
	}
}