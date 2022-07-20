import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria);
		
	}

}
