public class EstadoCivilViuvo implements CidadaoEstadoCivil{

    private static EstadoCivilViuvo instancia = new EstadoCivilViuvo();

    private EstadoCivilViuvo() {}

    public static EstadoCivilViuvo getInstancia(){ return instancia; }

    public String getEstadoCivil(){ return "Viuvo"; }
}
