package cz.mkdev.exampub.repository;

import cz.mkdev.exampub.model.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<UserOrder, Long> {
}
