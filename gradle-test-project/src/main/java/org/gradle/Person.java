package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    
    private final String lastName;
    
    private final String fistName;

    public Person(String lastName, final String fistName) {
        this.lastName = lastName;
        this.fistName = fistName;
        System.err.println("");
        System.err.println("");
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
