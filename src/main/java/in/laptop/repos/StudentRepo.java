package in.laptop.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laptop.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
