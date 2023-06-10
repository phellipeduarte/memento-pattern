public class EstadoCivilSeparado implements CidadaoEstadoCivil{

    private static EstadoCivilSeparado instancia = new EstadoCivilSeparado();

    private EstadoCivilSeparado() {}

    public static EstadoCivilSeparado getInstancia(){ return instancia; }

    public String getEstadoCivil(){ return "Separado"; }
}
