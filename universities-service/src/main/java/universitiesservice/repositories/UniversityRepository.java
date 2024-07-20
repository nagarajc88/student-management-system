package universitiesservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import universitiesservice.entities.University;

import java.util.List;
import java.util.Optional;

public interface UniversityRepository extends JpaRepository<University, Long> { }
