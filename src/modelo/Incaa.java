package modelo;

import java.util.ArrayList;
import java.util.List;



public class Incaa {
	
	private List<Pelicula> catalogo;
	private List<Genero> lstGeneros;

	public Incaa() {
		
		this.catalogo = new ArrayList<Pelicula>();
		this.lstGeneros = new ArrayList<Genero>();
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}
	public List<Genero> getLstGeneros() {
		return lstGeneros;
	}
	
	public boolean agregarPelicula(String pelicula, String nombreGenero) {
		
		Genero genero = this.traerGeneroPorNombre(nombreGenero);
		boolean seAgrego = true;
		if(genero == null) {
			seAgrego = false;
		}
		
		int id = 1;
		
		if(!catalogo.isEmpty()) {
			id = catalogo.get(catalogo.size() - 1).getIdPelicula() + 1;
		}
		
		Pelicula peli = new Pelicula(id, pelicula, genero);
		catalogo.add(peli);
		return seAgrego;
	}
	
	public boolean agregarGenero(String nombreGenero) {
	    int id = 1;
	    if(!lstGeneros.isEmpty()) {
	        id = lstGeneros.get(lstGeneros.size() - 1).getIdGenero() + 1;
	    }
	    Genero g = new Genero(id, nombreGenero);
	    return lstGeneros.add(g);
	}
	
	public Genero traerGeneroPorId(int idGenero) {
		Genero gen = null;
		int i = 0;
		while(gen == null && i < lstGeneros.size()) {
			if(lstGeneros.get(i).getIdGenero() == idGenero) {
				gen = lstGeneros.get(i);
			}
			i++;
		}
		return gen;
	}
	
	public Pelicula traerPeliculaPorId(int idPelicula) {
		
		Pelicula peli = null;
		int i = 0;
		
		while(peli == null && i < catalogo.size()) {
			
			if(catalogo.get(i).getIdPelicula() == idPelicula) {
				peli = catalogo.get(i);
			}
			
			i++;
		}
		
		return peli;
		
	}
	
	public Genero traerGeneroPorNombre(String nombreGenero) {
		Genero gen = null;
		for(Genero g : lstGeneros) {
			if(g.getGenero().equalsIgnoreCase(nombreGenero)) {
				gen = g;
			}
		}
		return gen;
	}
	
	public List<Pelicula> traerPeliculaPorString(String partePelicula){
		List<Pelicula> peliculasEncontradas = new ArrayList<Pelicula>();
		
		for(Pelicula peli : catalogo) {
			if(peli.getPelicula().indexOf(partePelicula) >= 0) {
				peliculasEncontradas.add(peli);
			}
		}
		
		return peliculasEncontradas;
		
	}
	
	public void modificarPelicula(int idPelicula, String pelicula) {
		Pelicula peli = this.traerPeliculaPorId(idPelicula);
		if(peli != null) {
			peli.setPelicula(pelicula);
		}else {
			System.out.println("No se puede modificar ya que no existe el id de la pelicula");
		}
	}
	
	public boolean eliminarPelicula(int idPelicula) {
		Pelicula peli = this.traerPeliculaPorId(idPelicula);
		boolean seElimino = false;
		if(peli != null) {
			seElimino = catalogo.remove(peli);
		}
		return seElimino;
	}

	public List<Pelicula> traerPeliculasPorGenero(String nombreGenero){
		List<Pelicula> pelisEncontradas = new ArrayList<Pelicula>();
		for(Pelicula peli : catalogo) {
			if(peli.getGenero().getGenero().equalsIgnoreCase(nombreGenero)) {
				pelisEncontradas.add(peli);
			}
		}
		return pelisEncontradas;
	}
	
	
	
}
