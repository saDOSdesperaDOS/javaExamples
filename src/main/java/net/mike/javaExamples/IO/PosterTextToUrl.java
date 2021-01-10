package net.mike.javaExamples.IO;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class PosterTextToUrl {
/*Считываем данные с URL и вставляем их посимвольно в список, установив кодировку UTF-8*/
    public List<Character> getData(URL urlAddress) throws IOException {
        int oneByte = 0;
        List<Character> l = new ArrayList<>();
        Reader in = new InputStreamReader(urlAddress.openStream(), Charset.forName("utf-8"));

        while ((oneByte = in.read()) != -1) {
            char c = (char) oneByte;
            l.add(c);
        }
        in.close();
        return l;
    }

 public void postingText() {
    String req = "This text is posting to URL";
    try{
    // Указываем URL нужной CGI-программы
            URL url = new URL("https://www.1tv.ru/shows/videli-video/vypuski/videli-video-luchshee-vypusk-ot-10-01-2021");
    // Создаем объект uc
            URLConnection uc = url.openConnection();
    // Собираемся отправлять
            uc.setDoOutput(true);
    // и получать сообщения
            uc.setDoInput(true);
    // без кэширования
            uc.setUseCaches(false);
    // Задаем тип
            uc.setRequestProperty("content-type", "application/octet-stream");
    // и длину сообщения
            uc.setRequestProperty("content-length", "" + req.length());
    // Устанавливаем соединение
            uc.connect();
    // Открываем выходной поток
            DataOutputStream dos = new DataOutputStream(uc.getOutputStream());
    // и выводим в него сообщение, посылая его на адрес
            dos.write(req.getBytes());
    // Закрываем выходной поток
            dos.close();
    // Открываем входной поток для ответа сервера
            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream())) ;
            String res = null;
    // Читаем ответ сервера и выводим его на консоль
            while ((res = br.readLine()) != null)
                System.out.println(res);
            br.close () ;
    } catch(
            MalformedURLException me){
                System.err.println(me);
    } catch(
            UnknownHostException he){
                System.err.println(he);
    } catch(
            UnknownServiceException se){
                System.err.println(se);
    } catch(
            IOException ioe){
                System.err.println(ioe);
    }
 }
}
