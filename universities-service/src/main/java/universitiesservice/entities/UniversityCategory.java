package universitiesservice.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "universitycategory")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UniversityCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String code;

    private String state;

    // if we give one to many and many to one the relationship will get conflict so need to use JsonIdentityInfo as class level annotation.
    // @OneToMany(mappedBy = "universitycategory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // private List<University> universities;

    public UniversityCategory(String name, String code, String state){
        this.name= name;
        this.code = code;
        this.state = state;
    }

}
