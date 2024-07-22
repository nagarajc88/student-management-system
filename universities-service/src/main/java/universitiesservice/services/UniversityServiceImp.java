package universitiesservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import universitiesservice.entities.University;
import universitiesservice.exceptions.NoSuchUniversityExistsException;
import universitiesservice.repositories.UniversityCategoryRepository;
import universitiesservice.repositories.UniversityRepository;

import java.util.List;

@Service
public class UniversityServiceImp implements UniversityService{


    @Autowired
    private UniversityCategoryRepository universityCategoryRepository;

    @Autowired
    private UniversityRepository universityRepository;


    @Override
    public University getUniversityById(Long id) {
        return universityRepository.findById(id).orElseThrow( () -> new NoSuchUniversityExistsException(" No University Present with ID: " +id));
    }

    @Override
    public List<University> getUniversities() {
        return universityRepository.findAll();
    }

    @Override
    public University addUniversity(Long categoryId, University universityRequest) {
       return universityCategoryRepository.findById(categoryId).map(category -> {
            universityRequest.setUniversitycategory(category);
            return universityRepository.save(universityRequest);
        }).orElseThrow(()-> new NoSuchUniversityExistsException("Not found category"));
    }

    @Override
    public University updateUniversity(Long categoryId, Long id, University universityRequest) {
        return universityCategoryRepository.findById(categoryId).map(category -> {
                universityRequest.setUniversitycategory(category);
                University u = universityRepository.findById(id).orElseThrow(()-> new NoSuchUniversityExistsException("Not found University"));
                if(u == null){
                    throw new NoSuchUniversityExistsException("mllml");
                }
                u.setName(universityRequest.getName());
                u.setCode(universityRequest.getCode());
                return universityRepository.save(u);
        }).orElseThrow(()-> new NoSuchUniversityExistsException("Not found category"));
    }
}
