package cz.mkdev.exampub.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_order")
public class UserOrder {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//    private Long userId;

    @OneToMany(mappedBy = "userOrder")
    private List<OrderedItems> orderedItems;
}
