package net.mike.javaExamples.runtimeUses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeExcec {
   public void exec(String command) {
       String line = "";
       //EX: command = "ipconfig";
        try   {
        Process proc = Runtime.getRuntime().exec(command);
        BufferedReader dis = new BufferedReader( new InputStreamReader(proc.getInputStream(), "Cp866"));
        while ((line = dis.readLine()) != null) {
            System.out.println("Line: " + line);
        }
        proc.waitFor();
        proc.destroy();
        dis.close();
    }
        catch (
    IOException e) {
        e.printStackTrace();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
