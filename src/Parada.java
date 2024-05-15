import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Estacion extends Parada {
    private String idLinea;
    private String nombreParada;
    private String nombreEstacion;

    static String archivoPath = "C:\\Users\\Alumne\\Desktop\\pr-ctica-final-sergi_saravia-Sergi\\src\\ArrayL1.data";

    public Estacion(String idLinea, String nombreParada) {
        super(idLinea, nombreParada);
        this.idLinea = idLinea;
        this.nombreParada = nombreParada;
        this.nombreEstacion = getNombreEstacion();
    }

    public String getNombreEstacion() {
        return nombreParada+ "_" + idLinea;
    }

    @Override
    public String toString() {
        return nombreEstacion;
    }

    public static ArrayList<Estacion> escribirVector() {
        ArrayList<Estacion> arrayL1 = new ArrayList<>();
        try (FileOutputStream fileOut = new FileOutputStream(archivoPath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            arrayL1.add(new Estacion("Fondo", "L1"));
            arrayL1.add(new Estacion("Santa Coloma", "L1"));
            arrayL1.add(new Estacion("L1", "Baró de Viver"));
            arrayL1.add(new Estacion("L1", "Trinitat Vella"));
            arrayL1.add(new Estacion("L1", "Torras i Bages"));
            arrayL1.add(new Estacion("L1", "Sant Andreu"));
            arrayL1.add(new Estacion("L1", "Fabra i Puig"));
            arrayL1.add(new Estacion("L1", "La Segrera"));
            arrayL1.add(new Estacion("L1", "Navas"));
            arrayL1.add(new Estacion("L1", "Clot"));
            arrayL1.add(new Estacion("L1", "Glòries"));
            arrayL1.add(new Estacion("L1", "Marina"));
            arrayL1.add(new Estacion("L1", "Arc de Trionf"));
            arrayL1.add(new Estacion("L1", "Catalunya"));
            arrayL1.add(new Estacion("L1", "Urquinaona"));
            arrayL1.add(new Estacion("L1", "Universitat"));
            arrayL1.add(new Estacion("L1", "Urgell"));
            arrayL1.add(new Estacion("L1", "Rocafort"));
            arrayL1.add(new Estacion("L1", "Espanya"));
            arrayL1.add(new Estacion("L1", "Hostafrancs"));
            arrayL1.add(new Estacion("L1", "Plaça de Sants"));
            arrayL1.add(new Estacion("L1", "Mercat Nou"));
            arrayL1.add(new Estacion("L1", "Santa Eulàlia"));
            arrayL1.add(new Estacion("L1", "Torrassa"));
            arrayL1.add(new Estacion("L1", "Florida"));
            arrayL1.add(new Estacion("L1", "Can Serra"));
            arrayL1.add(new Estacion("L1", "Rambla Just Oliveras"));
            arrayL1.add(new Estacion("L1", "Avinguda Carrilet"));
            arrayL1.add(new Estacion("L1", "Bellvitge"));
            arrayL1.add(new Estacion("L1", "Hospital de Bellvitge"));
            objectOut.writeObject(arrayL1);

            System.out.println("Objetos escritos correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return arrayL1;
    }

    public static ArrayList<String> leerVector() {
        ArrayList<Estacion> arrayL1 = new ArrayList<>();
        ArrayList<String> toStringValues = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(archivoPath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {


            arrayL1 = (ArrayList<Estacion>) objectIn.readObject();
            System.out.println("Objetos leídos correctamente desde el archivo:");
            for (Estacion estacion : arrayL1) {
                toStringValues.add(estacion.toString());
            }
            System.out.println("Contenido del ArrayList toStringValues:");
            for (String value : toStringValues) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return toStringValues;
    }
    // Método para abrir una estación
    public void abrirEstacion(Estacion[] grupoEstaciones) {
        // Mostrar las opciones disponibles
        System.out.println("Estaciones disponibles:");
        for (int i = 0; i < grupoEstaciones.length; i++) {
            System.out.println((i + 1) + ". " + grupoEstaciones[i].getNombre());
        }

        // Solicitar al usuario que seleccione una estación por nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, seleccione una estación por su nombre: ");
        String nombreSeleccionado = scanner.nextLine();

        // Buscar la estación seleccionada por el usuario
        Estacion estacionSeleccionada = null;
        for (Estacion estacion : grupoEstaciones) {
            if (estacion.getNombre().equals(nombreSeleccionado)) {
                estacionSeleccionada = estacion;
                break;
            }
        }

        // Verificar si se encontró la estación seleccionada
        if (estacionSeleccionada != null) {
            // Abrir la estación seleccionada
            System.out.println("Abriendo la estación " + estacionSeleccionada.getNombre() + "...");
            // Aquí iría el código para abrir la estación
        } else {
            // Mostrar un mensaje si no se encuentra la estación seleccionada
            System.out.println("La estación seleccionada no existe.");
        }
    }

    // Método getter para obtener el nombre de la estación
    public String getNombre() {
        return nombre;
    }

    // Método main para probar la clase Estacion
    public static void main(String[] args) {
        // Crear un grupo de estaciones
        Estacion[] grupoEstaciones = new Estacion[3];
        grupoEstaciones[0] = new Estacion("L1", "Fondo");
        grupoEstaciones[1] = new Estacion("L2", "Paral·lel");
        grupoEstaciones[2] = new Estacion("L3", "Passeig de Gràcia");

        //Afegir les altres

        // Crear una instancia de Estacion para probar el método abrirEstacion
        Estacion estacion = new Estacion("", "");
        estacion.abrirEstacion(grupoEstaciones);
    }
}
