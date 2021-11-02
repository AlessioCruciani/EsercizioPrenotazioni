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
public class Main {
    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);
        Prenotazione[] prenotazioni;
        
        Campo c = new Campo();
        char scelta;
        do {
			System.out.println(); //riga bianca
			System.out.println("OPERAZIONI DISPONIBILI");
			System.out.println("   [A]ggiungi nuova prenotazione");
			System.out.println("   [R]imuovi una prenotazione");
                        System.out.println("   [U]scita dal programma");
                        System.out.println("   [L]ista prenotazioni");
			System.out.print("scelta: ");
			scelta = input.next().charAt(0);
                                //input.next().charAt(0);
			
                        //input.nextLine(); //gestisce "a capo"

			System.out.println(); //riga bianca
			
			switch (scelta) {
                            // caso "Apertura nuovo conto"
			case 'A':
				c.addPrenotazione();
				break;

			// caso "Saldo"
			case 'S': 
				//rimuoviPrenotazione();
				break;
                        case 'L': 
                                c.riepilogoPrenotazioni();
                                break;
                                
                        default: System.out.println("Inserire solo lettere consentite");
                        }
                        System.out.println();
        }while (scelta!='U');
    
    /*
    private void aggiungiPrenotazione(){
        boolean controllo;
        
        if(Campo.addPrenotazione()){
            
        }
    */ 
}
}