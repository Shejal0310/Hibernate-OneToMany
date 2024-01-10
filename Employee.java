package Hibernate;

public class Employee 
{
	private int empid, salary;
	private String empname;
	
	public int getEmpid() 
	{
		return empid;
	}
	
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	
	public int getSalary() 
	{
		return salary;
	}
	
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	public String getEmpname() 
	{
		return empname;
	}
	
	public void setEmpname(String empname) 
	{
		this.empname = empname;
	}	
}