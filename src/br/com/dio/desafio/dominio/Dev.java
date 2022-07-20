package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	
	//GETTERS AND SETTERS
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Set<Conteudo> getConteudosInscritos() {
			return conteudosInscritos;
		}

		public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
			this.conteudosInscritos = conteudosInscritos;
		}

		public Set<Conteudo> getConteudosConcluidos() {
			return conteudosConcluidos;
		}

		public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
			this.conteudosConcluidos = conteudosConcluidos;
		}
	
	//MÉTODOS
	public void inscreverBootcamp(Bootcamp bootcamp) {
		//addAll eu estou pegando tudo oque tem dentro do bootcamp.getConteudos() e adicionando ao conteudos inscritos
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		//adiciono o dev ao bootcamp
		bootcamp.getDevsInscritos().add(this);
	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não estã matriculado em nenhum conteúdo!");
		}
	}
	
	public double calcularTotalXp() {
		//utilizamos o strem, pegamos cada conteudo de dentro do conteudos concluidos, pegamos o xp de cada conteudo e somamos
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
}
