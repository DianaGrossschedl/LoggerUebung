public class DemoApp {

    public static void main(String[] args) {


        Logger logger = new Logger("C:\\Users\\diana\\Documents\\Campus 02\\IWI\\Bachelor\\2_Semester\\4_ETS\\Übungsblätter\\loggerUebung.txt");
        logger.logFatal("Fataler Fehler");
        logger.logDebug("Debug-Error-Message");
    }

}
