
package com.location;

/**
 *
 * @author mont_
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class AplicacionFecha {
    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    Locale ruLocale = new Locale("ru", "RU");//Rusia
  Locale esLocale = new Locale("es", "ES");//Colombia

    Locale currentLocale = Locale.US;     
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", esLocale);
         
    LocalDateTime today = LocalDateTime.now();
    DateTimeFormatter df;

    public static void main(String[] args){
        AplicacionFecha aplicacionFecha = new AplicacionFecha();
        aplicacionFecha.ejecutar();        
    }
    
    public void ejecutar(){
        String linea = "";
        
        while (!(linea.equals("q"))){
            this.mostrarMenu();
            try { linea = this.br.readLine(); } 
            catch (IOException e){ 
              System.out.println("Error: " + e.getMessage()); }
            
            switch (linea){
                case "1": this.setIngles(); break;
               case "2": this.setEspanol(); break;
                case "3": this.setFrances(); break;
                case "4": this.setChino(); break;
                case "5": this.setRuso(); break;
            }
        }       
    }
    
    public void mostrarMenu(){
        pw.println("=== Aplicación de Fecha ===");
     
        // Fecha Completa
        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(currentLocale);
        pw.println(messages.getString("date1") + " " + today.format(df));
      
        // Fecha Larga
        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(currentLocale);
        pw.println(messages.getString("date2") + " " + today.format(df));
      
        // Fecha Corta
        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(currentLocale);
        pw.println(messages.getString("date3") + " " + today.format(df));
      
        // Fecha/Hora Media
        df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(currentLocale);
        pw.println(messages.getString("date4") + " " + today.format(df));

        // Hora Media
        df = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(currentLocale);
        pw.println(messages.getString("date5") + " " + today.format(df));
      
        pw.println("\n--- Elija una opción de idioma ---");
        pw.println("1. " + messages.getString("menu1"));
        pw.println("2. " + messages.getString("menu2"));
        
        pw.println("3. " + messages.getString("menu3"));
        pw.println("4. " + messages.getString("menu4"));
        pw.println("5. " + messages.getString("menu5"));
        pw.println("q. " + messages.getString("menuq"));
        System.out.print(messages.getString("menucommand") + " ");        
    }
    
    public void setIngles(){
        currentLocale = Locale.US;    
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);        
    }
    
    public void setFrances(){
        currentLocale = Locale.FRANCE;    
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }
    
    public void setChino(){
        currentLocale = Locale.SIMPLIFIED_CHINESE;    
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);  
    }
    
    public void setRuso(){
        currentLocale = ruLocale;    
        this.messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);        
    }
   
    public void setEspanol(){
        currentLocale = esLocale;    
        this.messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);        
    }
}

