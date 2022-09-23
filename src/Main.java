import java.util.Scanner;

public class Main {
    static int sum (int a, int b){
        int result = a + b;
        System.out.println("Toplam = " + result);
        return result;
    }
    static int subtraction (int a, int b){
        int result = a - b;
        System.out.println("Çıkarma Sonucu = " + result);
        return result;
    }
    static int multiplication(int a, int b){
        int result = a * b;
        System.out.println("Çarpma Sonucu = " + result);
        return result;
    }
    static int division (int a, int b){
        int result = a / b;
        System.out.println("Bölme Sonucu = " + result);
        return result;
    }
    static int pow(int a, int sub){
        int result = 1;
        for (int i=1; i<=sub; i++){
            result *= a;
        }
        System.out.println(a + "sayısının " + sub +"kadar üst alınmış değeri = "+ result);
        return result;

    }
    static int mod(int a, int b){
        int result = a / b;
        System.out.println("mod = " + result);
        return result;
    }
    static void rectangle(int a, int b){
        System.out.println("Alanı = " + (a * b));
        System.out.println("Çevresi = "+ (2*(a+b)));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select, sayi1, sayi2;
        String menu =   "1- Toplama \n" +
                        "2- Çıkarma \n"+
                        "3- Çarpma \n" +
                        "4- Bölme \n" +
                        "5- Üst Alma \n"+
                        "6- Mod Alma \n"+
                        "7- Dikdörtgen Alan ve Çevre Hesaplama \n"+
                        "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.print("lütfen seçim yapın = ");
            select = input.nextInt();


            if (select == 0){
                System.out.println("Güle Güle");
                break;
            }

            if (select == 5){
                System.out.print("n Sayıyı Giriniz = ");
                sayi1 = input.nextInt();
                System.out.print("üst olacak sayıyı Sayıyı Giriniz = ");
                sayi2 = input.nextInt();
            }else {
                System.out.print("İlk Sayıyı Giriniz = ");
                sayi1 = input.nextInt();
                System.out.print("İkinic Sayıyı Giriniz = ");
                sayi2 = input.nextInt();
            }
            switch (select){
                case 1 :
                    sum(sayi1,sayi2);
                    break;
                case 2 :
                    subtraction(sayi1,sayi2);
                    break;
                case 3:
                    multiplication(sayi1,sayi2);
                    break;
                case 4:
                    division(sayi1,sayi2);
                    break;
                case 5:
                    pow(sayi1,sayi2);
                    break;
                case 6:
                    mod(sayi1, sayi2);
                    break;
                case 7:
                    rectangle(sayi1,sayi2);
                    break;
                default:
                    System.out.println("Geçersiz Bir Seçim Yaptınız");


            }
        }


    }
}
