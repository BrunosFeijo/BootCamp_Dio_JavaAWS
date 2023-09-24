package dio.padroes.criacional;

//Está sempre estanciado (por isso apressado, eager)

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
