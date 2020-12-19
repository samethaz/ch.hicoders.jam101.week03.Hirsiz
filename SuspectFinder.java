import java.util.Scanner;
public class SuspectFinder
{
    public static void main(String[] args)
    {
        Start();
    }

    private static void Start()
    {   int Status=4;
        int Skore=100;
        System.out.println("Sucluyu bulmak için "+Status+" hakınız var....");
        System.out.println("Sizce hangi numaralı vagonda 1-10");
        Scanner s =new Scanner(System.in);

        for (int i=1;i<5;i++)
        {
            int guest=s.nextInt();
            if (guest==Suspect.SuspectNo)
            {
                System.out.println(i+" hakkınızda buldunuz,"+ Skore +" puan aldınız tebrikler ");
                i=6;
                Status=10;
            }
            else if (guest<=Suspect.SuspectNo)
            {
                Status--;
                System.out.println("Daha Büyük Numaralı Vagonda "+Status+" hakınız var....");
                Skore-=25;

            }
            else if (guest>=Suspect.SuspectNo)
            {
                Status--;
                System.out.println("Daha Kücük Numaralı Vagonda "+Status+" hakınız var....");
                Skore-=25;

            }

        }
       if (Status==0) System.out.println("Üzgünüm Tüm Haklarınız Tükendi....Şüpheli"+Suspect.SuspectNo+" Vagonda saklanıyordu");
    }

}
