package universitiesservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import universitiesservice.entities.UniversityCategory;

public interface UniversityCategoryRepository extends JpaRepository<UniversityCategory, Long> {
}
