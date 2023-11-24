import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력해세요. >>");
        String username = sc.nextLine();

        System.out.print("생년월일을 입력해세요. >>");
        int birthDate = sc.nextInt();

        System.out.printf("%s\n%d",username,birthDate); //\n 줄바꿈 \t tap 간격만큼 띄움
    }
}
