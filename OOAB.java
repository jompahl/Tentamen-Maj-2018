package uppgift2;

import java.util.ArrayList;

public class OOAB {
	
	private String nr;
	private String namn;
	private ArrayList<Dotterbolag> lista = new ArrayList<Dotterbolag>();
	
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
	public ArrayList<Dotterbolag> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Dotterbolag> lista) {
		this.lista = lista;
	}
	public void laggTillDotterbolag(Dotterbolag d) {
		lista.add(d);
	}
	public void laggTillAnstalld(String nr, Anstalld anstalld) {
		Dotterbolag tmpBolag = hittaDotterbolag(nr);
		
		if(tmpBolag != null) {
			anstalld.setDottebolag(tmpBolag);
			tmpBolag.laggTillAnstalld(anstalld);
		}
	}
	public Dotterbolag hittaDotterbolag(String nr) {
		for(Dotterbolag tmp : lista) {
			if(tmp.getNr().equals(nr)) {
				return tmp;
			}
		}
		return null;
	}
	public double totalSalary() {
		double sum = 0;
		
		for(Dotterbolag tmp : lista) {
			sum = sum + tmp.totalSalary();
		}
		return sum;
	}
	public Anstalld hittaAnstalld(String pnr) {
		
		for(Dotterbolag tmp : lista) {
			if(tmp.hittaAnstalld(pnr) != null) {
				return tmp.hittaAnstalld(pnr);
			}
		}
		return null;
	}

}
