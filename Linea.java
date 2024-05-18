import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Linea implements Serializable {
    protected static String id;
    // Atributos
    private String inicio;
    private String fin;

    // Constructor
    public Linea(String id, String inicio, String fin) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Linea(String id) {
        this.id = id;
    }


    // Método toString para representación textual de la línea
    @Override
    public String toString() {
        return "Linea{" +
                "id='" + id + '\'' +
                ", inicio='" + inicio + '\'' +
                ", fin='" + fin + '\'' +
                '}';
    }


    public static void EscribirLineaL1() {
        ArrayList<String> arrayL1 = Estacion.leerVectorL1(); //associació
        String archivePath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL1Resum.data";
        File file = new File(archivePath);
        try {
            PrintStream output = new PrintStream(file);
            for (int i = 0; i < arrayL1.size(); ++i) {
                output.println(arrayL1.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void EscribirLineaL2() {
        ArrayList<String> arrayL2 = Estacion.leerVectorL2(); //associació
        String archivePath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL2Resum.data";
        File file = new File(archivePath);
        try {
            PrintStream output = new PrintStream(file);
            for (int i = 0; i < arrayL2.size(); ++i) {
                output.println(arrayL2.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void EscribirLineaL5() {
        ArrayList<String> arrayL5 = Estacion.leerVectorL5(); //associació
        String archivePath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL5Resum.data";
        File file = new File(archivePath);
        try {
            PrintStream output = new PrintStream(file);
            for (int i = 0; i < arrayL5.size(); ++i) {
                output.println(arrayL5.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void EscribirLineaL9S() {
        ArrayList<String> arrayL9S = Estacion.leerVectorL9S(); //associació
        String archivePath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL9SResum.data";
        File file = new File(archivePath);
        try {
            PrintStream output = new PrintStream(file);
            for (int i = 0; i < arrayL9S.size(); ++i) {
                output.println(arrayL9S.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void EscribirLineaL10S() {
        ArrayList<String> arrayL10S = Estacion.leerVectorL10S(); //associació
        String archivePath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL10SResum.data";
        File file = new File(archivePath);
        try {
            PrintStream output = new PrintStream(file);
            for (int i = 0; i < arrayL10S.size(); ++i) {
                output.println(arrayL10S.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void EscribirLineaL12() {
        ArrayList<String> arrayL12 = Estacion.leerVectorL12(); //associació
        String archivePath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL12Resum.data";
        File file = new File(archivePath);
        try {
            PrintStream output = new PrintStream(file);
            for (int i = 0; i < arrayL12.size(); ++i) {
                output.println(arrayL12.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
