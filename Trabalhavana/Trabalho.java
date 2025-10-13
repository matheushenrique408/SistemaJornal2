import java.util.ArrayList;
import java.util.List;

public class Trabalho{
    private Jornalista jornalista;
    private Reportagem reportagem;
    private float contribuicao;

    public Trabalho(Jornalista jornalista, Reportagem reportagem, float contribuicao){
        this.jornalista = jornalista;
        this.reportagem = reportagem;
        this.contribuicao = contribuicao;
    }
     public Jornalista getJornalista() {
        return jornalista;
    }

    public void setJornalista(Jornalista jornalista) {
        this.jornalista = jornalista;
    }

    public Reportagem getReportagem() {
        return reportagem;
    }

    public void setReportagem(Reportagem reportagem){
        this.reportagem = reportagem;
    }

    public float getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(float contribuicao) {
        this.contribuicao = contribuicao;
    }
}