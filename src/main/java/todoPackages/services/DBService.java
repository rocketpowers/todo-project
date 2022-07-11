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

		Todo t1 = new Todo(null, "estudar", "estudar spring 2 with angular 9",
				LocalDateTime.parse("07/07/2022 23:00", formatter), false);

		todoRepository.saveAll(Arrays.asList(t1));

	}

}
