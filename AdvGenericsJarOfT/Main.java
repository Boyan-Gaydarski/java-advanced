package AdvGenericsJarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> jarOne = new Jar<>();
        Jar<String> jarTwo = new Jar<>();

        jarOne.add(3);
        jarTwo.add("hi");
    }
}
