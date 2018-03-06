package Hibernate.mapping.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name="ST")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	public long getStudId() {
		return studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}

	@Column
	private String studentName;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@ManyToOne
	@JoinColumn(name="schoolId")
	private School schoolName;

	public School getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(School schoolName) {
		this.schoolName = schoolName;
	}
}
