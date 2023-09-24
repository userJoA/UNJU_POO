package ar.edu.unju.fi.poo.Practico5.Dominio;

import ar.edu.unju.fi.poo.Practico5.Util.BeneficiosClientes;

public class ClienteGC extends Cliente{

	private Double descuento;

	public ClienteGC(Integer dni, String nombre, String email, int telefono, String localidad) {
		super(dni, nombre, email, telefono, localidad);
		this.descuento = BeneficiosClientes.DESCUENTO;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return "ClienteGrandesCompras";
	}

	@Override
	public String toString() {
		return super.toString()+ " ClienteGrandesCompras descuento=" + descuento + "]";
	}
	
}
