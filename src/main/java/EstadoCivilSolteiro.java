public class EstadoCivilSolteiro implements CidadaoEstadoCivil{

    private static EstadoCivilSolteiro instancia = new EstadoCivilSolteiro();

    private EstadoCivilSolteiro() {}

    public static EstadoCivilSolteiro getInstancia(){ return instancia; }

    public String getEstadoCivil(){ return "Solteiro"; }
}
