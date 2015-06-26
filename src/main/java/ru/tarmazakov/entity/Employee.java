package ru.tarmazakov.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name = "employees")
@NamedQueries({@NamedQuery(name="Student.getAll",query="SELECT e FROM Student e")})

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private int employeeId;
	
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
    private String lastname;
    
    @Column(name = "position")
    private String position;

     
    public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


    public Employee(int employeeId, String firstname, String lastname, String position) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
    }
	public Employee(){}
}