import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        byte smallest = 0;
        short small = 10000;
        int large = 100000;
        long largest = 100000000L;
        float smallestFloat = 0.0f;
        double smallestDouble = 0.00000000d;
        String name = "Joao";
        boolean boo = false;
        char letter = 'a';
        int[] vetores = {1, 2, 3};

        ArrayList<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Pedro");
        lista.add("João");
//        for (String s : lista) System.out.println(s);

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for(String nome : lista) {
            System.out.println(nome);
        }

    }
}