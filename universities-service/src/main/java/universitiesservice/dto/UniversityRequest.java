package universitiesservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversityRequest {
    private String name;
    private String code;
    private String registration_id;
    private String universitycategory_id;
}
