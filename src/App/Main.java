package App;

//import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] nums = new int[4][4];
        nums[0][0] = 70;
        nums[0][1] = 35;
        nums[0][2] = 84;
        nums[0][3] = 39;

        nums[1][0] = 17;
        nums[1][1] = 21;
        nums[1][2] = 5;
        nums[1][3] = 64;

        nums[2][0] = 93;
        nums[2][1] = 51;
        nums[2][2] = 7;
        nums[2][3] = 3;

        nums[3][0] = 73;
        nums[3][1] = 12;
        nums[3][2] = 99;
        nums[3][3] = 1;

        int winningnNumber = 21;

        /*String numsStr = Arrays.deepToString(nums);
        System.out.println("\nСписок чисел: " + numsStr);*/

        System.out.println("\nСписок чисел:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Введіть одне ціле число зі списку: ");
        int inputNum = scanner.nextInt();
        boolean missingNumber = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (inputNum == nums[i][j]) {
                    if (inputNum == winningnNumber)
                        System.out.printf("Вітаємо, ви виграли смаколик, виграшне число: %d", nums[i][j]);
                    else
                        System.out.println("Вам обов'язково пощастить, але не цього разу :(");

                    missingNumber = true;
                    i = 4;
                    break;
                }

            }

        }

        if (!missingNumber)
            System.out.println("Введенного Вами числа немає в списку :(");
        scanner.close();
    }
}

