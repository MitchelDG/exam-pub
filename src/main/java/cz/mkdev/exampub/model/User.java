package cz.mkdev.exampub.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private Float pocket;

    @OneToMany(mappedBy = "user")
    private List<UserOrder> userOrderList;
}
