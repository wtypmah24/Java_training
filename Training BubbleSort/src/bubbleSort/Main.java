package bubbleSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ввести кол-во чисел ряда
        Scanner scanner = new Scanner(System.in);
        int qty;

        System.out.print("Write a positive integer - length of the arr: ");

        do{
            qty = scanner.nextInt();
        }
        while (qty < 0);

        int [] arr = new int[qty];


        //Ввести все числа из ряда
        for (int i = 0; i < qty; i++){
            arr[i] = scanner.nextInt();
        }

        //Провести цикл сравнивая два соседних числа
        //если "и" больше чем "и + 1" - менять их местами

        for (int i = 0; i < qty - 1; i++){
            for (int j = 0; j < qty - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < qty; i++){
            System.out.println(arr[i]);
        }

    }
}
