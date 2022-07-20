import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
        //Instanciando um objeto
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao do curso");
		curso1.setCargaHoraria(3);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso Javascript");
		curso2.setDescricao("descricao do curso");
		curso2.setCargaHoraria(6);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria Javascript");
		mentoria.setDescricao("descricao da mentoria");
		mentoria.setData(LocalDate.now());;
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Do iniciante ao profissional em Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGaby = new Dev();
		devGaby.setNome("Gaby");
		devGaby.inscreverBootcamp(bootcamp);
		
		System.out.println(" ==================================================================== ");
		System.out.println("|                    " + bootcamp.getNome() + "                         |");
		System.out.println(" ==================================================================== ");
		System.out.println("|                                                                    |");
		System.out.println("|                          ALUNO(A): " + devGaby.getNome() + "                            |");
		System.out.println("|                                                                    |");
		
		System.out.println("|                       Conteudos inscritos:                         |");
		System.out.println("|"+ devGaby.getConteudosInscritos() + "              |");
		System.out.println(" ");
		System.out.println("Progredindo....");
		System.out.println(" ");
		devGaby.progredir();
		devGaby.progredir();
		System.out.println("Conteudos concluídos: ");
		System.out.println(devGaby.getConteudosConcluidos());
		System.out.println("Conteudos inscritos: ");
		System.out.println(devGaby.getConteudosInscritos());
		System.out.println("XP: " + devGaby.calcularTotalXp());
		
		
		
		System.out.println(" ");
		System.out.println(" ==================================================================== ");
		System.out.println("|                    " + bootcamp.getNome() + "                         |");
		System.out.println(" ==================================================================== ");
		System.out.println("-----------------------JOHN--------------------------");
		Dev devJohn = new Dev();
		devJohn.setNome("John");
		devJohn.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de John: " + devJohn.getConteudosInscritos());
		
	}

}
