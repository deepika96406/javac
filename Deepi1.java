import java.io.*;

public class Deepi1
      {
    public static void main(String args[]) 
         {
        try 
           {
            BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ARITHMETIC OPERATION");
            System.out.println("--------------------");
            System.out.println("Enter the first number");
            String S1 = dis.readLine();
            int a = Integer.parseInt(S1);              
             System.out.println("Enter the Second number");
            String S2 = dis.readLine();
            int b = Integer.parseInt(S2);  
            System.out.println("Result");
            int c = a + b;
            System.out.println("Add: " + c);
            c = a - b;
            System.out.println("Sub: " + c);       
            c = a * b;
            System.out.println("Mul: " + c);
            c = a / b;
            System.out.println("Div: " + c);
            System.out.println("Division by zero is not allowed.");
            }
            catch (Exception e) 
            {
            System.out.println("Error: " + e.getMessage());
            }
            }
            }
  
