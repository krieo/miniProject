
import Animals.Animal;
import com.jwetherell.algorithms.data_structures.Graph;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Krieolin
 */
public class Filehandlers {

    /**
     * This method saves a graph to a file for storage purposes
     *
     * @param g this is the graph object that gets passed to be saved
     */
    public static void saveToFile(Graph<Animal> g) {
        try {
            FileOutputStream fos = new FileOutputStream("animal.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(g);

            oos.close();
            fos.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    /**
     * This method returns the graph object from the file
     *
     * @return graph object
     */
    public static Graph<Animal> GetFromFile() {
        try {
            FileInputStream fis = new FileInputStream("animal.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Graph<Animal> g = (Graph<Animal>) ois.readObject();

            ois.close();
            fis.close();

            return g;

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return null;
    }
}
