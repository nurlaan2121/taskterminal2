import java.util.Arrays;
import java.util.Scanner;
public class Main{ 
  public static void main(String [] args){
   System.out.println("Hello world");
Scanner scanner = new Scanner(System.in);
System.out.println("Write first number!");
int num1 = scanner.nextInt();
System.out.println("Write second number!");
int num2 = scanner.nextInt();
System.out.println("Choose action:    1(+),    2(-),       3(*),       4(/)     ");
int action = scanner.nextInt();
switch(action){
case 1->{
System.out.println("Result  " + num1  + num2);
}case 2->{
System.out.println("Result  " +(num1 - num2));}
case 3->{
System.out.println("Result  " + (num1 * num2));}
case 4->{
System.out.println("Result  " +(num1 / num2));}
default -> System.out.println("Choose action");}


int [] massive = {432,423,1,31,4,13,1};
int res  = 0;
int max = 0;
int min = massive[0];
for(int i = 0;i < massive.length;i++){
    res += massive[i];
    if (massive[i] > max){  max = massive[i];  }
    if (massive[i]< min){ min = massive[i];} }
System.out.println(Arrays.toString(massive));
System.out.println("Summa:  "  + res);
System.out.println("Chonu:  "  + max);
System.out.println("Kichinesi:  " +  min);
System.out.println("Write number: ");
int number = scanner.nextInt();
if (number < 0){
System.out.println(number + "   Ters");}
else System.out.println(number + "   On");
for(int i = 0;i<=10;i++){System.out.println(i);}








   }
}
