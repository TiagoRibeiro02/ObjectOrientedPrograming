
package base2;


public class Derivada2 extends Base2 {
    private int a;
    private int c;
    
    public Derivada2(Base2 b2, int a, int c){
        super(b2.getA(),b2.getB());
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
    
    
    
    public String toString() {
        String s;
        s = super.toString();
        s = s + "Classe Derivada ---";
        s = s + " A: " + this.a + " " + "B: " + this.c;
        return s;
    }
    
    public int soma(Derivada2 deriv){
        int sum;
        sum = deriv.getA() + deriv.getC() + deriv.getAsuper() + deriv.getBsuper();
        return sum;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Derivada2 deriv = (Derivada2) obj;
            ig = this.getA() == deriv.getA() && (this.getC() == deriv.getC()) && (super.equals(deriv));
        }
        else{
            ig = false;
        }
        return ig;
    }
    
    public Object clone(){
        Base2 b = new Base2(super.getA(), super.getB());
        Derivada2 copia = new Derivada2(b, this.a, this.c);
        return copia;
    }
}



