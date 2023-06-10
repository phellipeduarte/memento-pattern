import java.util.ArrayList;
import java.util.List;

public class Cidadao {

    private CidadaoEstadoCivil estado;
    private List<CidadaoEstadoCivil> memento = new ArrayList<>();

    public Cidadao(){
        setEstado(EstadoCivilSolteiro.getInstancia());
    }

    public Cidadao(CidadaoEstadoCivil estado) {
        setEstado(estado);
    }

    public CidadaoEstadoCivil getEstado() {
        return estado;
    }

    public void setEstado(CidadaoEstadoCivil estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(Integer indice){
        if(indice < 0 || indice > this.memento.size() - 1){
            throw new IllegalArgumentException("Índice inválido");
        }
        setEstado(this.memento.get(indice));
    }

    public List<CidadaoEstadoCivil> getEstadosCivil(){ return this.memento; }
}
