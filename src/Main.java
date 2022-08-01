import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTabata = new Dev();
        devTabata.setNome("Tabata");
        devTabata.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tabata:" + devTabata.getConteudosInscritos());
        devTabata.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tabata: " + devTabata.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Tabata:" + devTabata.getConteudosConcluidos());
        System.out.println("XP:" + devTabata.calcularTotalXp());

        System.out.println("----------");


        Dev devGiovanna = new Dev();
        devGiovanna.setNome("Giovanna");
        devGiovanna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovanna" + devGiovanna.getConteudosInscritos());
        devGiovanna.progredir();
        devGiovanna.progredir();
        devGiovanna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Giovanna: " + devGiovanna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Giovanna: " + devGiovanna.getConteudosConcluidos());
        System.out.println("XP:" + devTabata.calcularTotalXp());
    }
}
