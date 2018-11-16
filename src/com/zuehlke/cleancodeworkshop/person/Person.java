package com.zuehlke.cleancodeworkshop.person;

public class Person {
	private String familyName;
	private String givenName;

	private PersonNameStrategy personNameStrategy;

	public Person(String familyName, String givenName, PersonNameStrategy personNameStrategy) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.personNameStrategy = personNameStrategy;
	}

	@Override
	public String toString() {
		return personNameStrategy.nameString(familyName, givenName);
	}
}
