package com.revature.basics;

public class Bean {

	// members states and behaviors
	public String type;
	public String color;
	public Integer size;
	public Boolean isCooked;
	
	public Bean() {
		// TODO Auto-generated constructor stub
	}
	
	//sysout + CTRL + space = System.out.println();
	
//  CRTL +  /
//	Multi 
//	line auto
//	comment 
//  
	@Override
	// ALT + SHIFT + S + S
	public String toString() {
		return null;
	}

	@Override
	public int hashCode() {
		// ALT + SHIFT + S + H
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((isCooked == null) ? 0 : isCooked.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	// ALT + SHIFT + S + H
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bean other = (Bean) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (isCooked == null) {
			if (other.isCooked != null)
				return false;
		} else if (!isCooked.equals(other.isCooked))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
