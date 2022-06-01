
import com.jwetherell.algorithms.data_structures.Graph.*;
import Animals.Animal;
import com.jwetherell.algorithms.data_structures.Graph;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Graph<Animal> defaultGraph = generateDefaultUsers();

        Filehandlers.saveToFile(defaultGraph);

        Graph<Animal> myGraph = Filehandlers.GetFromFile();

        if (myGraph != null) {
            for (int i = 0; i < 3; i++) {
                System.out.println("From:" + myGraph.getEdges().get(i).getFromVertex().getValue().getName());
                System.out.println("To:" + myGraph.getEdges().get(i).getToVertex().getValue().getName());
                System.out.println("Vertex:" + myGraph.getVertices().get(i).getValue().getName());
            }
        } else {
            System.err.println("Graph null");
        }

        welcomeForm wf = new welcomeForm();
        wf.runMain();
        
    }

    /**
     * This method creates default users to add to the graph
     *
     * @return it returns a graph with the instantiated objects
     */
    private static Graph generateDefaultUsers() {
        // creates an array list of likes and dislikes
        ArrayList<String> animal1Likes = new ArrayList<>();
        ArrayList<String> animal2Likes = new ArrayList<>();
        ArrayList<String> animal3Likes = new ArrayList<>();

        ArrayList<String> animal4Likes = new ArrayList<>();
        ArrayList<String> animal5Likes = new ArrayList<>();
        ArrayList<String> animal6Likes = new ArrayList<>();
        ArrayList<String> animal7Likes = new ArrayList<>();
        ArrayList<String> animal8Likes = new ArrayList<>();
        ArrayList<String> animal9Likes = new ArrayList<>();
        ArrayList<String> animal10Likes = new ArrayList<>();
        ArrayList<String> animal11Likes = new ArrayList<>();
        ArrayList<String> animal12Likes = new ArrayList<>();
        ArrayList<String> animal13Likes = new ArrayList<>();
        ArrayList<String> animal14Likes = new ArrayList<>();
        ArrayList<String> animal15Likes = new ArrayList<>();
        ArrayList<String> animal16Likes = new ArrayList<>();
        ArrayList<String> animal17Likes = new ArrayList<>();
        ArrayList<String> animal18Likes = new ArrayList<>();
        ArrayList<String> animal19Likes = new ArrayList<>();
        ArrayList<String> animal20Likes = new ArrayList<>();
        ArrayList<String> animal21Likes = new ArrayList<>();
        ArrayList<String> animal22Likes = new ArrayList<>();
        ArrayList<String> animal23Likes = new ArrayList<>();
        ArrayList<String> animal24Likes = new ArrayList<>();
        ArrayList<String> animal25Likes = new ArrayList<>();

        ArrayList<String> animal1Dislikes = new ArrayList<>();
        ArrayList<String> animal2Dislikes = new ArrayList<>();
        ArrayList<String> animal3Dislikes = new ArrayList<>();

        ArrayList<String> animal4Dislikes = new ArrayList<>();
        ArrayList<String> animal5Dislikes = new ArrayList<>();
        ArrayList<String> animal6Dislikes = new ArrayList<>();
        ArrayList<String> animal7Dislikes = new ArrayList<>();
        ArrayList<String> animal8Dislikes = new ArrayList<>();
        ArrayList<String> animal9Dislikes = new ArrayList<>();
        ArrayList<String> animal10Dislikes = new ArrayList<>();
        ArrayList<String> animal11Dislikes = new ArrayList<>();
        ArrayList<String> animal12Dislikes = new ArrayList<>();
        ArrayList<String> animal13Dislikes = new ArrayList<>();
        ArrayList<String> animal14Dislikes = new ArrayList<>();
        ArrayList<String> animal15Dislikes = new ArrayList<>();
        ArrayList<String> animal16Dislikes = new ArrayList<>();
        ArrayList<String> animal17Dislikes = new ArrayList<>();
        ArrayList<String> animal18Dislikes = new ArrayList<>();
        ArrayList<String> animal19Dislikes = new ArrayList<>();
        ArrayList<String> animal20Dislikes = new ArrayList<>();
        ArrayList<String> animal21Dislikes = new ArrayList<>();
        ArrayList<String> animal22Dislikes = new ArrayList<>();
        ArrayList<String> animal23Dislikes = new ArrayList<>();
        ArrayList<String> animal24Dislikes = new ArrayList<>();
        ArrayList<String> animal25Dislikes = new ArrayList<>();

        animal1Likes.add("Tennis balls");
        animal1Dislikes.add("Vacuum cleaners");

        animal2Likes.add("Sleeping");
        animal2Dislikes.add("Baths");

        animal3Likes.add("Biting bones");
        animal3Dislikes.add("Cats");

        animal4Likes.add("Dancing");
        animal4Dislikes.add("Mail man");
        animal5Likes.add("Water");
        animal5Dislikes.add("Cats");
        animal6Likes.add("Hunting mouse");
        animal6Dislikes.add("Dogs");
        animal7Likes.add("Watching TV");
        animal7Dislikes.add("Cucumbers");
        animal8Likes.add("Sleeping");
        animal8Dislikes.add("Mornings");
        animal9Likes.add("Cupcakes");
        animal9Dislikes.add("Vegetables");
        animal10Likes.add("Partying!");
        animal10Dislikes.add("Quiet times");
        animal11Likes.add("Playing");
        animal11Dislikes.add("Cats");
        animal12Likes.add("Walking in woods");
        animal12Dislikes.add("Indoors");
        animal13Likes.add("Playing in park");
        animal13Dislikes.add("Going home from park");
        animal14Likes.add("Eating rasberries");
        animal14Dislikes.add("The movie cats");
        animal15Likes.add("Walks");
        animal15Dislikes.add("Lemons");
        animal16Likes.add("Destruction!");
        animal16Dislikes.add("Water");
        animal17Likes.add("Flying around the house");
        animal17Dislikes.add("Cages");
        animal18Likes.add("Heat");
        animal18Dislikes.add("vegetables");
        animal19Likes.add("Parties");
        animal19Dislikes.add("Mondays");
        animal20Likes.add("Mud baths");
        animal20Dislikes.add("Fryer");
        animal21Likes.add("Doing business");
        animal21Dislikes.add("Cats");
        animal22Likes.add("Alpaca dances");
        animal22Dislikes.add("Blue sweaters");
        animal23Likes.add("Deez nutz");
        animal23Dislikes.add("jokes");
        animal24Likes.add("He's red rubber ball");
        animal24Dislikes.add("When i take he's red rubber ball to wash");
        animal25Likes.add("Catching mice");
        animal25Dislikes.add("Extreme heat");

        // Instantiates a few animal objects
        Animal animal1 = new Animal("Bob", "2", "Dog", "Male", "Labrador", animal1Likes, animal1Dislikes,
                "A lovable hunk looking for a buddy", "animal1.jpg", "doggyguy@gmail.com", "1234");
        Animal animal2 = new Animal("Chase", "1", "Dog", "Female", "German Shepard", animal2Likes, animal2Dislikes,
                "The laziest and sweetest boy under the sun", "animal2.jpg", "petlover@gmail.com", "1234");
        Animal animal3 = new Animal("Roger", "3", "Dog", "Male", "Pug", animal3Likes, animal3Dislikes,
                "Once took a byte from my computer sciences homework", "animal3.jpg", "ez@gmail.com", "1234");

        //******************************
        Animal animal4 = new Animal("Keven", "2", "Dog", "Male", "Corgi", animal4Likes, animal4Dislikes,
                "Cute and looking for a friend", "animal4.jpg", "corgilover@gmail.com", "1234");
        Animal animal5 = new Animal("Ruffles", "1", "Dog", "Female", "Pug", animal5Likes, animal5Dislikes,
                "Not all pugs are ugly", "animal5.jpg", "pete@gmail.com", "1234");
        Animal animal6 = new Animal("Carl", "7", "Cat", "Male", "Shitzu", animal6Likes, animal6Dislikes,
                "Grumpy and hates everyone", "animal6.jpg", "grumpycat@gmail.com", "1234");
        Animal animal7 = new Animal("Creamer", "4", "Cat", "Female", "Mixed breed", animal7Likes, animal7Dislikes,
                "She will straight up claw anyone who takes her toy mouse", "animal7.jpg", "katherine@gmail.com", "1234");
        Animal animal8 = new Animal("Lucifer", "10", "Cat", "Female", "Brown", animal8Likes, animal8Dislikes,
                "Took her to the vet to get a cat scan", "animal8.jpg", "John@gmail.com", "1234");
        Animal animal9 = new Animal("Mittens", "1", "Cat", "Male", "Brown", animal9Likes, animal9Dislikes,
                "He's the cutest thing ever", "animal9.jpg", "cutecat@gmail.com", "1234");
        Animal animal10 = new Animal("PartyCat", "2", "Cat", "Female", "White", animal10Likes, animal10Dislikes,
                "No joke her name is literally PartyCat and boy can she party", "animal10.jpg", "party@gmail.com", "1234");
        Animal animal11 = new Animal("Cory and Troy", "1", "Dog", "Male", "Wolf", animal11Likes, animal11Dislikes,
                "Two bros looking for more bro's", "animal11.jpg", "jimbros@gmail.com", "1234");
        Animal animal12 = new Animal("Dodge", "3", "Dog", "Male", "Corgi", animal12Likes, animal12Dislikes,
                "Was a meme once!", "animal12.jpg", "meme@gmail.com", "1234");
        Animal animal13 = new Animal("Sherral", "2", "Dog", "Female", "Shitzu", animal13Likes, animal13Dislikes,
                "She's always sleeping", "animal13.jpg", "sherral@gmail.com", "1234");
        Animal animal14 = new Animal("Steven the destroyer", "4", "Dog", "Male", "Shitzu", animal14Likes, animal14Dislikes,
                "My man here destroys everything in he's path", "animal14.jpg", "mozam@gmail.com", "1234");
        Animal animal15 = new Animal("Kate", "3", "Dog", "Female", "Short", animal15Likes, animal15Dislikes,
                "Just look at he's cute face", "animal15.jpg", "myman@gmail.com", "1234");
        Animal animal16 = new Animal("Stitch", "5", "Dog", "Male", "Alien", animal16Likes, animal16Dislikes,
                "We got him at a shelter and they told us he's a dog, but that seems sus.", "animal16.jpg", "lilo@gmail.com", "1234");
        Animal animal17 = new Animal("Polly", "1", "Bird", "Female", "Parrot", animal17Likes, animal17Dislikes,
                "Polly wants a cracker", "animal17.jpg", "polly@gmail.com", "1234");
        Animal animal18 = new Animal("Lazlo", "3", "Reptile", "Male", "lizard", animal18Likes, animal18Dislikes,
                "You're a lizard harry", "animal18.jpg", "lazlo@gmail.com", "1234");
        Animal animal19 = new Animal("Kool-Kat", "2", "Cat", "Male", "Tiger", animal19Likes, animal19Dislikes,
                "If you're down to party DM me", "animal19.jpg", "kool@gmail.com", "1234");
        Animal animal20 = new Animal("Chris P Bacon", "1", "Pig", "Male", "Pig", animal20Likes, animal20Dislikes,
                "Might have him for dinner later idk", "animal20.jpg", "chrispbacon@gmail.com", "1234");
        Animal animal21 = new Animal("Bizzy", "3", "Dog", "Male", "Shepard", animal21Likes, animal21Dislikes,
                "He did that taxes and said we can't afford a cat", "animal21.jpg", "biz@gmail.com", "1234");
        Animal animal22 = new Animal("Carl", "2", "LLama", "Male", "Alpaca", animal22Likes, animal22Dislikes,
                "I'm not sure why i bought him", "animal22.jpg", "alpaca@gmail.com", "1234");
        Animal animal23 = new Animal("Scratch", "1", "Squirrel", "Male", "Squirrel", animal23Likes, animal23Dislikes,
                "Cosplays the squirrel from Ice Age", "animal23.jpg", "squirrel@gmail.com", "1234");
        Animal animal24 = new Animal("Chicken pete", "1", "Bird", "Male", "Chicken", animal24Likes, animal24Dislikes,
                "Look at he's litte hair haha", "animal24.jpg", "hotchick@gmail.com", "1234");
        Animal animal25 = new Animal("Hooter", "2", "Bird", "Female", "Owl", animal25Likes, animal25Dislikes,
                "A fierce predator who is as cool as ice", "animal25.jpg", "ice@gmail.com", "1234");

        // Sets vertexs with animal objects
        Vertex<Animal> vertex1 = new Vertex<>(animal1, 6);
        Vertex<Animal> vertex2 = new Vertex<>(animal2, 4);
        Vertex<Animal> vertex3 = new Vertex<>(animal3, 4);
        Vertex<Animal> vertex4 = new Vertex<>(animal4, 3);
        Vertex<Animal> vertex5 = new Vertex<>(animal5, 3);
        Vertex<Animal> vertex6 = new Vertex<>(animal6, 3);
        Vertex<Animal> vertex7 = new Vertex<>(animal7, 4);
        Vertex<Animal> vertex8 = new Vertex<>(animal8, 6);
        Vertex<Animal> vertex9 = new Vertex<>(animal9, 3);
        Vertex<Animal> vertex10 = new Vertex<>(animal10, 3);
        Vertex<Animal> vertex11 = new Vertex<>(animal11, 4);
        Vertex<Animal> vertex12 = new Vertex<>(animal12, 3);
        Vertex<Animal> vertex13 = new Vertex<>(animal13, 3);
        Vertex<Animal> vertex14 = new Vertex<>(animal14, 1);
        Vertex<Animal> vertex15 = new Vertex<>(animal15, 2);
        Vertex<Animal> vertex16 = new Vertex<>(animal16, 1);
        Vertex<Animal> vertex17 = new Vertex<>(animal17, 3);
        Vertex<Animal> vertex18 = new Vertex<>(animal18, 1);
        Vertex<Animal> vertex19 = new Vertex<>(animal19, 3);
        Vertex<Animal> vertex20 = new Vertex<>(animal20, 2);
        Vertex<Animal> vertex21 = new Vertex<>(animal21, 1);
        Vertex<Animal> vertex22 = new Vertex<>(animal22, 2);
        Vertex<Animal> vertex23 = new Vertex<>(animal23, 3);
        Vertex<Animal> vertex24 = new Vertex<>(animal24, 2);
        Vertex<Animal> vertex25 = new Vertex<>(animal25, 2);

        // Sets vertexs with animal objects
        Edge<Animal> edge1 = new Edge<>(1, vertex1, vertex2);
        Edge<Animal> edge2 = new Edge<>(2, vertex2, vertex3);
        Edge<Animal> edge3 = new Edge<>(3, vertex3, vertex1);

        Edge<Animal> edge4 = new Edge<>(1, vertex4, vertex5);
        Edge<Animal> edge5 = new Edge<>(2, vertex1, vertex4);
        Edge<Animal> edge6 = new Edge<>(3, vertex5, vertex1);
        Edge<Animal> edge7 = new Edge<>(1, vertex6, vertex2);
        Edge<Animal> edge8 = new Edge<>(2, vertex7, vertex3);
        Edge<Animal> edge9 = new Edge<>(3, vertex8, vertex11);
        Edge<Animal> edge10 = new Edge<>(1, vertex8, vertex12);
        Edge<Animal> edge11 = new Edge<>(2, vertex9, vertex13);
        Edge<Animal> edge12 = new Edge<>(3, vertex20, vertex4);
        Edge<Animal> edge13 = new Edge<>(1, vertex10, vertex5);
        Edge<Animal> edge14 = new Edge<>(2, vertex12, vertex6);
        Edge<Animal> edge15 = new Edge<>(3, vertex11, vertex7);
        Edge<Animal> edge16 = new Edge<>(1, vertex13, vertex8);
        Edge<Animal> edge17 = new Edge<>(2, vertex14, vertex8);
        Edge<Animal> edge18 = new Edge<>(3, vertex15, vertex9);
        Edge<Animal> edge19 = new Edge<>(1, vertex18, vertex10);
        Edge<Animal> edge20 = new Edge<>(2, vertex16, vertex11);
        Edge<Animal> edge21 = new Edge<>(3, vertex17, vertex12);
        Edge<Animal> edge22 = new Edge<>(1, vertex19, vertex23);
        Edge<Animal> edge23 = new Edge<>(2, vertex22, vertex13);
        Edge<Animal> edge24 = new Edge<>(3, vertex24, vertex17);
        Edge<Animal> edge25 = new Edge<>(1, vertex21, vertex22);
        Edge<Animal> edge26 = new Edge<>(2, vertex23, vertex6);
        Edge<Animal> edge27 = new Edge<>(3, vertex25, vertex7);
        Edge<Animal> edge28 = new Edge<>(1, vertex10, vertex8);
        Edge<Animal> edge29 = new Edge<>(2, vertex11, vertex17);
        Edge<Animal> edge30 = new Edge<>(3, vertex3, vertex19);
        Edge<Animal> edge31 = new Edge<>(1, vertex2, vertex20);
        Edge<Animal> edge32 = new Edge<>(2, vertex1, vertex25);
        Edge<Animal> edge33 = new Edge<>(3, vertex7, vertex24);
        Edge<Animal> edge34 = new Edge<>(1, vertex8, vertex23);
        Edge<Animal> edge35 = new Edge<>(2, vertex9, vertex1);
        Edge<Animal> edge36 = new Edge<>(3, vertex15, vertex19);

        // sets the graph
        // Graph<Animal> graph = new Graph<>(vertex1, edge1);
        Graph<Animal> graph = new Graph<>();

        graph.getVertices().add(vertex1);
        graph.getVertices().add(vertex2);
        graph.getVertices().add(vertex3);
        graph.getVertices().add(vertex4);
        graph.getVertices().add(vertex5);
        graph.getVertices().add(vertex6);
        graph.getVertices().add(vertex7);
        graph.getVertices().add(vertex8);
        graph.getVertices().add(vertex9);
        graph.getVertices().add(vertex10);
        graph.getVertices().add(vertex11);
        graph.getVertices().add(vertex12);
        graph.getVertices().add(vertex13);
        graph.getVertices().add(vertex14);
        graph.getVertices().add(vertex15);
        graph.getVertices().add(vertex16);
        graph.getVertices().add(vertex17);
        graph.getVertices().add(vertex18);
        graph.getVertices().add(vertex19);
        graph.getVertices().add(vertex20);
        graph.getVertices().add(vertex21);
        graph.getVertices().add(vertex22);
        graph.getVertices().add(vertex23);
        graph.getVertices().add(vertex24);
        graph.getVertices().add(vertex25);

        graph.getEdges().add(edge1);
        graph.getEdges().add(edge2);
        graph.getEdges().add(edge3);

        graph.getEdges().add(edge4);
        graph.getEdges().add(edge5);
        graph.getEdges().add(edge6);
        graph.getEdges().add(edge7);
        graph.getEdges().add(edge8);
        graph.getEdges().add(edge9);
        graph.getEdges().add(edge10);
        graph.getEdges().add(edge11);
        graph.getEdges().add(edge12);
        graph.getEdges().add(edge13);
        graph.getEdges().add(edge14);
        graph.getEdges().add(edge15);
        graph.getEdges().add(edge16);
        graph.getEdges().add(edge17);
        graph.getEdges().add(edge18);
        graph.getEdges().add(edge19);
        graph.getEdges().add(edge20);
        graph.getEdges().add(edge21);
        graph.getEdges().add(edge22);
        graph.getEdges().add(edge23);
        graph.getEdges().add(edge24);
        graph.getEdges().add(edge25);
        graph.getEdges().add(edge26);
        graph.getEdges().add(edge27);
        graph.getEdges().add(edge28);
        graph.getEdges().add(edge29);
        graph.getEdges().add(edge30);
        graph.getEdges().add(edge31);
        graph.getEdges().add(edge32);
        graph.getEdges().add(edge33);
        graph.getEdges().add(edge34);
        graph.getEdges().add(edge35);
        graph.getEdges().add(edge36);

        return graph;
    }

    /**
     * This method creates a new user(Animal)
     *
     * @return a new instance of animal
     */
    public Animal createUser() {
        // Animal animal3 = new Animal("Roger", 3, "Dog", "Male", "Pug", animal1Likes,
        // animal1Dislikes ,"Once took a byte from my computer sciences homework",
        // "images/animal3");
        /*
		 * Animal newAnimal = new Animal(); Scanner in = new Scanner(System.in);
		 * System.out.println("Main.createUser(): Add new animal");
		 * System.out.println("Main.createUser(): add full name");
		 * newAnimal.setName(name); newAnimal.setAge(0); newAnimal.setBreed(breed);
		 * newAnimal.setGender(gender); newAnimal.setType(type); newAnimal.
         */

        return null;
    }
}
