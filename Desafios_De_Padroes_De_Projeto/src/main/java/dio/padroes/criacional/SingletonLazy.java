package dio.padroes.criacional;

//Chama a si mesmo
//Não disponibiliza a instância em um primeiro momento
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) instancia = new SingletonLazy();
        return instancia;
    }
}
