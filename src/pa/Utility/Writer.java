package pa.calc.Utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private static final String _results = "../results.txt";

    public void Write(Double num){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String results = "O resultado é: " +  num.toString() + " .";
            fw = new FileWriter(_results);
            bw = new BufferedWriter(fw);
            bw.write(results);
            System.out.println("Successfully wrote the text document");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
        finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
