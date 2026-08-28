package Day_7;

import java.util.Scanner;

public class CountPostiveNegativeandZero {
    public static void main(String[] args)

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter size: ");
                int n = sc.nextInt();

                int[] arr = new int[n];

                System.out.println("Enter elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                int positive = 0;
                int negative = 0;
                int zero = 0;

                for (int i = 0; i < n; i++) {

                    if (arr[i] > 0) {
                        positive++;
                    }
                    else if (arr[i] < 0) {
                        negative++;
                    }
                    else {
                        zero++;
                    }
                }

                System.out.println("Positive = " + positive);
                System.out.println("Negative = " + negative);
                System.out.println("Zero = " + zero);
            }
        }
    }
}
