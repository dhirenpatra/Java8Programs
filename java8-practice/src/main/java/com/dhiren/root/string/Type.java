package com.dhiren.root.string;

import java.util.Arrays;

public enum Type {

	PRE_PAID("Pre-Paid"),

	COLLECT("Collect");

	public String getType() {
		return type;
	}

	private final String type;

	Type(String type) {
		this.type = type;
	}

	public static Type getSosFreightType(String code) {

		return Arrays.stream(values())
				.filter(ft -> ft.getType()
						.equals(code))
				.findAny()
				.orElse(null);
	}
}
