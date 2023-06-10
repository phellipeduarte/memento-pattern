public class EstadoCivilCasado implements CidadaoEstadoCivil{

    private static EstadoCivilCasado instancia = new EstadoCivilCasado();

    private EstadoCivilCasado() {}

    public static EstadoCivilCasado getInstancia(){ return instancia; }

    public String getEstadoCivil(){ return "Casado"; }
}
