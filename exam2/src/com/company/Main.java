package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pepperoni pepperoni = new Pepperoni(20,202,"Острая");
        pepperoni.delivery();
        pepperoni.bake();
        Pepperoni pepperoni1 = new Pepperoni(200,2002,"Обычная");
        pepperoni.delivery();
        pepperoni.bake();
        Margarita margarita = new Margarita(200,2000,"Мясная");
        margarita.delivery();
        margarita.bake();
        Margarita margarita1 = new Margarita(200,2000,"Куриная");
        margarita.delivery();
        margarita.bake();
        Lafinta lafinta = new Lafinta(200,200,"C грибами");
        lafinta.delivery();
        lafinta.bake();
        Lafinta lafinta1 = new Lafinta(200,200,"Без грибов");
        lafinta.delivery();
        lafinta.bake();


    }
}
