package universitiesservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import universitiesservice.dto.UniversityRequest;
import universitiesservice.entities.University;
import universitiesservice.services.UniversityService;
import universitiesservice.services.UniversityServiceImp;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/list")
    public List<University> getUniversities() {
     return universityService.getUniversities();
    }

    @GetMapping("/{id}")
    public University getUniversity(@PathVariable Long id){
        return universityService.getUniversityById(id);
    }


    @PostMapping("/add")
    public University addUniversity(@RequestBody University university){
        return universityService.saveUniversity(university);
    }

    @PutMapping("/update/{id}")
    public University updateUniversity(@PathVariable Long id, @RequestBody UniversityRequest universityRequest){
        University existingUniversity = universityService.getUniversityById(id);
        existingUniversity.setId(id);
        existingUniversity.setName(universityRequest.getName());
        existingUniversity.setCode(universityRequest.getCode());
        existingUniversity.setRegistration_id(universityRequest.getRegistration_id());
        return universityService.updateUniversity(existingUniversity);
    }
}
