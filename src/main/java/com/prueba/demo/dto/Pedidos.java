package com.prueba.demo.dto;

public class Pedidos {
 private int idPedido;
 private double total;
 private String fecha;
public int getIdPedido() {
	return idPedido;
}
public void setIdPedido(int idPedido) {
	this.idPedido = idPedido;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
@Override
public String toString() {
	return "Pedidos [idPedido=" + idPedido + ", total=" + total + ", fecha=" + fecha + "]";
}
 
 
}
