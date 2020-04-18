package sesion10;

public class Metodos {

    public static void main(String[] args) {
//        metodos();
        encolarMetodos();
    }

    public static void metodos() {
                       //01234567
        String nombre = " Juan@Perez@Perez ";
        System.out.println(nombre.length());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.trim());
        System.out.println(nombre);
        System.out.println(nombre.startsWith("Pedro"));
        System.out.println(nombre.startsWith("Juan"));
        System.out.println(nombre.startsWith(" Juan"));
        System.out.println(nombre.endsWith("Perez "));
                                        //primer param incluyente, segundo es excluyente
        System.out.println(nombre.substring(0, 7));
        
        System.out.println(nombre.charAt(17));
        System.out.println(nombre.replace("Juan", "Pedro"));
        System.out.println(nombre.contains("Juan"));
        String[] splitArray = nombre.split("@");
        System.out.println(splitArray.length);
        System.out.println("splitArray[0]: " + splitArray[0]);
        System.out.println("splitArray[1]: " + splitArray[1]);
        System.out.println("splitArray[2]: " + splitArray[2]);
//        System.out.println("splitArray[3]: " + splitArray[3]);
        
    }
    
    public static void encolarMetodos() {
        String nombre = "Juan Perez Perez";
        String completo = nombre.concat(", mexicano").concat(", CDMX").toUpperCase();
        System.out.println("nombre:\n" + nombre);
        System.out.println("completo:\n" + completo);
    }
    
}
