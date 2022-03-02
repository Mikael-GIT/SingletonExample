package program;

public class Singleton {
    
    //O Singleton é um padrão de projeto criacional, que garante que
    //apenas um objeto desse tipo exista e forneça um único ponto de acesso a ele para qualquer outro código.

    private static Singleton instance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}