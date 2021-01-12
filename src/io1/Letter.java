package io1;

public class Letter implements Comparable<Letter>{
	
	private char ch;
	private int count;
	
	// 처음에는 ch만 필요 ,숫자는 다 0
	public Letter(char ch) {
		super();
		this.ch = ch;
		this.count = 0;
	}

	public void inc() {
		this.count++;
	}
	
	public char getCh() {
		return ch;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Letter [ch=" + ch + ", count=" + count + "]";
	}

	@Override
	// int = 앞으로 갈껀지 뒤로 갈껀지 , o = other(다른 것과 비교)
	public int compareTo(Letter other) {
		// TODO Auto-generated method stub
		return other.count - this.count;
		// 나의 count숫자와 other의 카운트를 비교
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ch;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals "+ obj);
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (ch != other.ch)
			return false;
		return true;
	}
	
	
}
