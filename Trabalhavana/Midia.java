public class Midia{
    private String tipo;
    private String conteudo;

    public Midia(String tipo, String conteudo){
        this.tipo = tipo;
        this.conteudo = conteudo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}