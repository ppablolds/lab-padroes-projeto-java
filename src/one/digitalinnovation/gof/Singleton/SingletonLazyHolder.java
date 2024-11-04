package one.digitalinnovation.gof.Singleton;

import static one.digitalinnovation.gof.Singleton.SingletonLazyHolder.InstanceHolder.instancia;

/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Ref</a>
 *
 * @author Pablo
 */
public class SingletonLazyHolder {

    static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return instancia;
    }
}
