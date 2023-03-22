public class App {
    public static void main(String[] args) throws Exception {
        Materia portugues = new Materia("portugues", "livro", "laranja");
        Assunto literatura = new Assunto("literatura", "imagem", 1);
        Assunto gramatica = new Assunto("gramatica", "imagem", 2);

        portugues.setAssunto(gramatica);
        portugues.setAssunto(literatura);
        Assunto assuntoGramatica = portugues.getAssunto(0);
        Assunto assuntoLiteratura = portugues.getAssunto(1);


        System.out.println(portugues.getName());
        System.out.println(assuntoLiteratura.getName());
        System.out.println(assuntoGramatica.getName());
    }
}
