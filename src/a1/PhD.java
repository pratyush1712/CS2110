package a1;
/** NetId: ps2245, as2839. Time spent: hh hours, mm minutes. <br>
 * What I thought about this assignment: <br>
 * Replace this with your comment, using as many lines as you want. */

 /** An instance maintains info about the PhD of a person. */


public class PhD {
	private String name;
	private int month;
	private int year;
	private PhD advisorOne;
	private PhD advisorTwo;
	private int numAdvisees;
	
	public PhD(String n, int y, int m) {
		name = n;
		year = y;
		month = m;
		advisorOne = null;
		advisorTwo = null;
		numAdvisees = 0;
	}
	
	public String name() {
		return name;
	}
	
	public String date() {
		return String.valueOf(month)+"/"+String.valueOf(year);
	}

	public PhD advisor1() {
		return advisorOne;
	}
	
	public PhD advisor2() {
		return advisorTwo;
	}
	
	public int advisees() {
		return numAdvisees;
	}
	
	public void addAdvisor1(PhD p) {
		assert advisorOne==null && p!=null;
		
		advisorOne = p;
		advisorOne.numAdvisees++;
	}
	
	public void addAdvisor2(PhD p) {
		assert advisorOne!=null && advisorTwo==null && p!=null && p!=advisorOne; 
		
		advisorTwo = p;
		advisorTwo.numAdvisees++;
	}
	
	public PhD (String n, int y, int m, PhD p1, PhD p2) {
		assert n.length()>=2;
		assert m>=1 && m<=12;
		assert p1!=null && p2!=null;
		assert p1!=p2;
		
		this(n,y,m);
		advisorOne = p1;
		advisorTwo = p2;
	}
	
	public boolean gotBefore(PhD p) {
		return (p.year > year) || (p.year == year && p.month>month);
	}
	
	public boolean isSiblingOf(PhD p) {
		assert p!=null;
		
		return advisorOne==p.advisorOne || advisorTwo==p.advisorTwo;
	}
}
