package exercises;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newId;
        System.out.println("Enter the Student ID (or ENTER to finish)");

        do {
            System.out.print("ID");
             newId = input.nextInt();

            if (!newId.equals("")) {
                System.out.print("Name");
                String newName = input.nextLine();
                students.put(newId, newName);
                input.nextLine();
            }

        }
        while (!newId.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student :
                students.entrySet()) {
            System.out.println(student.getKey() +
                    "(" + student.getValue() + ")");
        }

    }
}
