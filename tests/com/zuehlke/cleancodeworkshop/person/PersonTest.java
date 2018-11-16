package com.zuehlke.cleancodeworkshop.person;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

	@Test
	public void toString_defaultMode() {
		Person michael = new Person("Ammann", "Simon", new PersonNameStrategy("CH", false, false));
		assertEquals("Simon Ammann", michael.toString());
	}

	@Test
	public void toString_olympicModeAndCapitalize() {
		Person michael = new Person("Ammann", "Simon", new PersonNameStrategy("CH", true, true));
		assertEquals("Simon AMMANN", michael.toString());
	}

	@Test
	public void toString_chineseInNonOlympicNonCapitalize() {
		Person yao = new Person("Yao", "Ming", new PersonNameStrategy("CHN", false, false));
		assertEquals("Ming Yao", yao.toString());
	}

	@Test
	public void toString_chineseInOlympicMode() {
		Person yao = new Person("Yao", "Ming", new PersonNameStrategy("CHN", false, true));
		assertEquals("Yao Ming", yao.toString());
	}

	@Test
	public void toString_chineseInOlympicModeAndCapitalize() {
		Person yao = new Person("Yao", "Ming", new PersonNameStrategy("CHN", true, true));
		assertEquals("YAO Ming", yao.toString());
	}

}
