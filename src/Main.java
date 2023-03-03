import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria");
        mentoria.setData(LocalDate.now());


        //Saídas
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java Developer");
        bootCamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo");
        devRicardo.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos " + devRicardo.getConteudosInscritos());
        devRicardo.progredir();
        System.out.println("Conteúdos Inscritos " + devRicardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devRicardo.getConteudosConcluidos());
        System.out.println("XP -> " + devRicardo.calcularTotalXP());

        System.out.println("-------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devJoao.getConteudosConcluidos());
        System.out.println("XP -> " + devJoao.calcularTotalXP());




    }
}
