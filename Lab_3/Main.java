import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            
            System.out.print("Введите текст: ");
            String text = scanner.nextLine();

            
            System.out.print("Номер буквы для замены (k): ");
            int k = scanner.nextInt();
            scanner.nextLine(); // РћС‡РёСЃС‚РєР° Р±СѓС„РµСЂР°

           
            System.out.print("Символ для замены: ");
            char replacement = scanner.nextLine().charAt(0);

            
            String[] words = text.split(" ");

            
            for (int i = 0; i < words.length; i++) {
                if (k <= words[i].length()) {
                    
                    String newWord = words[i].substring(0, k - 1) + replacement + words[i].substring(k);
                    words[i] = newWord;
                }
            }

           
            String modifiedText = String.join(" ", words);

            
            System.out.println("Измененный текст: " + modifiedText);
        }
    }
