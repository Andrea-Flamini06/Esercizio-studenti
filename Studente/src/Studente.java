
public class Studente {
	private final String nome;
	private final String cognome;
	private final int id;
	private final int annoImmatricolazione;

	
	Studente(String nome, String cognome, int id, int annoImmatricolazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
		this.annoImmatricolazione = annoImmatricolazione;
	}
		
	void printStudentInfo() {
		System.out.println("[Nome]: "+nome);
		System.out.println("[Cognome]: "+cognome);
		System.out.println("[Id]: "+id);
		System.out.println("[Anno Immatricolazione]: "+annoImmatricolazione);
		
		
	}

}
