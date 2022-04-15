package gestion_note;


public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	Etudiant(int id ,String nom)
	{
		this.note=10;
		this.id=id;
		this.nom=nom;
	};
	
		
	public String toString() {
		return "("+this.nom+ ":"+ this.note+ ")";
		};
		
    public boolean equals(Object obj) {
    	if (! (obj instanceof Etudiant) ){
			return false;
		}
	return	((Etudiant)obj).id==this.id;
    	
    	
    }


	@Override
	public int compareTo(Etudiant o1) {
		if (o1.note==this.note) return 0;
		if (o1.note<this.note)return 1;
		return -1;
	}  
   
    	
    
}
