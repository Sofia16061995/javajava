public class Main {
    public static void main(String[] args) {
        ToyQueueManager queueManager = new ToyQueueManager();

        // Заполнение очереди игрушками
        queueManager.addToyToQueue(new Toy(1, "Мяч", 1.5));
        queueManager.addToyToQueue(new Toy(2, "Кукла", 2.0));
        queueManager.addToyToQueue(new Toy(3, "Машинка", 1.2));

        // Вызов метода для получения игрушек и записи результатов в файл
        queueManager.getToysAndWriteToFile(10, "output.txt");
    }
}
