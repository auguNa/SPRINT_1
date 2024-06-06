package N1Ejercicio2;

public class ExternalClass {
    @SuppressWarnings("deprecation")
    public void invokeDeprecatedMethods(OnlineWorker onlineWorker, InPersonWorker inPersonWorker) {
        onlineWorker.oldMethod();
        inPersonWorker.oldMethod();
    }
}
