package universitiesservice.services;

import org.springframework.stereotype.Service;
import universitiesservice.entities.University;
import universitiesservice.repositories.UniversityRepository;

import java.util.List;

@Service
public class UniversityServiceImp {
    private final UniversityRepository universityRepository;

    public UniversityServiceImp(UniversityRepository universityRepository) {
        super();
        this.universityRepository = universityRepository;
    }

}
