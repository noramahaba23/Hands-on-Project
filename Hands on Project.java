using System;
public class Employee
{
    private string name;
    private bool ban;
    private int age;
    private int Salary;
    private int ID;
    public static int cnt=0;
    public Employee(string name,int age,int Salary )

    {
        this.name=name;
        this.age=age;
        this.Salary=Salary;
        this.ID=cnt;
        this.ban=false;
        cnt++;
    }

    public void setname(string value)
    {
        this.name=value;
    }
    public string getname()
    {
        return this.name;
    }
    public void setage(int value)
    {
        this.age=value;
    }
    public int getage()
    {
        return this.age;
    }
    public void setSalary(int value)
    {
        this.Salary=value;
    }
    public int getSalary()
    {
        return this.age;
    }
    public void setID(int value)
    {
        this.ID=value;
    }
    public int getID()
    {
        return this.ID;
    }
     public void banTogle()
    {
        this.ban=!this.ban;
    }
    public bool getBan()
    {
        return this.ban;
    }


}
public class Department
{
    private string name;
    private int ID;
    private bool ban;
    public static int cnt2=0;



    public Department(string name)
    {
        this.name=name;
        this.ID=cnt2;
        cnt2++;
        this.ban=false;
    }
    public void setname(string value)
    {
        this.name=value;
    }
    public string getname()
    {
        return this.name;
    }
    public void setID(int value)
    {
        this.ID=value;

    }
    public int getID()
    {
        return this.ID;
    }
    public void banTogle()
    {
        this.ban=!this.ban;
    }
    public bool getBan()
    {
        return this.ban;
    }
    
}

public class HelloWorld
{
    public static void Main(string[] args)
    {
        var array=new Employee[100];
        var array2=new Department[100];


        Console.WriteLine("hello my name is nour please select your oprtion  number");
        while ( true )
        {

            Console.WriteLine("[1]- Employee");
            Console.WriteLine("[2]- Department");
            Console.WriteLine("[3]- Export ");
            Console.WriteLine("[4]- Import ");
            Console.WriteLine("[5]- Exit");
            string input =Console.ReadLine();
            if (input=="1")
            {
                Console.WriteLine("[1]- Insert ");
                Console.WriteLine("[2]- Update  ");
                Console.WriteLine("[3]-	Delete  ");
                Console.WriteLine("[4]-	Query   ");

                string input2 =Console.ReadLine();
                if (input2=="1")
                {
                    Console.WriteLine("enter Employee name ");
                    string name= Console.ReadLine();
                    Console.WriteLine("enter Employee age ");
                    string age=Console.ReadLine();
                    int age1=int.Parse(age);
                    Console.WriteLine("enter Employee Salary ");
                    string Salary=Console.ReadLine();
                    int salary1=int.Parse(Salary);
                    Employee emp=new Employee(name,age1,salary1 );
                    array[emp.getID()]=emp;


                }
                else if(input2=="2")
                {
                    Console.WriteLine("enter Employee ID");
                    string Employee_ID= Console.ReadLine();
                    int Employee_ID1=int.Parse(Employee_ID);
                    Console.WriteLine("enter Employee new name ");
                    string new_name= Console.ReadLine();
                    Console.WriteLine("enter Employee new age");
                    string new_age=Console.ReadLine();
                    int new_age1=int.Parse(new_age);
                    Console.WriteLine("enter Employee new Salary ");
                    string new_Salary=Console.ReadLine();
                    int new_Salary1=int.Parse(new_Salary);

                    array[Employee_ID1].setname(new_name);
                    array[Employee_ID1].setage(new_age1);
                    array[Employee_ID1].setSalary(new_Salary1);
                }

                else if(input2=="3")
                {
                    Console.WriteLine("enter Employee ID");
                    string Employee_ID= Console.ReadLine();
                    int Employee_ID1=int.Parse(Employee_ID);
                    array[Employee_ID1].banTogle();
                }
                else if(input2=="4")
                {
                    Console.WriteLine("enter Employee ID");
                    string Employee_ID= Console.ReadLine();
                    int Employee_ID1=int.Parse(Employee_ID);
                    if(array[Employee_ID1].getBan()==true)
                    {
                         Console.WriteLine("this user banned");
                    }
                    else
                    {
                        Console.WriteLine(array[Employee_ID1].getname());
                    Console.WriteLine(array[Employee_ID1].getage());
                    Console.WriteLine(array[Employee_ID1].getSalary());
                    }
                    


                }



            }
            else if(input=="2")
            {
                Console.WriteLine("[1]- Insert ");
                Console.WriteLine("[2]- Update  ");
                Console.WriteLine("[3]-	Delete  ");
                Console.WriteLine("[4]-	Query   ");
                string input3 =Console.ReadLine();
                if (input3=="1")
                {
                    Console.WriteLine("enter Department name ");
                    string name= Console.ReadLine();
                    Department dep=new Department(name);
                    array2[dep.getID()]=dep;
                    Console.WriteLine(dep.getID());
                }
                else if(input3=="2")
                {
                    Console.WriteLine("enter Department ID");
                    string Department_ID= Console.ReadLine();
                    int Department_ID1=int.Parse(Department_ID);
                    Console.WriteLine("enter Department new name ");
                    string new_name= Console.ReadLine();
                    array2[Department_ID1].setname(new_name);
                }
                else if (input3=="3")
                {
                    Console.WriteLine("enter Department ID");
                    string Department_ID= Console.ReadLine();
                    int Department_ID1=int.Parse(Department_ID);
                    array2[Department_ID1].banTogle();
                }
                else if(input3=="4")
                {
                    Console.WriteLine("enter Department ID");
                    string Department_ID= Console.ReadLine();
                    int Department_ID1=int.Parse(Department_ID);
                    if (array2 [Department_ID1].getBan()==true)
                    {
                        Console.WriteLine("Department ban ");
                    }
                    else
                    {
                      Console.WriteLine(array2[Department_ID1].getname());
                      
                    }
                   
                    

                }
            }

            else if(input=="3")
            {

            }
            else if(input=="4")
            {

            }
            else if(input=="5")
            {
                Console.WriteLine("program end");
                break;
            }

        }
    }

}
