import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Editor editor1 = new Editor("Paz", 666, "Política");
        Editor editor2 = new Editor("Cabritinho", 14, "Esportes");

        Jornalista j1 = new Jornalista("Autista", 340, "Política");
        Jornalista j2 = new Jornalista("Preto", 28, "Esportes");

        Midia m1 = new Midia("Imagem", "foto-eleicao.jpg");
        Midia m2 = new Midia("Vídeo", "entrevista.mp4");
        Midia m3 = new Midia("Imagem", "gol.jpg");
        Midia m4 = new Midia("Áudio", "comentario.mp3");

        List<Midia> midiasR1 = new ArrayList<>();
        midiasR1.add(m1);
        midiasR1.add(m2);

        List<Midia> midiasR2 = new ArrayList<>();
        midiasR2.add(m3);
        midiasR2.add(m4);

        Reportagem r1 = new Reportagem("Eleições 2025: análise", editor1, midiasR1);
        Reportagem r2 = new Reportagem("Campeonato: rodada decisiva", editor2, midiasR2);

        editor1.adicionarReportagem(r1);
        editor2.adicionarReportagem(r2);
        
        Secao secaoPol = new Secao("Política", new ArrayList<>());
        Secao secaoEsp = new Secao("Esportes", new ArrayList<>());

        secaoPol.getReportagens().add(r1);
        secaoEsp.getReportagens().add(r2);

        Trabalho t1 = new Trabalho(j1, r1, 60.0f); 
        Trabalho t2 = new Trabalho(j2, r2, 100.0f); 

        j1.adicionarTrabalho(t1);
        j2.adicionarTrabalho(t2);

        System.out.println("=== Editores ===");
        System.out.println(editor1.getNome() + " | Setor: " + editor1.getSetor());
        System.out.println(editor2.getNome() + " | Setor: " + editor2.getSetor());

        System.out.println("\n=== Jornalistas ===");
        System.out.println(j1.getNome() + " | Especialidade: " + j1.getEspecialidade());
        System.out.println(j2.getNome() + " | Especialidade: " + j2.getEspecialidade());

        System.out.println("\n=== Reportagens e suas mídias ===");
        for (Reportagem r : List.of(r1, r2)) {
            System.out.println("Reportagem: " + r.getTitulo() +
                               " | Editor: " + (r.getEditor() != null ? r.getEditor().getNome() : "sem editor"));
            System.out.println("  Mídias:");
            for (Midia mm : r.getMidias()) {
                System.out.println("   - " + mm.getTipo() + ": " + mm.getConteudo());
            }
        }

        System.out.println("\n=== Seções e quantas reportagens têm ===");
        System.out.println(secaoPol.getNome() + " -> " + secaoPol.getReportagens().size() + " reportagens");
        System.out.println(secaoEsp.getNome() + " -> " + secaoEsp.getReportagens().size() + " reportagens");

        System.out.println("\n=== Trabalhos (classe associativa) ===");
        for (Trabalho t : List.of(t1, t2)) {
            System.out.println("Jornalista: " + t.getJornalista().getNome() +
                               " | Reportagem: " + (t.getReportagem() != null ? t.getReportagem().getTitulo() : "nenhuma") +
                               " | Contribuição: " + t.getContribuicao() + "%");
        }

        System.out.println("\n=== Polimorfismo: exibir perfis (Pessoa -> Editor/Jornalista) ===");
        Pessoa[] pessoas = { editor1, j1, editor2, j2 };
        for (Pessoa p : pessoas) {
            p.exibirPerfil();
        }

        System.out.println("\nCadastro finalizado. Foram criados 2 exemplos de cada classe.");
    }
}
