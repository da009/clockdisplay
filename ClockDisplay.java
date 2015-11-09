
/**
 *Imaginemos que tenemos un amigo programador en Java como nosotros que quiere hacer una aplicación para 
 *teléfonos Android consistente en un reloj en formato 24 horas,
 *que muestre las horas y minutos desde las 00:00 hasta las 23:59.
 *Como anda muy apurado de tiempo, nos pide que le hagamos parte del trabajo.
 *Concretamente necesita que le programemos una clase llamada ClockDisplay que:
 *
 *Permita fijar un momento determinado de tiempo expresado en horas y minutos.
 *Por ejemplo, si yo le indico a un método 23 y 45 como parámetros, el tiempo del reloj debe quedar
 *fijado a 23:45. El nombre del método debe ser setTime.
 *permita hacer avanzar un minuto el tiempo fijado. Evidentemente, el usuario podrá invocar este método
 *tantas veces como quiera. El nombre del método debe ser timeTick.
 *Devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos.
 *El nombre del método debe ser getTime. Ojo: la cadena siempre debe tener 5 caracteres.
 *Vete haciendo commits conforme le añades funcionalidad a tu clase y súbelo a GitHub.
 *
 *Es muy posible que no seas capaz de completar la actividad. No te preocupes,
 *el objetivo es intentarlo.
 */
public class ClockDisplay
{
    // hours
    private int horas;
    // minutes
    private int minutos;
    
    /**
     * Constructor de la clase ClockDisplay
     */
    public ClockDisplay ()
    {
        horas = 0 ;
        minutos = 0;
    }
     
    /**
     * Permite fijar la hora
     */
    public void setTime(int horaac, int minutoac)
    {   
        if (horaac >= 0 && horaac <= 23)
        {
            horas = horaac;
        }
        if (minutoac >= 0 && minutoac <= 59)
        {
            minutos = minutoac;
        }
    }
    
    public String getTime()
    {
        String horaac = "%02d:%02d";
        String horaresul = String.format (horaac,horas,minutos);
        return horaresul;
    }
    
    public void timeTick()
    {
        if (minutos >= 59 && horas >= 23)
        {
            minutos = 00;
            horas = 00;
        }
        else if (minutos >=59 && horas <= 23)
        {
            minutos = 00;
            horas = horas + 1;
        }
        else if (minutos < 59 && horas >= 23)
        {
            minutos = minutos + 1;
            horas = 00;
        }
        else
        {
            minutos = minutos +1;
        }
    }
}