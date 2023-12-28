package in.laptop.entities;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "STUDENT_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	
	@NotBlank(message = "Sname can't be null & contain 1 or more characters")
	private String sname;
	
	@NotBlank(message = "email should not be empty")
	private String email;
	
	@NotBlank(message = "please choose your gender")
	private String gender;
	
	@JdbcTypeCode(SqlTypes.JSON)
	private List<Course> course;
	@JdbcTypeCode(SqlTypes.JSON)
	private List<Timings> timings;

}
