package universitiesservice.entities;

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
public class UniversityCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String code;

    private String state;

    @OneToMany(mappedBy = "universitycategory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<University> university = new ArrayList<>();
}
