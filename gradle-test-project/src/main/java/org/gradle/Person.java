package org.gradle;

import org.apache.commons.collections.list.GrowthList;
import org.joda.time.DateTime;

public class Person {
    private final String name;
    
    private final String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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
}
