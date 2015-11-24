package org.gradle;

import org.apache.commons.collections.list.GrowthList;
import org.joda.time.DateTime;

public class Person {
    private final String name;
    
    private final String lastName;
    
    private final String fistName;

    public Person(String name, String lastName, final String fistName) {
        this.name = name;
        this.lastName = lastName;
        this.fistName = fistName;
        new GrowthList();
    }

    public String getName() {
        return name;
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
