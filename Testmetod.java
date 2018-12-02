package uppgift2;

public class Testmetod {

	public static void main(String[] args) {
		
		OOAB ooab = new OOAB ();
		
		ooab.setNr("556512");
		ooab.setNamn("Acme AB");
		
		Dotterbolag d1 = new Dotterbolag();
		Dotterbolag d2 = new Dotterbolag();
		
		d1.setNr("1a");
		d1.setNamn("Acme Sweden");
		d2.setNr("1b");
		d2.setNamn("Acme Denmark");
		
		Projekt p1 = new Projekt();
		Projekt p2 = new Projekt();
		Projekt p3 = new Projekt();
		
		p1.setNamn("nyinvestering");
		p1.setBudget(1000000);
		p2.setNamn("Databaser");
		p2.setBudget(300000);
		p3.setNamn("Underhåll");
		p3.setBudget(500000);
		
		Anstalld a1 = new Anstalld();
		Anstalld a2 = new Anstalld();
		Anstalld a3 = new Anstalld();
		
		a1.setPnr("1");
		a1.setNamn("Mats");
		a1.setSalary(30000);
		a2.setPnr("2");
		a2.setNamn("Viktoria");
		a2.setSalary(35000);
		a3.setPnr("3");
		a3.setNamn("Anders");
		a3.setSalary(40000);
		
		ooab.laggTillDotterbolag(d1);
		ooab.laggTillDotterbolag(d2);
		
		d1.laggTillProjekt(p1);
		d2.laggTillProjekt(p2);
		d2.laggTillProjekt(p3);
		
		d1.laggTillAnstalld(a3);
		d2.laggTillAnstalld(a2);
		d2.laggTillAnstalld(a1);
		a3.setDottebolag(d1);
		a1.setDottebolag(d2);
		a2.setDottebolag(d2);
		
		for(Dotterbolag tmp : ooab.getLista()) {
			System.out.println(tmp.getNamn());
			for(Anstalld tmpAnstalld : tmp.getAnstallda()) {
				System.out.println("- " + tmpAnstalld.getNamn());
			}
		}
		System.out.println("löneutgifter totalt:\n" + ooab.totalSalary());
		
		
	}

}
