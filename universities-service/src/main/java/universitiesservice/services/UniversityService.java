package universitiesservice.services;

import org.springframework.http.ResponseEntity;
import universitiesservice.entities.University;
import java.util.List;
import java.util.Optional;

public interface UniversityService {

    University getUniversityById(Long id);

    List<University> getUniversities();

    University addUniversity(Long categoryId, University university);

    University updateUniversity(Long categoryId, Long id, University university);
}
