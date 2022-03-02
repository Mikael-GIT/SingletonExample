package program;

public class Application {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

       Singleton s2 = Singleton.getInstance();


       //Ambos apontarao para o mesmo hash em memoria, pois sao a mesma instancia
       System.out.println(s1);
       System.out.println(s2);
    }
}