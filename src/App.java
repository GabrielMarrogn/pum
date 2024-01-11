import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a*4;

        for(int i = 1;i <=a; i++){
            if((i%4 != 0)){
                System.out.print(i +" ");
            }else if(i%4 == 0){
                System.out.println("PUM");
            }

        }
        sc.close();
    }
}
