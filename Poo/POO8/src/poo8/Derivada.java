package poo8;

public class Derivada extends Base{
    
    private int a;
    private int c;
    
    public Derivada(Base b, int a, int c){
        super(b.getA(),b.getB());
        this.a = a;
        this.c = c;
    }
    
    public int getA(){
        return a;
    }
    
    public int getC(){
        return c;
    }
    
    public int getAsuper(){
        return super.getA();
    }
    
    public int getBsuper(){
        return super.getB();
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setC(int c){
        this.c = c;
    }
    
    public void setAsuper(int a){
        super.setA(a);
    }
    
    public void setBsuper(int b){
        super.setB(b);
    }
    
    public String toString(){
        String s;
        s = super.toString();
        s = s + "Classe Derivada ---";
        s = s + " A: " + this.a + " " + "B: " + this.c;
        return s;
    }
    
    public int soma(){
        int sum = super.soma() + this.a + this.c;
        return sum;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Derivada deriv = (Derivada) obj;
            ig = this.a == deriv.a && (this.c == deriv.c) && (super.equals(deriv));
        }
        else{
            ig = false;
        }
        return ig;
    }
    
    public Object clone(){
        Base b = new Base(super.getA(), super.getB());
        Derivada copia = new Derivada(b, this.a, this.c);
        return copia;
    }
}
