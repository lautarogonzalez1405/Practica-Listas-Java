package modelo;

import java.util.List;

public class Supermercado {
	private List<Producto> gondola;

	public List<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}

	@Override
	public String toString() {
		return "Supermercado [gondola=" + gondola + "]";
	}

	public Supermercado(List<Producto> gondola) {
		super();
		this.gondola = gondola;
	}
	
}
