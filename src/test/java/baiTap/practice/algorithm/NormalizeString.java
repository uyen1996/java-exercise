package baiTap.practice.algorithm;
import java.io.DataInputStream;
import java.util.StringTokenizer;
import java.util.Scanner;

public class NormalizeString {
    public static String uperCaseFirstChar(String str){
        String s,strOutput;
        s= str.substring(0, 1);
        strOutput= str.replaceFirst(s,s.toUpperCase());
        return (strOutput);
    }
    public static String nomalize(String strInput){
        String strOutput="";
        StringTokenizer strToken= new StringTokenizer(strInput," ,\t,\r");
        strOutput+=""+uperCaseFirstChar(strToken.nextToken());
        while(strToken.hasMoreTokens()){
            strOutput+=" "+uperCaseFirstChar(strToken.nextToken());
        }
        return(strOutput);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input String: ");
        String strInput ;
        strInput = kb.nextLine();
        System.out.println("Output String: " + nomalize(strInput));
        }
    }

