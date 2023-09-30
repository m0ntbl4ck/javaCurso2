import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import static java.util.Calendar.*;
import java.util.Locale;

public class EjemploDateTimeFormatter {

    public static void main(String[] args) {
        //fecha formato ISO
        LocalDateTime fecha1 =  LocalDateTime.of(2004,JULY,23,12,32,0,0 );
       LocalDateTime fecha2 = LocalDateTime.now();
        //Creacion de formatos de fcha
        DateTimeFormatter fechaFormateada1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
         DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
         DateTimeFormatter formatoPersonalizado2 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
         
        String fecha12 = fecha1.format(fechaFormateada1);
        
        System.out.println(fecha12);
        
        System.out.println(fecha2.format(formatoPersonalizado));
       //fecha formato ISO
        System.out.println(fecha12);
        
       
        
      
        
    }
}
