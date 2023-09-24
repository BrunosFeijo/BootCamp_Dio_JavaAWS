package dio.padroes.criacional;

//Chama a si mesmo atravez de uma função 'holder' (encapsulada)
// Thread safe
public class SingletonLazyHolder {
    private static class instanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia() {
        return instanceHolder.instancia;
    }
}
