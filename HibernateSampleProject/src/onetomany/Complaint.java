package onetomany;

public class Complaint {
	private long compNum;
	private Customer cust;
	private String text;
	
	public long getCompNum() {
		return compNum;
	}
	public void setCompNum(long compNum) {
		this.compNum = compNum;
	}
	
	@Override
	public String toString() {
		return "Complaint [compNum=" + compNum + ", cust=" + cust + ", text="
				+ text + "]";
	}
	public Complaint() {
		super();
	}
	public Complaint(String text) {
		super();
		this.text = text;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
