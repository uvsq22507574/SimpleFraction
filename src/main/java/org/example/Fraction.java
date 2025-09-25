package org.example;

public class Fraction {
    private int numerateur;
    private int denominateur;
    public String toString() {   return "Je suis une fraction.";}
    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    public Fraction(int numerateur){
        this(numerateur,1);
    }
    public Fraction(){
        this(0, 1);
    }
    public static final Fraction ZERO = new Fraction(0,1);
    public static final Fraction UN = new Fraction(1,1);

    public int getNumerateur(){return this.numerateur;}
    public int getDenominateur(){return this.denominateur;}

    public double doubleValue(){
        return (double)this.numerateur / this.denominateur;
    }

    public Fraction add(Fraction f1, Fraction f2){
        int num =(f1.numerateur * f2.denominateur) + (f1.denominateur * f2.numerateur);
        int denum = (f1.denominateur * f2.denominateur);
        return new Fraction(num, denum);
    }

    public boolean egal(Fraction f1, Fraction f2){
        return (f1.numerateur/f1.denominateur) == (f2.numerateur/f2.denominateur);
    }

    public int compareTo(Fraction f1, Fraction f2  ) {
        return Integer.compare(
                f1.numerateur * f2.denominateur,
                f2.numerateur * f1.denominateur
        );
    }


}
