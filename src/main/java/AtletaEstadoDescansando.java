public class AtletaEstadoDescansando implements AtletaEstado{

    private AtletaEstadoDescansando() {};
    private static AtletaEstadoDescansando instance = new AtletaEstadoDescansando();
    public static AtletaEstadoDescansando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Descansando";
    }
    public String descansando(Atleta atleta){
        return "Atleta não pode iniciar Descanso";
    }
    public String caminhando(Atleta atleta){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        return "Treino de caminhada iniciado";
    }

    public String nadando(Atleta atleta){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        return "Treino de natação iniciado";
    }

    public String correndo(Atleta atleta){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        return "Treino de corrida iniciado";
    }
}