package in.laptop.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laptop.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
