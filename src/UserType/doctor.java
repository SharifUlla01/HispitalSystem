/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserType;


public class doctor extends person {
    
    private String specialization;
	private int experience;

	public doctor(String userid, String pwd, String name, int age) {
		super(userid, pwd, "doctor", name, age);
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
    
}
