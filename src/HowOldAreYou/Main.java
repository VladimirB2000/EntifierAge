package HowOldAreYou;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    String age = reader.readLine();
    int a = Integer.parseInt(age);
    if(a<18)
        System.out.println("Подрасти еще");

}}
