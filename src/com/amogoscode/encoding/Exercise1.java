package com.amogoscode.encoding;

import com.sun.deploy.net.URLEncoder;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) throws UnsupportedEncodingException {


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


        // encode to URL
        String q = "dddd<script>";
        String urlEncodedString = URLEncoder.encode(q, "UTF-8");
        System.out.println("urlEncodedString: "+urlEncodedString);

        //Todo: compose the url components into an array, loop and check if there are parameters

        String[] array = input.split("\\/");
        List list = Arrays.asList(array);
        list.forEach(eachChunk -> System.out.println(eachChunk));


        //Todo: Encoding the entire query string will also encode the = and & separators, which is not correct.



    }

}
