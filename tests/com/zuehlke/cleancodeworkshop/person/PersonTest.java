package com.zuehlke.cleancodeworkshop.person;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

	@Test
	public void toString_defaultMode() {
		Person michael = new Person("Ammann", "Simon", PersonNameStrategyFactory.create("CH", false, false));
		assertEquals("Simon Ammann", michael.toString());
	}

	@Test
	public void toString_olympicModeAndCapitalize() {
		Person michael = new Person("Ammann", "Simon", PersonNameStrategyFactory.create("CH", true, true));
		assertEquals("Simon AMMANN", michael.toString());
	}

	@Test
	public void toString_chineseInNonOlympicNonCapitalize() {
		Person yao = new Person("Yao", "Ming", PersonNameStrategyFactory.create("CHN", false, false));
		assertEquals("Ming Yao", yao.toString());
	}

	@Test
	public void toString_chineseInOlympicMode() {
		Person yao = new Person("Yao", "Ming", PersonNameStrategyFactory.create("CHN", false, true));
		assertEquals("Yao Ming", yao.toString());
	}

	@Test
	public void toString_chineseInOlympicModeAndCapitalize() {
		Person yao = new Person("Yao", "Ming", PersonNameStrategyFactory.create("CHN", true, true));
		assertEquals("YAO Ming", yao.toString());
	}

}
