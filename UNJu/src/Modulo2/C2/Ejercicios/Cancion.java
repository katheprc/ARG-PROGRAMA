package Modulo1.C2.Ejercicios;

public class Cancion {
	
	private String titulo, autor, album;

	public Cancion() {
	}

	public Cancion(String titulo, String autor, String album) {
		this.titulo = titulo;
		this.autor = autor;
		this.album = album;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
}
