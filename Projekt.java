package uppgift2;

public class Projekt {
	
	private String namn;
	private double budget;
	private Dotterbolag projektdotterbolag;
	
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public Dotterbolag getProjektdotterbolag() {
		return projektdotterbolag;
	}
	public void setProjektdotterbolag(Dotterbolag projektdotterbolag) {
		this.projektdotterbolag = projektdotterbolag;
	}

}
