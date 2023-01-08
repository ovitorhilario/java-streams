import com.hypecamps.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataIncial = LocalDate.now();
        LocalDate dataFinal = LocalDate.now().plusDays(30);

        Curso curso1 = new Curso();
        curso1.setName("JavaScript");
        curso1.setDescricao("ES6 Features");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setName("Python");
        curso2.setDescricao("3.X versions");
        curso2.setCargaHoraria(7);

        Mentoria mentor1 = new Mentoria();
        mentor1.setName("Guilherme");
        mentor1.setDescricao("Autor do curso JVES6 e Python 3.X");

        Dev dev1 = new Dev();
        dev1.setName("Jao");

        Dev dev2 = new Dev();
        dev2.setName("Pedro");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDataInicial(dataIncial);
        bootcamp.setDataFinal(dataFinal);
        bootcamp.setNome("Imersao Dev");
        bootcamp.setDescricao("Aprenda a programar conosco!");

        bootcamp.getCursos().add(curso1);
        bootcamp.getCursos().add(curso2);
        bootcamp.getDevs().add(dev1);
        bootcamp.getDevs().add(dev2);
        bootcamp.getMentorias().add(mentor1);

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        bootcamp.exibirCursos();

        dev1.progredir();

        dev1.exibirCursos();
        dev2.exibirCursos();

    }
}