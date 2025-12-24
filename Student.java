import java.util.*;

public class Student {
    
    String name;
    int rollno;
    int marks;

    public Student(String name, int rollno, int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    void display(){
        System.out.println("Name: "+name+", Roll No: "+rollno+", Marks: "+marks);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String n1=sc.nextLine();
        System.out.print("Enter the Roll No: ");
        int r1=sc.nextInt();
        System.out.print("Enter the marks: ");
        int m1=sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the name: ");
        String n2=sc.nextLine();
        System.out.print("Enter the Roll No: ");
        int r2=sc.nextInt();
        System.out.print("Enter the marks: ");
        int m2=sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the name: ");
        String n3=sc.nextLine();
        System.out.print("Enter the Roll No: ");
        int r3=sc.nextInt();
        System.out.print("Enter the marks: ");
        int m3=sc.nextInt();

        Student s1=new Student(n1, r1, m1);
        Student s2=new Student(n2, r2, m2);
        Student s3=new Student(n3, r3, m3);

        if(s1.marks>s2.marks && s1.marks>s3.marks){
            System.out.println("Highest mark is: "+s1.marks);
        }else if(s2.marks>s1.marks && s2.marks>s3.marks){
            System.out.println("Highest mark is: "+s2.marks);
        }else{
            System.out.println("Highest mark is: "+s3.marks);
        }

        System.out.println("Average: "+(s1.marks+s2.marks+s3.marks)/3.0);

        System.out.println("Student details: ");
        s1.display();
        s2.display();
        s3.display();
        sc.close();
    }
}
