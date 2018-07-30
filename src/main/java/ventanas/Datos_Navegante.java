package ventanas;

public class Datos_Navegante {

	private static int idUsuario=-1;
	private static String apodo="Señor";
	private static int idVideo=-1;
	//private static String id_Video="-1";
	private static int idListaReproducion=-1;
	private static String tipoUsuario= "Invitado";
	
	public static int getIdUsuario() {
		return idUsuario;
	}

	public static void setIdUsuario(int idUsuario) {
		Datos_Navegante.idUsuario = idUsuario;
	}

	public static String getApodo() {
		return apodo;
	}

	public static void setApodo(String apodo) {
		Datos_Navegante.apodo = apodo;
	}

	public static int getIdVideo() {
		return idVideo;
	}

	public static void setIdVideo(int idVideo) {
		Datos_Navegante.idVideo = idVideo;
	}
/*
	public static String getId_Video() {
		return id_Video;
	}

	public static void setId_Video(String id_Video) {
		Datos_Navegante.id_Video = id_Video;
	}
	
	*/

	public static int getIdListaReproducion() {
		return idListaReproducion;
	}

	public static void setIdListaReproducion(int idListaReproducion) {
		Datos_Navegante.idListaReproducion = idListaReproducion;
	}

	public static String getTipoUsuario() {
		return tipoUsuario;
	}

	public static void setTipoUsuario(String tipoUsuario) {
		Datos_Navegante.tipoUsuario = tipoUsuario;
	}
	
}
