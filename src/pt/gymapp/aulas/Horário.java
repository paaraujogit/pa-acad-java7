package pt.gymapp.aulas;

public class Horário {
    
   public  static Horário Manhã = new Horário (08.00,"Manhã");
   public static Horário Tarde = new Horário (12.00,"Tarde");
   public static Horário Noite = new Horário (19.00,"Noite");
    
    private double hora;
    private String periodo;

    public Horário(double hora, String periodo) {
        this.hora = hora;
        this.periodo = periodo;
    }
    
}
