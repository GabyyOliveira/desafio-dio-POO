package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	//CONSTRUCTOR
	public Curso() {
		
	}
	
	//GETTERS AND SETTERS
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso:" + getTitulo() + "\n" +
				"| Descricao:" + getDescricao() + "\n" +
				"| Carga Horaria: " + cargaHoraria  + "\n";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
}
