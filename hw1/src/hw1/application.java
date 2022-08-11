package hw1;

public class application {
public static void main(String[] args) {
int a = 1;
byte b = 2;
short c = 3;
long d = 4;
double x = 5;
float n = 6;
char m = 97;
boolean k = true;
System.out.println("var a = "+a);
System.out.println("var b = "+b);
System.out.println("var c = "+c);
System.out.println("var d = "+d);	
System.out.println("var x = "+x);
System.out.println("var n = "+n);			
System.out.println("var m = "+m);
System.out.println("var k = "+k);	
System.out.println("short="+Short.MIN_VALUE);
System.out.println("short="+Short.MAX_VALUE);
System.out.println("byte="+Byte.MIN_VALUE);
System.out.println("byte="+Byte.MAX_VALUE);
System.out.println("long="+Long.MIN_VALUE);
System.out.println("long="+Long.MAX_VALUE);
System.out.println("double="+Double.MIN_VALUE);
System.out.println("double="+Double.MAX_VALUE);
System.out.println("float="+Float.MIN_VALUE);
System.out.println("float="+Float.MAX_VALUE);
int array1[] = new int[] {9, 90, 12, 23, 21, 24, 15};
int max = getMax(array1);
System.out.println("Найбільше число "  +max);
int min = getMin(array1);
System.out.println("Найменше число "  +min);
}
public static int getMax(int[] inputArray){ 
	 int maxValue = inputArray[0]; 
	 for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
	 maxValue = inputArray[i]; 
	 } 
	 } 
	 return maxValue; 
	 }
	 public static int getMin(int[] inputArray){ 
	 int minValue = inputArray[0]; 
	 for(int i=1;i<inputArray.length;i++){ 
	 if(inputArray[i] < minValue){ 
	 minValue = inputArray[i]; 
	 } 
	 } 
	 return minValue; 
}
}

