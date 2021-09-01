package sem3.firstrest.fullbackendday2.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sem3.firstrest.fullbackendday2.entity.Student;
import sem3.firstrest.fullbackendday2.repositories.StudentRepository;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class StudentController {

    StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping(value = "api/students")
    public Iterable<Student> getStudents(){

        return studentRepository.findAll();

    }
}

