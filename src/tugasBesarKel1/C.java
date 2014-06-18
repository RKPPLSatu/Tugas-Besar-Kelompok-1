package tugasBesarKel1;

public class C extends Math {
	
	private double n1;
 
    private double n2;

    public C () {
    }

    
    public double getN1 () {
        return n1;
    }

     
    public void setN1 (double val) {
        this.n1 = val;
    }

     
    public double getN2 () {
        return n2;
    }

     
    public void setN2 (double val) {
        this.n2 = val;
    }

    
    public int add (int n1,int n2) {
        return n1+n2;
    }

   
    public int sub (int n1,int n2) {
        return n1-n2;
    }

     
    public double mul (double n1, double n2) {
        return n1*n2;
    }

    
    public double div (double n1, double n2) {
        return n1/n2;
    }

   
    public String toString () {
        return null;
    }

   
    public int mod (int n1, int n2) {
        return n1%n2;
    }

     
    public double sqrt (double n) {
        return 0.0;
    }

}
