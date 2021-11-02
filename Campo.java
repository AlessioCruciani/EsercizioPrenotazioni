/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author aless
 */
public class Campo {

    
    
    
    
    
    Prenotazione[] prenotazioni = new Prenotazione[100];
    private static int prossimaPrenotazione=0;
    
    public void addPrenotazione(){
        boolean inserita = false;
        
        String n;
        String oi;
        String of;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il nominativo per la prenotazione: ");
        n = input.nextLine();
        
        System.out.println("Inserisci l'orario di inizio della prenotazione: ");
        oi = input.nextLine();
        
        System.out.println("Inserisci l'orario di fine della prenotazione: ");
        of = input.nextLine();
        
        if (prossimaPrenotazione<prenotazioni.length) {
			prenotazioni[prossimaPrenotazione] = new Prenotazione(n, oi, of);
			System.out.println("Creata prenotazione numero " + prenotazioni[prossimaPrenotazione].getUltimoCodicePrenotazione());
			prossimaPrenotazione++;
                        
	} else
			System.out.println("ERRORE: limite prenotazioni gestibili esaurito!!!");
        
        System.out.println("Prenotazione effettuata con successo!! ");
    }
    
    
    
    
    
    
    
    
     public void riepilogoPrenotazioni() {
		// per ogni oggetto in contiGestiti invoca i metodi
		// opportuni di ContoCorrente
		System.out.println("RIEPILOGO PRENOTAZIONI");
		int i=0;
		while (i<prenotazioni.length && prenotazioni[i]!=null) {
			Prenotazione p = prenotazioni[i];
			System.out.println("Prenotazione n. " + (i+1) + " Nome: " + p.getNomePrenotazione() + " Ora di inizio: " + p.getOraInizio() + " Ora di fine: " + p.getOraFine());
			i++;
		}
	}
}
