package com.gontuseries.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	private String listOfValidHobbies;
	
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies = isValidHobby.listOfValidHobbies();
	}
	
	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx1) {

		if(studentHobby == null ) {
			return false;
		}
		if(studentHobby.matches(listOfValidHobbies)) {
			return true;
		}else {
			return false;
		}
	}

	
}
