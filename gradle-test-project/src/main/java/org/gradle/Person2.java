package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person2 {
    
    private final String lastName;
    
    private final String fistName;

    public Person2(String lastName, final String fistName) {
        this.lastName = lastName;
        this.fistName = fistName;
        new GrowthList();
    }

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the fistName
	 */
	public String getFistName() {
		return fistName;
	}
}
