import java.io.*;
import java.net.*;
public  class Client
{
    public static void main(String[] args) throws IOException
    {
        
        Socket ss = new Socket("192.168.1.1",9999);

        System.out.println("COnneection Established on the port 9999");


        PrintWriter pw = new PrintWriter(ss.getOutputStream(),true);

        BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));

        BufferedReader rbkey = new BufferedReader(new InputStreamReader(System.in));


        new Thread(()->{

                try 
                {
                    String line;
                while ((line = br.readLine())!= null) {
                    System.out.println(line); 
                    
                }    
                } catch (IOException e) 
                {
                System.out.println(e);
                }


        }).start();
            String nana;
                while ((nana = rbkey.readLine())!=null)
                 {                     pw.println("Client:"+nana);

                }



                ss.close();
                pw.close();
    }

}