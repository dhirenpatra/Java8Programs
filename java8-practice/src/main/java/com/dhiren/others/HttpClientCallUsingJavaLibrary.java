package com.dhiren.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HttpClientCallUsingJavaLibrary {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            // print result
            final String trimedResponse = response.toString().replace('[', ' ')
                    .replace(']', ' ').
                            replace('{', ' ')
                    .replace('}', ' ')
                    .replace(" \"", " ").trim();
            System.out.println(trimedResponse);
            final List<String> title = Arrays.asList(trimedResponse.split(",")).stream()
                    .filter(str -> str.contains("title")).collect(Collectors.toList());
            System.err.println("&&&&&");
            System.err.println("&&&&&");
            System.err.println(title.size());
            System.err.println("&&&&&");
            System.err.println("&&&&&");
        } else {
            System.out.println("GET request not worked");
        }
    }
}
