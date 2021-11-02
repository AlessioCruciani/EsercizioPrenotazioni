/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aless
 */
public class Prenotazione {
    
    private String Nome;
    private String OraInizio;
    private String OraFine;
    private int idPrenotazione;
    
    private static int UltimoCodicePrenotazione = 0;
    
    public Prenotazione(String n, String oi, String of){
        
        UltimoCodicePrenotazione++;
        idPrenotazione = UltimoCodicePrenotazione;
        
        Nome = n;
        OraInizio = oi;
        OraFine = of;
        
    }
    public int getUltimoCodicePrenotazione(){
        return UltimoCodicePrenotazione;
    }
    public String getNomePrenotazione(){
        return Nome;
    }
    public String getOraInizio(){
        return OraInizio;
    }
    public String getOraFine(){
        return OraFine;
    }
}
