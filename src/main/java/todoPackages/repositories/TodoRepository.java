package todoPackages.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todoPackages.domain.Todo;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
