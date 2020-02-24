package cubilete;

import java.util.ArrayList;

public class Jugada {
    private ArrayList<Die> die;
    
    public Jugada(){
        die=new ArrayList<>();
    }

    public void tirar(){
        die.clear();
        int i=0;
        while(i<5){
        Die d0=new Die();
        die.add(d0);
        i++;
        }
    }
    
    public void tirar(Integer a){
        die.clear();
        int i=0;
        while(i<a){
        Die d0=new Die();
        die.add(d0);
        i++;
        }
    }
    
    public  ArrayList<Die> conservar(Jugada j1,ArrayList<Integer> aconservar){
        ArrayList<Die> resultado=new ArrayList<>();
        int i=0;
        while(i<aconservar.size()){
            Integer a=aconservar.get(i)-1;
            Die b=j1.getDie().get(a);
            resultado.add(b);
            i++;
        }
        return resultado;
    }

    public ArrayList<Die> getDie() {
        return die;
    }

    public void setDie(ArrayList<Die> die) {
        this.die = die;
    }
    
    
    @Override
    public String toString() {
       return this.getDie().toString();
    }
    
    
}