package Assignment6_2;
import java.io.*;
class Assignment6_2 implements Runnable// Interface Runnable implemented
{   @Override
    public void run() 
    {
try{   //Take every possible checks which is natual number or not
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int no;
System.out.println("Please Enter the Number:-");
no=Integer.parseInt(br.readLine());
if(no<0)
{System.out.println("Numbers not to be negetive.");}
else if(no==0)
{System.out.println("Numbers not to be Zero.");}
else if(no==1)
{System.out.println(no+" is neither prime nor composite.");}
else
{
                    int cnt=0;
            for(int i=2;i<=no/2;i++)
                if(no%i==0)
                {
                    cnt++;
                    break;
                }
            if(cnt==0)
                 {
                System.out.println(no+" Number is prime.");
                  }
             else{System.out.println(no+" Number is Composite.");}

}
        
    }
catch(Exception e){System.out.println("Wrong Entry..."+"\n"+"try again");}
}
}


class PrimeOrComposite
{
    public static void main(String args[])
    {
        try
        {
            Assignment6_2 p1=new Assignment6_2();
            Thread t1=new Thread(p1);//create Thread
            t1.start();//Start Thread
        }
        catch(Exception e1){}
    }
}
