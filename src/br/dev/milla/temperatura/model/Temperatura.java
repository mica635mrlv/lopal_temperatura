package br.dev.milla.temperatura.model;

public class Temperatura {

	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaFahreinheit() {
		double fahreinheit = (celsius * 1.8) + 32;
		return fahreinheit;
	}
	
	public double converterParaKevin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
}
