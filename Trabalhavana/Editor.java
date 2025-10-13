import java.util.List;
import java.util.ArrayList;

class Editor extends Pessoa{
    private String setor;
    private List<Reportagem> reportagens;
     

    public Editor(String nome, int idade, String setor){
        super(nome, idade);
        this.setor = setor;
        this.reportagens = new ArrayList<>();
        
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void adicionarReportagem(Reportagem r){
        reportagens.add(r);
    }

    @Override
    public void exibirPerfil(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Setor: "+ getSetor());
    }

}
