package sesion21;

public class ProfesorConcreto extends ProfesorAbstracto {

    @Override
    public String estudiar() {
        System.out.println("El profesor tambien tiene que estudiar");
        return "El profesor tambien tiene que estudiar";
    }

    @Override
    public String getNombre() {
        return "Profesor de programacion";
    }

}
