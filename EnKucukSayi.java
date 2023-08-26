import java.util.Scanner;
public class EnKucukSayi {
    public static void main(String[] args) {
        int k,j;
        int number = 0, min = 0,maks=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            k = input.nextInt();
            if (k==min){
                min=k;
                maks=k;
               // System.out.println(min);
            }else if( k < min){
                min=k;
                if(min < maks){
                    min=k;
                }else{
                    maks=k;
                }


            }else if (k > min){
                j=k;
                if(maks < j){
                    maks=k;
                }
            }

        }
        System.out.println("En küçük sayı: "+min);
        System.out.println("En büyük Sayı: "+maks);
    }
}
