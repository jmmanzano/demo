package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Coche {
	
 private String modelo;
 private String marca;
 public Coche() {
}
private List<Rueda> listaRuedas = new ArrayList<Rueda>();

public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public List<Rueda> getListaRuedas() {
	return listaRuedas;
}
public void setListaRuedas(List<Rueda> listaRuedas) {
	this.listaRuedas = listaRuedas;
}
}
