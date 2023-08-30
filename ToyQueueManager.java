import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToyQueueManager {
    private Queue<Toy> toyQueue;

    public ToyQueueManager() {
        toyQueue = new PriorityQueue<>((t1, t2) -> Double.compare(t2.getWeight(), t1.getWeight()));
    }

    public void addToyToQueue(Toy toy) {
        toyQueue.add(toy);
    }

    public void getToysAndWriteToFile(int times, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < times; i++) {
                Toy toy = toyQueue.poll();
                if (toy != null) {
                    writer.write("Got toy: " + toy.getName() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
