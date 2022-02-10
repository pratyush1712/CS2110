package a1;
/** NetId: ps2245, as2839. Time spent: hh hours, mm minutes. <br>
 * What I thought about this assignment: <br>
 * Replace this with your comment, using as many lines as you want. */

 /** An instance maintains info about the PhD of a person. */


public class PhD {
	/** Name of the person with a PhD, a String of length > 1 */
	private String name;
	
	/** Month the PhD was awarded. In range 1..12 with 1 being January, etc */
	private int month;
	
	/** Year the PhD was awarded. Can be any integer */
	private int year;
	
	/** The first PhD advisor of this person —null if unknown. */
	private PhD advisorOne;
	
	/** The second advisor of this person —null if unknown or if the person has less than two advisors */
	private PhD advisorTwo;
	
	/** The number of PhD advisees of this person */
	private int numAdvisees;
	
	/**
	 * Constructor: an instance with name n, PhD year y, and PhD month m.
	 * The advisors are unknown, and there are 0 advisees.
	 * Precondition: n has at least 2 chars, and m is in 1..12.
	 */
	public PhD(String n, int y, int m) {
		assert n.length()>=2;
		assert m>=1 && m<=12;
		name = n;
		year = y;
		month = m;
		advisorOne = null;
		advisorTwo = null;
		numAdvisees = 0;
	}
	
	/**
	 * Return the name of this person.
	 */
	public String name() {
		return name;
	}
	
	/** Return the date this person got their PhD in the form
	 * "month/<year>"
	 * E.g. For February 2022, return "2/2022". 
	 */
	public String date() {
		return String.valueOf(month)+"/"+String.valueOf(year);
	}

	/**
	 * Return the first advisor of this PhD (null if unknown)
	 */
	public PhD advisor1() {
		return advisorOne;
	}
	
	/**
	 * Return the second advisor of this PhD (null if unknown or non-existent).
	 */
	public PhD advisor2() {
		return advisorTwo;
	}
	
	/**
	 * Return the number of PhD advisees of this person
	 */
	public int advisees() {
		return numAdvisees;
	}
	
	/**
	 * Add p as the first advisor of this person.
	 * Precondition: the first advisor is unknown and p is not null.
	 */
	public void addAdvisor1(PhD p) {
		assert advisorOne==null && p!=null;	
		advisorOne = p;
		advisorOne.numAdvisees++;
	}
	
	/**
	 * Add p as the second advisor of this PhD.
	 * Precondition: The first advisor is known, the second advisor is unknown, p is
	 * not null, and p is different from the first advisor
	 */
	public void addAdvisor2(PhD p) {
		assert advisorOne!=null && advisorTwo==null && p!=null && p!=advisorOne; 
		advisorTwo = p;
		advisorTwo.numAdvisees++;
	}
	
	public PhD (String n, int y, int m, PhD p1, PhD p2) {
	/**
	 * 
	 */
		this(n,y,m);
		assert p1!=null && p2!=null;
		assert p1!=p2;
		advisorOne = p1;
		advisorTwo = p2;
	}
	
	public boolean gotBefore(PhD p) {
	/**
	 * 
	 */
		assert p!=null;
		return (p.year > year) || (p.year == year && p.month>month);
	}
	
	public boolean isSiblingOf(PhD p) {
	/**
	 * 
	 */
		assert p!=null;
		
		return (p.advisorOne!=null && advisorOne!=null && advisorOne==p.advisorOne) || 
		(advisorTwo!=null && p.advisorTwo!=null 
		&& advisorTwo==p.advisorTwo);
	}
}
