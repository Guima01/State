public class Atleta {
    private String nomeAtleta;
    private AtletaEstado estado;

    public Atleta(){
        this.estado = AtletaEstadoDescansando.getInstance();
    }
    public void setEstado(AtletaEstado estado){
        this.estado = estado;
    }
    public String descansando(){
        return estado.descansando(this);
    }
    public String caminhando(){
        return estado.caminhando(this);
    }
    public String nadando(){
        return estado.nadando(this);
    }
    public String correndo(){
        return estado.correndo(this);
    }
    public String getNomeEstado(){
        return estado.getEstado();
    }
    public String getNomeAtleta(){
        return nomeAtleta;
    }
    public void setNomeAtleta(String nomeAtleta){
        this.nomeAtleta = nomeAtleta;
    }
    public AtletaEstado getEstado(){
        return estado;
    }
}