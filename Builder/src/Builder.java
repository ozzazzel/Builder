import java.util.Scanner;

public class Builder {

public static void main(String[] args)

{

Scanner scan =new Scanner(System.in);

System.out.println("Enter String");

String stringInput=scan.nextLine();

StringBuilder input1=new StringBuilder(stringInput);

StringBuilder input=new StringBuilder(stringInput);

input.append(" I love it !");

System.out.println("Enter another String");

String input2=scan.nextLine();

input.insert(input1.length()+1, input2);

System.out.println(input.toString());

}

}