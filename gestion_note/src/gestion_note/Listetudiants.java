package gestion_note;

import java.util.ArrayList;
import java.util.List;

public class Listetudiants extends ArrayList<Etudiant> {
	public boolean add(Etudiant e) {
		if (this.contains(e))
			return false;
		return super.add(e);
	}

	public List<Etudiant> filtrer(Condition c) {
		Listetudiants l = new Listetudiants();
		for (int i = 0; i < this.size(); i++) {
			if (c.estVrai(this.get(i)) == true) {
				l.add(this.get(i));
			}
			return l;

		}
		return l;

	}
}
