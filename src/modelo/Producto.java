package modelo;

public class Producto {
	private int idProducto;
	private String producto;
	private int cantidad;
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	public Producto(int idProducto, String producto, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
}
