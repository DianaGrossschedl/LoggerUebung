import java.io.*;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    private String path;

    public Logger(String path) {
        this.path = path;
    }

    private void logMessage(ErrorMessage message){

        File file = new File(this.path);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter((file),true))){

            String error = message.toLine();

            bw.write(error);
            bw.newLine();

        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e);
        } catch(IOException e){
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public void logFatal(String message){
        ErrorMessage error = new ErrorMessage("FATAL",message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(error);
    }

    public void logError(String message){
        ErrorMessage error = new ErrorMessage("ERROR",message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(error);
    }

    public void logInfo(String message){
        ErrorMessage error = new ErrorMessage("INFO",message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(error);
    }

    public void logDebug(String message){
        ErrorMessage error = new ErrorMessage("DEBUG",message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(error);
    }

}
