public class Main {
    public static void main(String[] args){
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo"));
        System.out.println("Version 1.0.0 lista para producción.");

        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));

        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");
    }
}