import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner tangentbord = new Scanner(System.in)){
        int tal1=2;
        int tal2=2;
        int tal3=5;
        //int tal1=0;

        System.out.println("Del A-B");
        while(tal1<5){
            System.out.println(tal1);
            tal1++;
        }
        System.out.println("_ _ _ _ c) _ _ _ _ ");
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("_ _ _ _ d) _ _ _ _ ");
        do {
            System.out.println(tal2);
            tal2++;
        } while(tal2<6);
        System.out.println("_ _ _ _ e) _ _ _ _ ");
        while(tal3>=0){
            System.out.println(tal3);
            tal3--;
        }
        System.out.println("_ _ _ _ f) _ _ _ _ ");
        for(int j = 5; j >= 0; j--){
            System.out.println(j);
        }
        System.out.println("_ _ _ _ g) _ _ _ _ ");
        int tal_1 = tangentbord.nextInt();
        int tal_2 = tangentbord.nextInt();
        int tal_3 = tangentbord.nextInt();
        int tal_4 = tangentbord.nextInt();
        int tal_5 = tangentbord.nextInt();
        int talen[]={tal_1, tal_2, tal_3, tal_4, tal_5};
        for(int i=4; i <= talen.length; i--){
            System.out.println(talen[i]);
        }
        }
    }
}