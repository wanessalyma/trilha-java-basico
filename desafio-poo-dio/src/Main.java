import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso java");
        cursoJava.setDescricao("descrição curso java");
        cursoJava.setCargaHoraria(10);

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("curso Java Script");
        cursoJavaScript.setDescricao("descrição curso Java Script");
        cursoJavaScript.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria de java");
        mentoriaJava.setDescricao("descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("mentoria de java script");
        mentoriaJavaScript.setDescricao("descrição mentoria java script");
        mentoriaJavaScript.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Front e Back-end");
        bootcamp.setDescricao("Descrição Bootcamp Front e Back-end");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJavaScript);
        bootcamp.getConteudos().add(mentoriaJava);
        bootcamp.getConteudos().add(mentoriaJavaScript);

        Dev devLucia = new Dev();
        devLucia.setNome("Lucia");
        devLucia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucia:" + devLucia.getConteudosInscritos());
        devLucia.progredir();
        System.out.println("Conteúdos Inscritos Lucia:" + devLucia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucia:" + devLucia.getConteudosConcluidos());
        System.out.println("XP:" + devLucia.calcularTotalXp());

        System.out.println("-------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

  }
    
}
