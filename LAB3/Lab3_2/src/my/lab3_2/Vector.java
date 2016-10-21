package my.lab3_2;

public class Vector {

	private int[] array;
	
	public Vector(int[] array){
		this.array=array;
	}
	
	 public Vector (int size) {
	        this.array = new int[size];
	    }
	
	 public int[] getArray() {
	        return this.array;
	    }
	    
	    public int getValue(int index) {
	        return this.array[index];
	    }
	    
	    public int getCount() {
	        return this.array.length;
	    }
	    
	    public void setArray(int[] array) {
	        this.array = array;
	    }
	    
	    public void setValue(int index, int value) {
	        this.array[index] = value;
	    }
	    
	public Vector addition(Vector v1){
		Vector result = null;
        if (this.equals(v1)) {
            int size = this.getCount();
            int tmpValue;
            result = new Vector(size);
            for (int i=0; i<size; i++) {
                tmpValue = this.getValue(i) + v1.getValue(i);
                result.setValue(i,tmpValue);
            }
        }
        return result;
	}
	
	 public Vector sub(Vector v1) {
	        Vector result = null;
	        if (this.equals(v1)) {
	            int size = this.getCount();
	            int tmpValue;
	            result = new Vector(size);
	            for (int i=0; i<size; i++) {
	                tmpValue = this.getValue(i) - v1.getValue(i);
	                result.setValue(i,tmpValue);
	            }
	        }
	        return result;
	    }
	 
	 public Vector inc(){
		 Vector result = null;
		 int size = this.getCount();
		 int tmpValue;
		 result = new Vector(size);
		 for(int i=0; i<size;i++){
			 tmpValue = this.getValue(i)+1;
			 result.setValue(i, tmpValue);
		 }
		 return result;
	 }
	 
	 public Vector dec(){
		 Vector result = null;
		 int size = this.getCount();
		 int tmpValue;
		 result = new Vector(size);
		 for(int i=0; i<size;i++){
			 tmpValue = this.getValue(i)-1;
			 result.setValue(i, tmpValue);
		 }
		 return result;
	 }
	    
	    public Vector multiply(Vector v1) {
	        Vector result = null;
	        if (this.equals(v1)) {
	            int size = this.getCount();
	            int tmpValue;
	            result = new Vector(size);
	            for (int i=0; i<size; i++) {
	                tmpValue = this.getValue(i) * v1.getValue(i);
	                result.setValue(i,tmpValue);
	            }
	        }
	        return result;
	    }
	    
	    public int scalarMultiply(Vector v1) {
	        Vector tmpArray = this.multiply(v1);
	        int result = 0;
	        int size = tmpArray.getCount();
	        for (int i=0; i<size; i++) {
	            result += tmpArray.getValue(i);
	        }
	        return result;
	    }
	 
	    public int length() {
	        return this.scalarMultiply(this);
	    }
	    
	    public double angle(Vector v1) {
	        double tmpValue;
	        tmpValue = this.scalarMultiply(v1)/Math.sqrt(this.length() * v1.length());
	        tmpValue = (Math.acos(tmpValue));
	        return Math.toDegrees(tmpValue); 
	    }
	    
	    public String toString() {
	        String result = "";
	        for (int tmpValue : array) {
	            result += String.valueOf(tmpValue)+" ";
	        }
	        return result;
	    }
	    
	    public boolean equals(Object obj) {
	         if (obj instanceof Vector)
	        	 return (this.getCount() == ((Vector) obj).getCount());
	         return false;
	     }
}
