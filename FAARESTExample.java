package gov.faa.services;  
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.net.MalformedURLException;  
import java.net.URL;  
import java.net.URLConnection;  
  
public class ServiceExample {  
  
    /** 
     * Connect to the FAA REST API and get airport statuses. 
     * 
     * @param args 
     */  
    public static void main(String[] args) {  
        try {  
            URL service = new URL("http://services.faa.gov/airport/status/IAD");  
            URLConnection con = service.openConnection();  
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));  
            String line;  
            while ((line = in.readLine()) != null) {  
                System.out.println(line);  
            }  
            in.close();  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
