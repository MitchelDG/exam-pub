import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {

    private Long id;
    private String name;
    private boolean isActive;
    private Integer age;
    private Float pocket;
}
