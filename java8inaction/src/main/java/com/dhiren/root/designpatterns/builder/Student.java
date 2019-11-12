
package com.dhiren.root.designpatterns.builder;

public class Student {

	static class Builder {
		private String name;
		private String course;
		private String city;
		private String country;

		public Builder() {

		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder course(String course) {
			this.course = course;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Student build() {
            return new Student(this);
		}
	}

	public Student(Builder builder) {
		this.course = builder.course;
		this.city = builder.city;
		this.country = builder.country;
		this.name = builder.name;
	}

	private final String name;
	private final String course;
	private final String city;
	private final String country;

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", course='" + course + '\'' + ", city='"
		        + city + '\'' + ", country='" + country + '\'' + '}';
	}
}
