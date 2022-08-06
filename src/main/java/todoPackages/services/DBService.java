package todoPackages.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoPackages.domain.Todo;
import todoPackages.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Java", "estudying spring boot", LocalDateTime.parse("07/07/2022 23:00", formatter),false);
		Todo t2 = new Todo(null, "mysql", "estudying mysql", LocalDateTime.parse("08/07/2022 23:00", formatter),false);
		Todo t3 = new Todo(null, "postgres", "estudying postgres", LocalDateTime.parse("09/07/2022 23:00", formatter),true);
		Todo t4 = new Todo(null, "sqlserver", "estudying sql", LocalDateTime.parse("10/07/2022 23:00", formatter),true);

		todoRepository.saveAll(Arrays.asList(t1,t2,t3,t4));

	}

}
