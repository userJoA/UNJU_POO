package ar.edu.unju.fi.poo.Practico5.Dominio;

import ar.edu.unju.fi.poo.Practico5.Util.BeneficiosClientes;

public class ClienteCuentaCorriente extends Cliente{
	
	private double limiteMensualCuenta;

	public ClienteCuentaCorriente(Integer dni, String nombre, String email, int telefono, String localidad) {
		super(dni, nombre, email, telefono, localidad);
		this.limiteMensualCuenta = BeneficiosClientes.LIMITE_MENSUAL_DESCUENTO;
	}

	public double getLimiteMensualCuenta() {
		return limiteMensualCuenta;
	}

	public void setLimiteMensualCuenta(double limiteMensualCuenta) {
		this.limiteMensualCuenta = limiteMensualCuenta;
	}



	

}
