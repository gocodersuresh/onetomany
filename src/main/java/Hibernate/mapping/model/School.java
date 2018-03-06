package Hibernate.mapping.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name="SC")
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long schoolId;
	@Column
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@OneToMany(mappedBy="schoolName",cascade=CascadeType.ALL)
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
