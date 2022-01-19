public class AtletaEstadoCaminhando implements AtletaEstado{

    private AtletaEstadoCaminhando() {};
    private static AtletaEstadoCaminhando instance = new AtletaEstadoCaminhando();
    public static AtletaEstadoCaminhando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Caminhando";
    }
    public String descansando(Atleta atleta){
        return "Atleta Descansando";
    }
    public String caminhando(Atleta atleta){
        return "Treino não iniciado";
    }
    public String nadando(Atleta atleta){
        return "Treino não iniciado";
    }
    public String correndo(Atleta atleta){
        return "Treino de corrida iniciado";
    }
}