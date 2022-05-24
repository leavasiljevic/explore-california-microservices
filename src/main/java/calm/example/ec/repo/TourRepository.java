package calm.example.ec.repo;

import calm.example.ec.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository <Tour,Integer> {
}
