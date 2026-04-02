package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();


            for (String arg : args) {
                nameBuilder.append(arg).append(", ");
            }


            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

        }

        System.out.println("Hello, " + name + "!");
    }
}