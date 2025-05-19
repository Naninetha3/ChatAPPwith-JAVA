import java.io.*;
import java.net.*;
public  class Server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(9999);
        Socket sc = ss.accept();

        System.out.println("COnneection Established on the port 9999");


        PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);

        BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));

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
                 { 
                    pw.println("Server:"+nana);
                }



                ss.close();
                pw.close();
    }

}