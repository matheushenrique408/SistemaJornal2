import java.util.ArrayList;
import java.util.List;

public class Secao{
    private String nome;
    private List<Reportagem> reportagens;

    public Secao(String nome, List<Reportagem> reportagens){
        this.nome = nome;
        this.reportagens = new ArrayList<>();
        if (reportagens != null){ 
            this.reportagens.addAll(reportagens);
        }
    }
        
    public void adicionarReportagem(Reportagem r) {
    if (r != null) reportagens.add(r);
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Reportagem> getReportagens() {
        return reportagens;
    }

    public void setReportagens(List<Reportagem> reportagens) {
        this.reportagens = reportagens;
    }
}