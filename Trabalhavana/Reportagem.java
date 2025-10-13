import java.util.ArrayList;
import java.util.List;

public class Reportagem{
    private String titulo;
    private Editor editor;
    private List<Midia> midias;

    public Reportagem(String titulo, Editor editor, List<Midia> midias){
        this.titulo = titulo;
        this.editor = editor;
        this.midias = new ArrayList<>();
        if (midias != null) {
        this.midias.addAll(midias);
        }
    }

    public void adicionarMidia(Midia m) {
    if (m != null) midias.add(m);
}

       public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public List<Midia> getMidias() {
        return midias;
    }

    public void setMidias(List<Midia> midias) {
        this.midias = midias;
    }
}
