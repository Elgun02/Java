public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Adrian", 19, 178, 62, 3000, 5000);

        System.out.println(worker.calculatePension());

        worker.setGender(Gender.MALE);
        System.out.println(worker.calculatePension());

        worker.setGender(Gender.FEMALE);
        System.out.println(worker.calculatePension());

    }
}