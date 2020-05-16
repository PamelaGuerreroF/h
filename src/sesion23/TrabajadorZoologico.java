package sesion23;

public class TrabajadorZoologico {

    public static void alimentar(Reptil reptil) {
        System.out.println("Alimentando a un " + reptil.getNombre());
    }
    
    public static void main(String[] args) {
        alimentar(new Reptil());
        alimentar(new Cocodrilo());
        alimentar(new Caiman());
//        Reptil reptil = new Reptil();
        Reptil reptil = new Cocodrilo();
        Cocodrilo cocodrilo = (Cocodrilo) reptil;
    }
}
