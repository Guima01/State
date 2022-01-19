public class AtletaEstadoCorrendo implements AtletaEstado{
    private AtletaEstadoCorrendo() {};
    private static AtletaEstadoCorrendo instance = new AtletaEstadoCorrendo();
    public static AtletaEstadoCorrendo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Correndo";
    }
    public String descansando(Atleta atleta){
        return "Atleta Descansando";
    }
    public String caminhando(Atleta atleta){
        return "Treino de caminhada iniciado";
    }
    public String nadando(Atleta atleta){
        return "Treino não iniciado";
    }

    public String correndo(Atleta atleta){
        return "Treino não iniciado";
    }
}