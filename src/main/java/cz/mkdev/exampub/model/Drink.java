package cz.mkdev.exampub.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "drink")
public class Drink {

    @Id
    @GeneratedValue
    private Long id;

    private String drinkName;

    private Float price;

    private boolean isForAdult;

    @JsonIgnore
    @OneToMany(mappedBy = "drink")
    private List<OrderedItems> orderedItems;

}
