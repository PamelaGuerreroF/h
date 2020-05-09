package sesion21;

public abstract class ProfesorAbstracto extends AlumnoAbstracto {

    @Override
    public abstract String estudiar();
//    public String estudiar() {
//        return "Estoy estudiando abstracto";
//    }

    public void califica() {
        System.out.println("Aprobado");
    }
}
