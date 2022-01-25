package cz.mkdev.exampub.repository;

import cz.mkdev.exampub.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
