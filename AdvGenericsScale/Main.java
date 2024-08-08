package AdvGenericsScale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> scale = new Scale<>(1, 5);

        System.out.println(scale.getHeavier());

        Scale<String> scale2 = new Scale<>("asd", "asa");

        System.out.println(scale2.getHeavier());
    }
}
