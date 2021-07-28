package course.bean;

public class AddGradesBean 
{
  private String Department;
  private int id;
  private String name;
  private String subject;
  private int grades;
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	this.Department = department;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getGrades() {
	return grades;
}
public void setGrades(int grades) {
	this.grades = grades;
}
}
