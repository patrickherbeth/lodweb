package model;

import java.util.ArrayList;

import movietagging.Category;

public class Tag {
	private int id;
	private String name;
	private double score;
	private ArrayList<Category> categories;

	public Tag(String name) {
		this.name = name;
		this.score = 0.0;
	}

	public Tag(int id, String name) {
		this.id = id;
		this.name = name;
		this.categories = new ArrayList<>();
		this.score = 0.0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public double getScore() {
		return this.score;
	}
	
	public void addCategory(Category category) {
		this.categories.add(category);
	}
	
	public ArrayList<Category> getCategories(){
		return this.categories;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		if (id != other.id)
			return false;
		return true;
	}
}