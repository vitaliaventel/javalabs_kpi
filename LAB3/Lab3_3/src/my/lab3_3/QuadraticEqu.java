package my.lab3_3;

public class QuadraticEqu {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEqu(int a, int b, int c){
		this.a = a;
		if(this.a < 1E-3) throw new IllegalArgumentException("Its not a quadratic equation"); 
		this.b = b;
		this.c = c;
	}
	
	public QuadraticEqu(int a, int b){
		this.a = a;
		this.b = b;
		this.c = 0;
	}
	
	public double Discriminant(){
		double result = 0;
		result = Math.pow(this.b, 2) - (4 * this.a * this.c);
		if (result < 0) throw new ArithmeticException("QE doesnt have real roots");
		return result;
	}
	
	public double firstRoot(){
		double x1 = 0;
		if(this.Discriminant()>0){
			x1 = (-this.b + Math.sqrt(this.Discriminant())) / (2 * this.a);
		}
		else if(this.Discriminant()==0){
			x1 = -this.b / (2 * this.a);
		}
		return x1;
	}
	
	public double secondRoot(){
		double x2 = 0;
		if(this.Discriminant()>0){
			x2 = (-this.b - Math.sqrt(this.Discriminant())) / (2 * this.a);
		}
		else if(this.Discriminant()==0){
			x2 = -this.b / (2 * this.a);
		}
		return x2;
	}
	
    public String toString() {
        return (this.a + " * " + " x^2 " + " + " +
        		this.b + " * " + "x " + " + " + c + " = 0" + "\n");
    }
	
	
    public boolean equals(Object obj) {
    if (obj instanceof QuadraticEqu)
       	 return (this.Discriminant() == ((QuadraticEqu) obj).Discriminant());
        return false;
    }
}
