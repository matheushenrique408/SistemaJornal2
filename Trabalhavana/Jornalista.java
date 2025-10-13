import java.util.ArrayList;
import java.util.List;


class Jornalista extends Pessoa{
    private String especialidade;
    private List<Trabalho> trabalhos;

    public Jornalista(String nome, int idade, String especialidade){
        super(nome, idade);
        this.especialidade = especialidade;
        this.trabalhos = new ArrayList<>();
    }

    public void adicionarTrabalho(Trabalho t1){
        trabalhos.add(t1);
    }

    public List<Trabalho> getTrabalhos(){
        return trabalhos;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirPerfil(){
        System.out.println("Nome"+ getNome());
        System.out.println("Idade"+ getIdade());
        System.out.println("Especialidade"+ getEspecialidade());
    }
}