public class App {
    public static void main(String[] args) throws Exception {
        int tal1=2;
        int tal2=2;
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
    }
}