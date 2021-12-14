import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.File;
class TestMain{ 
    public static int findStr(String findString,String str){
        int count=0,i=0;
        while(i<str.length()){ 
            if(str.charAt(i)==findString.charAt(0)){ 
                int j=0;
                while(j<findString.length()){
                    if(str.charAt(i+j)==findString.charAt(j)){
                        j++;
                    }
                    else{
                        break;
                    }
                }
                // System.out.println("matched at index: "+i+" length :"+j);
                if(j==findString.length()){
                    count++;
                    i+=findString.length()-1;
                }
                else{
                    i++;
                }
            }
            else{
                i++; 
            }
        }
        return count;
    }
    public static void main(String[] args) { 
        // "D:/Java/InputAndOutput/grep_7_2/test1.txt"
        // java TestMain "D:/Java/InputAndOutput/grep_7_2/test1.txt" Proin
        String filePath="";
        String word="";
        try{
            filePath=args[0];
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try {
                word=args[1];
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        BufferedReader bfReader=null;
        try { 
            bfReader=new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));
            int lineNo=0,sentenceNo=0,charNo=0,freq=0;  
            Scanner sc=new Scanner(bfReader);
            // String word="Proin";
            while(sc.hasNextLine()==true){ 
                String str=sc.nextLine(); 
                // frequency 
                if(word!=""){
                    freq+=findStr(word, str);
                }
                // sentence no and character no
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='.'){
                        sentenceNo++;
                    }
                    charNo++;
                } 
                lineNo++;
            } 
            System.out.println("Total Lines :"+lineNo+" "+"\nTotal Sentence Number :"+sentenceNo+" "+"\nTotal Characters: "+charNo+" "+"\nFrequency of "+word+" is : "+freq);  
            bfReader.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}