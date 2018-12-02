package uppgift2;

import java.util.ArrayList;

public class Dotterbolag {
	
	private String nr;
	private String namn;
	private ArrayList<Anstalld> anstallda = new ArrayList<Anstalld>();
	private ArrayList<Projekt> projekt = new ArrayList<Projekt>();
	
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
	public String getNamn() {
		return namn;
	}
	public void setNamn(String namn) {
		this.namn = namn;
	}
	public ArrayList<Anstalld> getAnstallda() {
		return anstallda;
	}
	public void setAnstallda(ArrayList<Anstalld> anstallda) {
		this.anstallda = anstallda;
	}
	public void laggTillAnstalld (Anstalld anstalld) {
		anstallda.add(anstalld);
	}
	public double totalSalary() {
		double sum = 0;
		
		for(Anstalld tmp : anstallda) {
			sum = sum + tmp.getSalary();
		}
		return sum;
	}
	public Anstalld hittaAnstalld(String pnr) {
		
		for(Anstalld tmp : anstallda) {
			if(tmp.getPnr().equals(pnr)) {
				return tmp;
			}
		}
		return null;
	}
	public ArrayList<Projekt> getProjekt() {
		return projekt;
	}
	public void setProjekt(ArrayList<Projekt> projekt) {
		this.projekt = projekt;
	}
	public void laggTillProjekt (Projekt projekt) {
		this.projekt.add(projekt);
	}
}
