import java.util.Scanner;
class Studentdetails
{
String name;
int age;
int rollno;
 
 Scanner kb=new Scanner(System.in);
 void input()
 {
 System.out.println("enter the name of student");
 name= kb.nextLine();
 System.out.println("enter the age of student");
 age=kb.nextInt();
 System.out.println("enter the rollno of the student");
 rollno=kb.nextInt();
 }
 void display()
 {
 System.out.println("Name:"  +name);
  System.out.println("Age:"  +age);
   System.out.println("Roll no:"  +rollno);
   }}
   class Student extends Studentdetails
   {
   private int a,b,c;
   void Academics()
   {
   input();
    System.out.println("enter the marks of physics");
    a=kb.nextInt();
     System.out.println("enter the marks of maths "  ); 
      b=kb.nextInt();
      System.out.println("enter the marks of chemistry");
      c=kb.nextInt();
      }
      void getDisplay()
      {
      display();
       System.out.println("Physics:"  +a);
        System.out.println("Maths:"  +b);
         System.out.println("Chemistry:"  +c);
         }}
         class Single
         {
         public static void main(String args[])
         {
         Student S=new Student();
         S.Academics();
         S.getDisplay();
         }}
         
