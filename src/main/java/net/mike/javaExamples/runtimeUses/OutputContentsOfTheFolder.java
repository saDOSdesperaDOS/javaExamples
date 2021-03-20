package net.mike.javaExamples.runtimeUses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class outputContentsOfTheFolder {
 public static void main(String... args) {
     String line = "";
     String cmd = "dir";
     //System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
     try
     {
         //здесь "sleep 15" и есть ваша консольная команда
         Process proc = Runtime.getRuntime().exec("cmd /C cd ..");
         Process proc2 = Runtime.getRuntime().exec("cmd /C dir");
         BufferedReader dis = new BufferedReader( new InputStreamReader(proc2.getInputStream(), "Cp866"));

         while ((line = dis.readLine()) != null) {
             //System.out.println("Line: " + line);
             System.out.println(line);
         }
         proc.waitFor();
         proc.destroy();
         dis.close();

     }
     catch (IOException e)
     {
         e.printStackTrace();
     }
     catch (InterruptedException e)
     {
         e.printStackTrace();
     }
 }
}
