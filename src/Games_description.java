import java.util.Scanner;
public class Games_description {
    public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      char ch;
        System.out.println("Доступные категории:");
        System.out.println("\t1.Quake");
        System.out.println("\t2.Doom");
        System.out.println("\t3.Atomic heart");
        System.out.println("\t4.The Witcher 3");
        System.out.println("\t5.Wolfenstein: the new order");
        System.out.println("\t6.Half-Life");
        System.out.println("\t7.Heroes of might and magic 3");
        
    stop:    for(;;){
                do{
                System.out.print("Выберите категорию: "); 
                ch = (char) scanner.next().charAt(0);
                if (ch == 'q') {
                    System.out.println("Выход");
                    break stop;
                }
                if(ch < '1' || ch > '7'){
                System.out.println("Неверная команда");
                }
            
            } while (ch < '1' || ch > '7');
            
             
            switch (ch){
                case '1': 
                    System.out.println("Quake круто");
                    break;
                case '2':
                    System.out.println("Doom круто");
                    break;
                case '3':
                    System.out.println("Atomic heart круто");
                    break;
                case '4':
                    System.out.println("The Witcher 3 круто");
                    break;
                case '5':
                    System.out.println("Wolfenstein: the new order круто");
                    break;
                case '6':
                    System.out.println("Hal-Life круто");
                    break;
                case '7':
                    System.out.println("Heroes of might and magic 3 круто");
                    break;
        }    
        
    }
 }
}