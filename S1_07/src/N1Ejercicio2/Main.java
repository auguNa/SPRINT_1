package N1Ejercicio2;

public class Main {
    public static void main(String[] args) {

        OnlineWorker onlineWorker = new OnlineWorker("Jane", "Smith", 25.0);
        InPersonWorker inPersonWorker = new InPersonWorker("Jim", "Beam", 22.0);

        int hoursWorked = 160;

        System.out.println("Online Worker Salary: €" + onlineWorker.calculateSou(hoursWorked));
        System.out.println("In-Person Worker Salary: €" + inPersonWorker.calculateSou(hoursWorked));

        ExternalClass externalClass = new ExternalClass();
        externalClass.invokeDeprecatedMethods(onlineWorker, inPersonWorker);


    }
}
