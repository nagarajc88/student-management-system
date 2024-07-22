package universitiesservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<University>> getUniversities() {
        List<University> universities = universityService.getUniversities();
        return new ResponseEntity<>(universities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<University> getUniversity(@PathVariable Long id){
        University university = universityService.getUniversityById(id);
        return new ResponseEntity<>(university, HttpStatus.OK);
    }


    @PostMapping("{categoryId}/add")
    public ResponseEntity<University> addUniversity(@PathVariable(value = "categoryId") Long categoryId, @RequestBody University universityRequest){
        University university = universityService.addUniversity(categoryId, universityRequest);
        return new ResponseEntity<>(university, HttpStatus.CREATED);
    }

    @PutMapping("{categoryId}/update/{id}")
    public ResponseEntity<University> updateUniversity(@PathVariable(value = "categoryId") Long categoryId, @PathVariable Long id, @RequestBody University universityRequest){
        University university = universityService.updateUniversity(categoryId, id, universityRequest);
        return new ResponseEntity<>(university, HttpStatus.OK);
    }
}
