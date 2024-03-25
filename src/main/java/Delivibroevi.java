import java.util.Scanner;

public class Delivibroevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kolku broevi da delam : ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Vnesi broj:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Broevi delivi so 5:");
        for (int i = 0; i < n; i++) {
            int result = numbers[i] / 5;
            System.out.println(numbers[i] + " deliv so 5  " + result);
        }
        
        scanner.close();
    }
}
