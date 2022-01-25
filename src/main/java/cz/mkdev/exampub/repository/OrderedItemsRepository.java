package cz.mkdev.exampub.repository;

import cz.mkdev.exampub.model.OrderedItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedItemsRepository extends JpaRepository<OrderedItems, Long> {
}
