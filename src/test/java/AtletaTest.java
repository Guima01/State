import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {
    Atleta atleta;

    @BeforeEach
    public void setUp(){
        atleta = new Atleta();
    }


    @Test
    public void atletaForaDoDescansoAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Atleta não pode iniciar Descanso", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de caminhada iniciado", atleta.caminhando());
    }
    @Test
    public void atletaIniciouTreinoDenatacaoAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de natação iniciado", atleta.nadando());
    }
    @Test
    public void atletaIniciouTreinoDeCorridaAtletaDescansando(){
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        assertEquals("Treino de corrida iniciado", atleta.correndo());
    }

    @Test
    public void atletaNoDescansoAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaNaoIniciouTreinoDeCaminhadaAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino não iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino não iniciado", atleta.nadando());
    }

    @Test
    public void atletaIniciouTreinoDeCorridaAtletaCaminhando(){
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals("Treino de corrida iniciado", atleta.correndo());
    }

    @Test
    public void atletaNoDescansoAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino de caminhada iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino não iniciado", atleta.nadando());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCorridaAtletaCorrendo(){
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        assertEquals("Treino não iniciado", atleta.correndo());
    }

    @Test
    public void atletaNoDescansoAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Atleta Descansando", atleta.descansando());
    }
    @Test
    public void atletaIniciouTreinoDeCaminhadaAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino não iniciado", atleta.caminhando());
    }
    @Test
    public void atletaNaoIniciouTreinoDenatacaoAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino não iniciado", atleta.nadando());
    }
    @Test
    public void atletaNãoIniciouTreinoDeCorridaAtletaNadando(){
        atleta.setEstado(AtletaEstadoNadando.getInstance());
        assertEquals("Treino não iniciado", atleta.correndo());
    }

}