package com.githubtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class APIHandler {

  private String token = "77df09d02d6955d4b5561b1ed770efa3b2df0ed8";

  protected String requestGet(String get) throws Exception {
    String result = "";

    URL url = new URL(get);

    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    try {
      con.setRequestMethod("GET");
      con.setRequestProperty("Accept", "application/json");
      con.setRequestProperty("Authorization", "Bearer "+ token );
      result = getResult(con);
      con.disconnect();
    } catch (Exception ex) {
      con.disconnect();
      throw ex;
    }
    return result;
  }
  
  protected String requestPost(String post) throws Exception {
    String result = "";
    URL url = new URL(post);
    
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    try {
        con.setRequestMethod("POST");
        con.setRequestProperty("Authorization", "Bearer "+ token );

        con.setDoOutput(true);
        con.setDoInput(true);

        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");

        result = getResult(con);

        con.disconnect();
    } catch (Exception ex) {
       
        con.disconnect();
        throw ex;
    }
    return result;
}
  public String requestPostWithBodyJSONData(String urlAddress, String data) throws Exception {
    String result = "";
    URL url = new URL(urlAddress);
    

    
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    try {
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("authorization", "Bearer "+ token );


        OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
        
        System.out.println(data);
        writer.write(data);
        writer.flush();
        writer.close();

        result = getResult(con);

        con.disconnect();
    } catch (Exception ex) {
        
        con.disconnect();
        throw ex;
    }
    return result;
}

  protected String getResult(HttpURLConnection con) throws Exception {
    String result = "";
    BufferedReader reader = null;
    String line = "";

    int respCode = con.getResponseCode();

    if (respCode == HttpURLConnection.HTTP_OK || respCode == HttpURLConnection.HTTP_CREATED
        || respCode == HttpURLConnection.HTTP_NO_CONTENT) {
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

      while ((line = reader.readLine()) != null) {
        result += line;
      }
      System.out.println(respCode + " - " + result);

    } else {
      reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));

      while ((line = reader.readLine()) != null) {
        result += line;
      }

      throw new Exception(respCode + " - " + result);
    }

    return result;
  }
  
  public String requestDelete(String delete) throws Exception {
    String result = "";
    URL url = new URL(delete);
    
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    try {
        con.setRequestMethod("DELETE");

        con.setDoOutput(true);
        con.setDoInput(true);

        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("authorization", "Bearer "+ token );
        
        result = getResult(con);

        con.disconnect();
    } catch (Exception ex) {
      
        con.disconnect();
        throw ex;
    }
    return result;
}

  public String requestPut(String put) throws Exception {
    String result = "";
    URL url = new URL(put);
    
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    try {
        con.setRequestMethod("PUT");

        con.setDoOutput(true);
        con.setDoInput(true);

        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("authorization", "Bearer "+ token );
        
        result = getResult(con);

        con.disconnect();
    } catch (Exception ex) {
      
        con.disconnect();
        throw ex;
    }
    return result;
  }
  public String requestPutWithBodyJSONData(String urlAddress, String data) throws Exception {
    String result = "";
    URL url = new URL(urlAddress);
   
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    try {
        con.setRequestMethod("PUT");
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("authorization", "Bearer "+ token );

        OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
        
        System.out.println(data);
        writer.write(data);
        writer.flush();
        writer.close();

        result = getResult(con);
        con.disconnect();
    } catch (Exception ex) {
       
        con.disconnect();
        throw ex;
    }
    return result;
}
}
