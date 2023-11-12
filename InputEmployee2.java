//問題8
package app08.com.test;

import java.util.Scanner;

public class InputEmployee2 {
    public static Employee getInput() {
        Scanner scanner = new Scanner(System.in);

        String employeeNumber;
        String lastName;
        String firstName;
        String gender;

        do {
            System.out.print("社員番号（4桁の半角整数）を入力してください: ");
            employeeNumber = scanner.nextLine();
        } while (!employeeNumber.matches("\\d{4}"));

        do {
            System.out.print("姓を入力してください: ");
            lastName = scanner.nextLine();
        } while (lastName.isEmpty());

        do {
            System.out.print("名を入力してください: ");
            firstName = scanner.nextLine();
        } while (firstName.isEmpty());

        do {
            System.out.print("性別を選んでください（1: 男性, 2: 女性）: ");
            gender = scanner.nextLine();
        } while (!gender.equals("1") && !gender.equals("2"));

        scanner.close();

        return new Employee(employeeNumber, lastName, firstName, gender);
    }
}