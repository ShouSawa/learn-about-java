import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalDate n = new CalDate(2020, 2, 11);
        TimeAccount m=new TimeAccount("you","1011",n);
 
        switch(in.nextInt()) {
        case 1:
            System.out.println(m.toString());
            break;
            
        case 2:
            m.deposit(100);
            System.out.println(m.toString());
            m.moveToTime(50);
            System.out.println(m.toString());
            m.withdraw(20);
            System.out.println(m.toString());
            m.moveToTime(50);
            System.out.println(m.toString());
            break;
            
        case 3:
            m.deposit(100);
            System.out.println(m.toString());
            m.moveToTime(50);
            System.out.println(m.toString());
            CalDate oneday=new CalDate(2020, 2, 12);
            m.moveToNormal(oneday);
            System.out.println(m.toString());
            break;
            
        case 4:
            m.deposit(100);
            System.out.println(m.toString());
            m.moveToTime(50);
            System.out.println(m.toString());
            CalDate sameday=new CalDate(2020, 2, 11);
            m.moveToNormal(sameday);
            System.out.println(m.toString());
            break;
        case 5:
            m.deposit(100);
            System.out.println(m.toString());
            m.moveToTime(50);
            System.out.println(m.toString());
            CalDate earyday=new CalDate(2020, 2, 10);
            m.moveToNormal(earyday);
            System.out.println(m.toString());
            break;
        case 6:


            m.deposit(100);
            System.out.println(m.toString());
            m.moveToTime(50);
            System.out.println(m.toString());
            m.moveToNormal(new CalDate(2018, 5, 15));
            System.out.println(m.toString());
            break;
        case 7:
            m.deposit(100);
            System.out.println(m.toString());
            m.moveToTime(50);
            System.out.println(m.toString());
            m.moveToNormal(new CalDate(2020, 1, 15));
            System.out.println(m.toString());
            break;


        case 8:
            if(new CalDate(2020, 2, 11).isSameWith(n)){
                System.out.println("isSameWithを消さなかった民");
            }else{
                System.out.println("多分この文章が出る前にコンパイルエラーが出るんじゃないかな...");
            }
            break;


        }
        
        in.close();
 
    }
}