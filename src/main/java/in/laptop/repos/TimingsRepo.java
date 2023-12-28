package in.laptop.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laptop.entities.Timings;

public interface TimingsRepo extends JpaRepository<Timings, Integer> {

}
