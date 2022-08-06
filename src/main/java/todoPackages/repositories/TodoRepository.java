package todoPackages.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import todoPackages.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
	@Query("SELECT obj From Todo obj WHERE obj.finished = false ORDER BY obj.dateForFinished")
	List<Todo> findAllOpen();

	
	@Query("SELECT obj From Todo obj WHERE obj.finished = true ORDER BY obj.dateForFinished")
	List<Todo> findAllClose();

}
