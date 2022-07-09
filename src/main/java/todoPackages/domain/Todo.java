package todoPackages.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Todo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
	private String description;
	private LocalDateTime dateForFinished;
	private Boolean fineshed = false;

	public Todo() {
		super();

	}

	public Todo(Integer id, String title, String description, LocalDateTime dateForFinished, Boolean fineshed) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.dateForFinished = dateForFinished;
		this.fineshed = fineshed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDataParaFinalizar() {
		return dateForFinished;
	}

	public void setDataParaFinalizar(LocalDateTime dataParaFinalizar) {
		this.dateForFinished = dataParaFinalizar;
	}

	public Boolean getFineshed() {
		return fineshed;
	}

	public void setFineshed(Boolean fineshed) {
		this.fineshed = fineshed;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(id, other.id);
	}

}
