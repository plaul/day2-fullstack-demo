package sem3.firstrest.fullbackendday2.configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import sem3.firstrest.fullbackendday2.entity.Student;
import sem3.firstrest.fullbackendday2.repositories.StudentRepository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class DataSetup implements CommandLineRunner {

    List<String> students =  new ArrayList<String>(Arrays.asList(
            "Adrian Enachi",
            "Aiste Kiausaite",
            "Alex Holst Hersfeldt",
            "Alexander John Condon",
            "Ana Karina Caro Hoyos",
            "Andre Jeronimo Camargo Bittencourt",
            "Andrei Cosmin Stan",
            "Artiom Tofan",
            "Bartosz Kochanski",
            "Chiara Visca",
            "Christine Wangari Kanyotu",
            "Christopher Leigh Millington",
            "Daniel Kohari",
            "Dominic Smith",
            "Georgi Emilov Dimitrov",
            "Gloria Grofova",
            "Juan Ignacio Nicolai",
            "Julieta Martina Amado",
            "Justas Zdanavicius",
            "Karolina Barbara Kwiatkowska",
            "Karolina Urnieziute",
            "Krishna Prasad Khanal",
            "Lars Rugholm Riel",
            "Madalin Petru Loghin",
            "Mahfuzur Rahman Shawon",
            "Mareks Lipnickis",
            "Mikkel Fehrmann Vermehren",
            "Nikolai Schreiber Hochloff Lenander",
            "Omar Said Farah",
            "Patrik Selecky",
            "Paul David Broch",
            "Pawel Stepien",
            "Periklis Vasileios Tsopanakos",
            "Petru-Razvan Ilisei",
            "Samuel Bartek",
            "Simon Bucko",
            "Snorri Sigurjónsson",
            "Tom Billington",
            "Veselin Plamenov Ivanov",
            "Vlad Bogdan Chivu",
            "Vlad-Radu Garau",
            "Zoan Leonela Nataren Peralta"));

    final StudentRepository studentRepository;

    public DataSetup(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXxxx");
        for(String s : students){
            studentRepository.save(new Student(s));
        }
        System.out.println("Students in class: "+studentRepository.count());
    }
}
