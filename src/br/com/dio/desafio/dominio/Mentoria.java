package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	//QUANDO EU CRIAR UMA MENTORIA E CHAMAR O METODO CALCULARXP O XP REFERENTE A MENTORIA SERÁ O XP_PADRAO + 20
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	public Mentoria() {
		
	}
	//GETTERS AND SETTERS
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria"
				+ " {titulo:" + getTitulo() + "\n" +
				", descricao:" + getDescricao() + "\n" +
				", data:" + data + "}";
	}
	
	

}
