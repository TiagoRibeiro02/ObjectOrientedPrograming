
package base2;


public class Base2 {

    protected int a;
    protected int b;

    public Base2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soma() {
        return a + b;
    }

    public int soma(int x) {
        return a + b + x;
    }

    public int getA() {
        return a;
    }
    
    public int getB(){
        return b;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public String toString(){
        String s;
        s = "Classe Base ---";
        s = s + " A: " + this.a + " " + "B: "+ this.b + "\n";
        return s;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Base2 base1 = (Base2) obj;
            ig = (this.a == base1.a) && (this.b == base1.b);
        }
        else{
            ig = false;
        }
        return ig;
    }
    
    public Object clone(){
        Base2 copia = new Base2(this.a, this.b);
        return copia;
    }
}