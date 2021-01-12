package io1;

public class Letter1 implements Comparable<Letter1>{

	private char ch;
	private int count;

	public Letter1(char ch) {
		super();
		this.count = 0;
		this.ch = ch;
	}

	public void inc() {
		count++;
	}
	
	
	public char getCh() {
		return ch;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Letter1 [ch=" + ch + ", count=" + count + "]";
	}

	@Override
	public int compareTo(Letter1 other) {
		// TODO Auto-generated method stub
		return other.count - this.count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ch;
		result = prime * result + count;
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
		Letter1 other = (Letter1) obj;
		if (ch != other.ch)
			return false;
		if (count != other.count)
			return false;
		return true;
	}
	
	
	
}
