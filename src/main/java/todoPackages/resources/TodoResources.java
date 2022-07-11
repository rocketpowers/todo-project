package todoPackages.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todoPackages.domain.Todo;
import todoPackages.services.TodoService;

@RestController
@RequestMapping(value="/todos")
public class TodoResources {
	
	@Autowired
	private TodoService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Integer id){
		Todo obj = service.findById(id);
		return ResponseEntity.ok(obj);		
		
	}

}
