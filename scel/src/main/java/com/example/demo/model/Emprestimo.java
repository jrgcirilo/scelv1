package com.example.demo.model;

public class Emprestimo {

private String isbn;
private String ra;
private String dataEmprestimo;
private String dataDevolucao;
private String dataDevolucaoPrevista;

public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getRa() {
	return ra;
}
public void setRa(String ra) {
	this.ra = ra;
}
public String getDataEmprestimo() {
	return dataEmprestimo;
}
public void setDataEmprestimo(String dataEmprestimo) {
	this.dataEmprestimo = dataEmprestimo;
}
public String getDataDevolucao() {
	return dataDevolucao;
}
public void setDataDevolucao(String dataDevolucao) {
	this.dataDevolucao = dataDevolucao;
}
public String getDataDevolucaoPrevista() {
	return dataDevolucaoPrevista;
}
public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
	this.dataDevolucaoPrevista = dataDevolucaoPrevista;
}
}