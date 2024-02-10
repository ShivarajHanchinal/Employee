import java.util.Scanner;
class employee extends Branch
{
    public static void main(String arg[])
    {
        Scanner n=new Scanner(System.in);
        String name;
        String date;
        int id;
        Branch d=new Branch();
        System.out.println("Enter Employee name :");
        name=n.nextLine();
        System.out.println("Enter date of joining of Employee :");
        date=n.next();
        System.out.println("Enter Department id :");
        id =n.nextInt();
        System.out.println("\nnEmployee dtails");
        System.out.println("Name :"+name);
        System.out.println("Joining Date :"+date);
        System.out.println("Department Name :");
        d.department(id);
    }
}