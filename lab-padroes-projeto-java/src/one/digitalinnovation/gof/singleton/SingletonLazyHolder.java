package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    private static class InstaceHolder{
        private static SingletonLazyHolder instancia;
    }


    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        if (InstaceHolder.instancia == null){
            InstaceHolder.instancia = new SingletonLazyHolder();
        }
        return InstaceHolder.instancia;
    }
}
