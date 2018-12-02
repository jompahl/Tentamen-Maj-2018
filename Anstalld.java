package uppgift2;

public class Anstalld {
	
	private String pnr;
	private String namn;
	private double salary;
	private Dotterbolag dottebolag;
	
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Dotterbolag getDottebolag() {
		return dottebolag;
	}
	public void setDottebolag(Dotterbolag dottebolag) {
		this.dottebolag = dottebolag;
	}
}
