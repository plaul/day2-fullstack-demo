package sem3.firstrest.fullbackendday2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sem3.firstrest.fullbackendday2.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {}
