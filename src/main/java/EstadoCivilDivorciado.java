public class EstadoCivilDivorciado implements CidadaoEstadoCivil{

    private static EstadoCivilDivorciado instancia = new EstadoCivilDivorciado();

    private EstadoCivilDivorciado() {}

    public static EstadoCivilDivorciado getInstancia(){ return instancia; }

    public String getEstadoCivil(){ return "Divorciado"; }
}
