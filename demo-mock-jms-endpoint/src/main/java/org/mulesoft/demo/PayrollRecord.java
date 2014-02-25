package org.mulesoft.demo;

public class PayrollRecord {
	
	private Integer employeeId;
	private Double salaryBase;
	private String jobLevel;
	private Double contribution;
	private Double rate;
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setSalaryBase(Double salaryBase) {
		this.salaryBase = salaryBase;
	}
	
	public Double getSalaryBase() {
		return this.salaryBase;
	}
	
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	public String getJobLevel() {
		return this.jobLevel;
	}
	
	public void setContribution(Double contribution) {
		this.contribution = contribution;
	}
	
	public Double getContribution() {
		return contribution;
	}
	
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	public Double getRate() {
		return this.rate;
	}
}
