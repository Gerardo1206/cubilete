package cubilete;

import java.util.ArrayList;

public class Cubilete {
    public static void main(String[] args) {
        int i=0;
        Jugada j1=new Jugada();
        Jugada final1=new Jugada();
        j1.tirar();
        System.out.println(j1.toString());
        ArrayList<Integer> ac=new ArrayList<>();
        ac.add(1);
        ac.add(4);
        ac.add(5);
        final1.setDie(j1.conservar(j1,ac));
        int tirar =5-final1.getDie().size();
        System.out.println(tirar);
        j1.tirar(tirar);
        System.out.println(j1.toString());
        System.out.println(final1.toString());
    }
    
}