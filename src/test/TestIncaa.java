package test;

import modelo.Incaa;

public class TestIncaa {

	public static void main(String[] args) {
		
		Incaa incaa = new Incaa();
		
		
		incaa.agregarGenero("Humor");
		incaa.agregarGenero("Accion");
		incaa.agregarPelicula("Chespirito", "Humor");
		incaa.agregarPelicula("Los tres chiflados", "humor");
		incaa.agregarPelicula("Oppenheimer", "accion");
		incaa.agregarPelicula("Interstelar", "accion");
		System.out.println(incaa.getCatalogo());
		System.out.println("Pelicula con el id 3");
		System.out.println(incaa.traerPeliculaPorId(3));
		System.out.println("Peliculas con la letra O");
		System.out.println(incaa.traerPeliculaPorString("O"));
		System.out.println("Peliculas de Accion");
		System.out.println(incaa.traerPeliculasPorGenero("accion"));
	}

}
