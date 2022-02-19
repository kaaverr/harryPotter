package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

            String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Java02\\Desktop\\harry.txt")));
            String cleanerContent1 = content.toLowerCase().replaceAll("[^A-Za-z ]" , "");
        String[] words = cleanerContent1.split(" ");
        List<String> list = new ArrayList<>(
                Arrays.asList(words)
        );
        List<String> unique = list.stream().distinct().collect(Collectors.toList());
        List<String> uniqueOrder = unique.stream().sorted().collect(Collectors.toList());
    }
}
