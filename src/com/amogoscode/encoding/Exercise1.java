package com.amogoscode.encoding;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("aaa");

        String input = "aaaa/bbbb/ccccc/dddd<script>";
        System.out.println("input: "+input);

        // encode to UTF-8
        String rawString = "Entwickeln Sie mit Vergnügen";
        byte[] bytes = rawString.getBytes();

        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        String asciiEncodedString = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println("rawString: "+rawString);
        System.out.println("utf8EncodedString: "+utf8EncodedString);
        System.out.println("asciiEncodedString: "+asciiEncodedString);


        // urlEncoding: replacing URL reserved characters with their UTF-8 encoding
        String q = "dddd<script>";
        q = "http://localhost:8080/servlet?param=value&param1=value1#";
        //urlEncoding output: http%3A%2F%2Flocalhost%3A8080%2Fservlet%3Fparam%3Dvalue%26param1%3Dvalue1%23
        //urlEncoding problem: /, ? , = , and # are also encoded
        String urlEncodedString = URLEncoder.encode(q, "UTF-8");
        System.out.println("urlEncodedString: "+urlEncodedString);

        //Todo: compose the url components into an array, loop and check if there are parameters

        String[] array = input.split("\\/");
        List list = Arrays.asList(array);
        list.forEach(eachChunk -> System.out.println(eachChunk));


        //Todo: Encoding the entire query string will also encode the = and & separators, which is not correct.
        //http://localhost:8080/servlet?param=value  request.getQueryString: param=value



    }

}
