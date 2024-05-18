import java.io.*;
import java.util.ArrayList;
public class Estacion extends Parada implements Serializable {
    private String idLinea;
    private String nombreParada;
    private String nombreEstacion;

    static String archivoPath1 = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL1.data";
    static String archivoPath2 = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL2.data";
    static String archivoPath5 = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL5.data";
    static String archivoPath9s = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL9S.data";
    static String archivoPath10s = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL10S.data";
    static String archivoPath12 = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL12.data";

    public Estacion(String idLinea, String nombreParada) {
        super(idLinea, nombreParada);
        this.idLinea = idLinea;
        this.nombreParada = nombreParada;
        this.nombreEstacion = getNombreEstacion( );
    }

    public String getNombreEstacion() {
        return nombreParada + "_" + idLinea;
    }

    @Override
    public String toString() {
        return nombreEstacion;
    }

    //Mètodes L1
    public static ArrayList<Estacion> escribirVectorL1() {
        ArrayList<Estacion> arrayL1 = new ArrayList<>( );
        try (FileOutputStream fileOut1 = new FileOutputStream(archivoPath1);
             ObjectOutputStream objectOut1 = new ObjectOutputStream(fileOut1)) {

            arrayL1.add(new Estacion("L1", "Fondo"));
            arrayL1.add(new Estacion("L1", "Santa Coloma"));
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

            // Escribir el ArrayList en el archivo
            objectOut1.writeObject(arrayL1);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        System.out.println("Objetos escritos correctamente en el archivo.");
        return arrayL1;
    }

    public static ArrayList<String> leerVectorL1() {
        ArrayList<Estacion> arrayL1 = new ArrayList<>( );
        ArrayList<String> toStringValues = new ArrayList<>( );

        try (FileInputStream fileIn1 = new FileInputStream(archivoPath1);
             ObjectInputStream objectIn1 = new ObjectInputStream(fileIn1)) {

            // Leer el ArrayList desde el archivo
            arrayL1 = (ArrayList<Estacion>) objectIn1.readObject( );
            System.out.println("Objetos leídos correctamente desde el archivo:");

            // Obtener la salida del método toString() para cada elemento
            for (Estacion estacion : arrayL1) {
                toStringValues.add(estacion.toString( ));
            }
            System.out.println("Contenido del ArrayList toStringValues:");
            for (String value : toStringValues) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        return toStringValues;
    }

    //Mètodes L2

    public static ArrayList<Estacion> escribirVectorL2() {
        ArrayList<Estacion> arrayL2 = new ArrayList<>( );
        try (FileOutputStream fileOut2 = new FileOutputStream(archivoPath2);
             ObjectOutputStream objectOut2 = new ObjectOutputStream(fileOut2)) {

            arrayL2.add(new Estacion("L2", "Badalona Pompeu Fabra"));
            arrayL2.add(new Estacion("L2", "Pep Ventura"));
            arrayL2.add(new Estacion("L2", "Gorg"));
            arrayL2.add(new Estacion("L2", "Sant Roc"));
            arrayL2.add(new Estacion("L2", "Artigues | Sant Adrià"));
            arrayL2.add(new Estacion("L2", "Verneda"));
            arrayL2.add(new Estacion("L2", "La Pau"));
            arrayL2.add(new Estacion("L2", "Sant Martí"));
            arrayL2.add(new Estacion("L2", "Bac de Roda"));
            arrayL2.add(new Estacion("L2", "Clot"));
            arrayL2.add(new Estacion("L2", "Encants"));
            arrayL2.add(new Estacion("L2", "Sagrada Família"));
            arrayL2.add(new Estacion("L2", "Tetuan"));
            arrayL2.add(new Estacion("L2", "Passeig de Gràcia"));
            arrayL2.add(new Estacion("L2", "Universitat"));
            arrayL2.add(new Estacion("L2", "Sant Antoni"));
            arrayL2.add(new Estacion("L2", "Paral·lel"));

            // Escribir el ArrayList en el archivo
            objectOut2.writeObject(arrayL2);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        System.out.println("Objetos escritos correctamente en el archivo.");
        return arrayL2;
    }

    public static ArrayList<String> leerVectorL2() {
        ArrayList<Estacion> arrayL2 = new ArrayList<>( );
        ArrayList<String> toStringValues2 = new ArrayList<>( );

        try (FileInputStream fileIn2 = new FileInputStream(archivoPath2);
             ObjectInputStream objectIn2 = new ObjectInputStream(fileIn2)) {

            // Leer el ArrayList desde el archivo
            arrayL2 = (ArrayList<Estacion>) objectIn2.readObject( );
            System.out.println("Objetos leídos correctamente desde el archivo:");

            // Obtener la salida del método toString() para cada elemento
            for (Estacion estacion : arrayL2) {
                toStringValues2.add(estacion.toString( ));
            }
            System.out.println("Contenido del ArrayList toStringValues2:");
            for (String value : toStringValues2) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        return toStringValues2;
    }

    //Mètodes L5

    public static ArrayList<Estacion> escribirVectorL5() {
        ArrayList<Estacion> arrayL5 = new ArrayList<>( );
        try (FileOutputStream fileOut5 = new FileOutputStream(archivoPath5);
             ObjectOutputStream objectOut5 = new ObjectOutputStream(fileOut5)) {

            arrayL5.add(new Estacion("L5", "Cornellà Centre"));
            arrayL5.add(new Estacion("L5", "Gavarra"));
            arrayL5.add(new Estacion("L5", "Sant Ildefons"));
            arrayL5.add(new Estacion("L5", "Can Boixeres"));
            arrayL5.add(new Estacion("L5", "Can Vidalet"));
            arrayL5.add(new Estacion("L5", "Pubilla Cases"));
            arrayL5.add(new Estacion("L5", "Collblanc"));
            arrayL5.add(new Estacion("L5", "Badal"));
            arrayL5.add(new Estacion("L5", "Plaça de Sants"));
            arrayL5.add(new Estacion("L5", "Sants Estació"));
            arrayL5.add(new Estacion("L5", "Entença"));
            arrayL5.add(new Estacion("L5", "Hospital Clínic"));
            arrayL5.add(new Estacion("L5", "Diagonal"));
            arrayL5.add(new Estacion("L5", "Verdaguer"));
            arrayL5.add(new Estacion("L5", "Sagrada Família"));
            arrayL5.add(new Estacion("L5", "Sant Pau | Dos de Maig"));
            arrayL5.add(new Estacion("L5", "Camp de l'Arpa"));
            arrayL5.add(new Estacion("L5", "La Sagrera"));
            arrayL5.add(new Estacion("L5", "Congrés"));
            arrayL5.add(new Estacion("L5", "Maragall"));
            arrayL5.add(new Estacion("L5", "Vilapicina"));
            arrayL5.add(new Estacion("L5", "Horta"));
            arrayL5.add(new Estacion("L5", "El Carmel"));
            arrayL5.add(new Estacion("L5", "El Coll | La Teixonera"));
            arrayL5.add(new Estacion("L5", "Vall d'Hebron"));
            arrayL5.add(new Estacion("L5", "Montbau"));
            arrayL5.add(new Estacion("L5", "Mundet"));
            arrayL5.add(new Estacion("L5", "Valldaura"));
            arrayL5.add(new Estacion("L5", "Canyelles"));

            // Escribir el ArrayList en el archivo
            objectOut5.writeObject(arrayL5);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        System.out.println("Objetos escritos correctamente en el archivo.");
        return arrayL5;
    }

    public static ArrayList<String> leerVectorL5() {
        ArrayList<Estacion> arrayL5 = new ArrayList<>( );
        ArrayList<String> toStringValues5 = new ArrayList<>( );

        try (FileInputStream fileIn5 = new FileInputStream(archivoPath5);
             ObjectInputStream objectIn5 = new ObjectInputStream(fileIn5)) {

            // Leer el ArrayList desde el archivo
            arrayL5 = (ArrayList<Estacion>) objectIn5.readObject( );
            System.out.println("Objetos leídos correctamente desde el archivo:");

            // Obtener la salida del método toString() para cada elemento
            for (Estacion estacion : arrayL5) {
                toStringValues5.add(estacion.toString( ));
            }
            System.out.println("Contenido del ArrayList toStringValues5:");
            for (String value : toStringValues5) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        return toStringValues5;
    }

    //Mètodes L9S

    public static ArrayList<Estacion> escribirVectorL9S() {
        ArrayList<Estacion> arrayL9S = new ArrayList<>( );
        try (FileOutputStream fileOut9s = new FileOutputStream(archivoPath9s);
             ObjectOutputStream objectOut9s = new ObjectOutputStream(fileOut9s)) {

            arrayL9S.add(new Estacion("L9S", "Zona Universitària"));
            arrayL9S.add(new Estacion("L9S", "Palau Reial"));
            arrayL9S.add(new Estacion("L9S", "Maria Cristina"));
            arrayL9S.add(new Estacion("L9S", "Les Corts"));
            arrayL9S.add(new Estacion("L9S", "Plaça del Centre"));
            arrayL9S.add(new Estacion("L9S", "Sants Estació"));
            arrayL9S.add(new Estacion("L9S", "Tarragona"));
            arrayL9S.add(new Estacion("L9S", "Espanya"));
            arrayL9S.add(new Estacion("L9S", "Rocafort"));
            arrayL9S.add(new Estacion("L9S", "Urgell"));
            arrayL9S.add(new Estacion("L9S", "Universitat"));
            arrayL9S.add(new Estacion("L9S", "Passeig de Gràcia"));
            arrayL9S.add(new Estacion("L9S", "La Sagrera"));
            arrayL9S.add(new Estacion("L9S", "Bon Pastor"));
            arrayL9S.add(new Estacion("L9S", "Can Peixauet"));
            arrayL9S.add(new Estacion("L9S", "Santa Rosa"));
            arrayL9S.add(new Estacion("L9S", "Fondo"));

            // Escribir el ArrayList en el archivo
            objectOut9s.writeObject(arrayL9S);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        System.out.println("Objetos escritos correctamente en el archivo.");
        return arrayL9S;
    }

    public static ArrayList<String> leerVectorL9S() {
        ArrayList<Estacion> arrayL9S = new ArrayList<>( );
        ArrayList<String> toStringValues9s = new ArrayList<>( );

        try (FileInputStream fileIn9s = new FileInputStream(archivoPath9s);
             ObjectInputStream objectIn9s = new ObjectInputStream(fileIn9s)) {

            // Leer el ArrayList desde el archivo
            arrayL9S = (ArrayList<Estacion>) objectIn9s.readObject( );
            System.out.println("Objetos leídos correctamente desde el archivo:");

            // Obtener la salida del método toString() para cada elemento
            for (Estacion estacion : arrayL9S) {
                toStringValues9s.add(estacion.toString( ));
            }
            System.out.println("Contenido del ArrayList toStringValues9s:");
            for (String value : toStringValues9s) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        return toStringValues9s;
    }

    //Mètodes L10S

    public static ArrayList<Estacion> escribirVectorL10S() {
        ArrayList<Estacion> arrayL10S = new ArrayList<>( );
        try (FileOutputStream fileOut10s = new FileOutputStream(archivoPath10s);
             ObjectOutputStream objectOut10s = new ObjectOutputStream(fileOut10s)) {

            arrayL10S.add(new Estacion("L10S", "Zona Franca"));
            arrayL10S.add(new Estacion("L10S", "Foneria"));
            arrayL10S.add(new Estacion("L10S", "Foc"));
            arrayL10S.add(new Estacion("L10S", "Can Tries | Gornal"));
            arrayL10S.add(new Estacion("L10S", "Torrassa"));
            arrayL10S.add(new Estacion("L10S", "Collblanc"));
            arrayL10S.add(new Estacion("L10S", "La Sagrera"));
            arrayL10S.add(new Estacion("L10S", "Bon Pastor"));
            arrayL10S.add(new Estacion("L10S", "Llefià"));
            arrayL10S.add(new Estacion("L10S", "La Salut"));
            arrayL10S.add(new Estacion("L10S", "Gorg"));

            // Escribir el ArrayList en el archivo
            objectOut10s.writeObject(arrayL10S);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        System.out.println("Objetos escritos correctamente en el archivo.");
        return arrayL10S;
    }

    public static ArrayList<String> leerVectorL10S() {
        ArrayList<Estacion> arrayL10S = new ArrayList<>( );
        ArrayList<String> toStringValues10s = new ArrayList<>( );

        try (FileInputStream fileIn10s = new FileInputStream(archivoPath10s);
             ObjectInputStream objectIn10s = new ObjectInputStream(fileIn10s)) {

            // Leer el ArrayList desde el archivo
            arrayL10S = (ArrayList<Estacion>) objectIn10s.readObject( );
            System.out.println("Objetos leídos correctamente desde el archivo:");

            // Obtener la salida del método toString() para cada elemento
            for (Estacion estacion : arrayL10S) {
                toStringValues10s.add(estacion.toString( ));
            }
            System.out.println("Contenido del ArrayList toStringValues10s:");
            for (String value : toStringValues10s) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage( ));
            e.printStackTrace( );
        }
        return toStringValues10s;
    }

    //Mètodes L11

    public static ArrayList<Estacion> escribirVectorL12() {
        ArrayList<Estacion> arrayL12 = new ArrayList<>();
        try (FileOutputStream fileOut12 = new FileOutputStream(archivoPath12);
             ObjectOutputStream objectOut12 = new ObjectOutputStream(fileOut12)) {

            arrayL12.add(new Estacion("L12", "Reina Elisenda"));
            arrayL12.add(new Estacion("L12", "Sarrià"));

            // Escribir el ArrayList en el archivo
            objectOut12.writeObject(arrayL12);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Objetos escritos correctamente en el archivo.");
        return arrayL12;
    }

    public static ArrayList<String> leerVectorL12() {
        ArrayList<Estacion> arrayL12 = new ArrayList<>();
        ArrayList<String> toStringValues12 = new ArrayList<>();

        try (FileInputStream fileIn12 = new FileInputStream(archivoPath12);
             ObjectInputStream objectIn12 = new ObjectInputStream(fileIn12)) {

            // Leer el ArrayList desde el archivo
            arrayL12 = (ArrayList<Estacion>) objectIn12.readObject();
            System.out.println("Objetos leídos correctamente desde el archivo:");

            // Obtener la salida del método toString() para cada elemento
            for (Estacion estacion : arrayL12) {
                toStringValues12.add(estacion.toString());
            }
            System.out.println("Contenido del ArrayList toStringValues12:");
            for (String value : toStringValues12) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return toStringValues12;

    }
}
