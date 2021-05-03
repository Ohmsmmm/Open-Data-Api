package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.Integer.parseInt;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Handle {

   
    public static String sendGetRequest(String status) {
        try {
            String api = "";
            int s = parseInt(status);
            switch(s) {
                case 1:
                    api = "https://opend.data.go.th/get-ckan/datastore_search?resource_id=a15653e5-05a2-48e7-aeaa-c721f2b088f9";
                    break;
                case 2:
                    api = "https://opend.data.go.th/get-ckan/datastore_search?resource_id=756c7040-19ac-49bb-9d44-0f22cab6d763";
                    break;
            }
            URL url = new URL(api);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");

            //adding header
            httpURLConnection.setRequestProperty("api-key", "1ybd8GA3OvBKcg6m7rxNiaPVdfWi2G6D");

            String line = "";
            InputStreamReader inputStreamReader=new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder response = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null){
                response.append(line);
            }
            bufferedReader.close();
            JSONObject json = new JSONObject(response.toString());
            return json.toString(4);
        }
        catch (Exception e){
            return "Error: " + e;
        }
    }
}
