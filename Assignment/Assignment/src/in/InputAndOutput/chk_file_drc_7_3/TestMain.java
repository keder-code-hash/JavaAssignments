

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.File;
public class TestMain { 
    public static void main(String[] args){
        String inp="";
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            inp=bufferedReader.readLine();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            File file=new File(inp);
            if(file.isDirectory()){
                System.out.println("directory");
                File[] allFiles=file.listFiles(); 
                for(int i=0;i<allFiles.length;i++){
                    System.out.println(allFiles[i].getName());
                } 
            }
            else if(file.isFile()){
                System.out.println("file");       
                if(file.canRead()){
                    System.out.println("readable file.");
                }
                if(file.canWrite()){
                    System.out.println("writable file.");
                }
                if(file.canExecute()){
                    System.out.println("executable file.");
                }
            }
            else{
                System.out.println("invalid");
            }
            // file.close();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
