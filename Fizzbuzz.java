/*Give a number N, iterate i=1 to N,
     print  "FizzBuzz" if i is a multiple of both 3 and 5.
     print  "Fizz" if i is a multiple of 3 only.
     print  "Buzz" if i is a multiple of 5 only.
Otherwise,print the value of i.
*/
import java.util.Scanner;
class Fizzbuzz{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
int N= sc.nextInt();
for(int i=1;i<=N;i++){
if(i%3==0 && i%5 ==0)
       System.out.println("Fizzbuzz");
else if (i%5==0)
      System.out.println("Buzz");
else if(i%3==0)
System.out.println("Fizz");
else
System.out.println(i);
}
}
}