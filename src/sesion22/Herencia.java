package sesion22;

public interface Herencia extends Evaluable, PuedeAprobar {

    default void metodoDefault() {
        System.out.println("Soy un metodo default");
    }
}
