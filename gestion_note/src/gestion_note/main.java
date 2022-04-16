package gestion_note;

public class main {
	public static void testetudiant(){
		Etudiant e1,e2,e3;
		e1=new Etudiant(1,"hamid");
		e2=new Etudiant(2, "driss");
		e3=new Etudiant(1,"youssef");
		e1.setnote(15);
		e2.setnote(12);
		e3.setnote(16);
		Listetudiants mesetudiants=new Listetudiants();
		mesetudiants.add(e1);
		mesetudiants.add(e2);
		mesetudiants.add(e3);
		
	}
	
		
	}


