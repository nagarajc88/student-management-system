package universitiesservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import universitiesservice.dto.UniversityRequest;
import universitiesservice.entities.University;
import universitiesservice.repositories.UniversityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public University getUniversityById(Long id){
        return universityRepository.findById(id).get();
    }

    public List<University> getUniversities(){
        return universityRepository.findAll();
    }

    public University saveUniversity(University university){
        return universityRepository.save(university);
    }

    public University updateUniversity(University university){
        return universityRepository.save(university);
    }
}
