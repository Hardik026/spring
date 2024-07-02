package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import java.util.Properties;

public class Emp {

	private String name;
	private List<String> addresses;
	private Set<String> phones;
	private Map<String,String> courses;
	private Properties pros;
	
	
	
	public Emp(String name, List<String> addresses, Set<String> phones, Map<String, String> courses, Properties pros) {
		super();
		this.name = name;
		this.addresses = addresses;
		this.phones = phones;
		this.courses = courses;
		this.pros = pros;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addresses, courses, name, phones);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(addresses, other.addresses) && Objects.equals(courses, other.courses)
				&& Objects.equals(name, other.name) && Objects.equals(phones, other.phones);
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", addresses=" + addresses + ", phones=" + phones + ", courses=" + courses
				+ ", pros=" + pros + "]";
	}
	public Emp(String name, List<String> addresses, Set<String> phones, Map<String, String> courses) {
		super();
		this.name = name;
		this.addresses = addresses;
		this.phones = phones;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
}
