//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);
        System.out.println(array[2] + ", " + array[1] + ", " + array[0]);


        double[] arrayDouble = {1.57, 7.654, 9.986};
        System.out.println(arrayDouble[0] + ", " + arrayDouble[1] + ", " + arrayDouble[2]);
        System.out.println(arrayDouble[2] + ", " + arrayDouble[1] + ", " + arrayDouble[0]);


        int[] weight = {1, 2, 3, 4};
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2] + ", " + weight[3]);
        System.out.println(weight[3] + ", " + weight[2] + ", " + weight[1] + ", " + weight[0]);


        //4 задание

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                array1[i]++;
            }
        }
        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);


    }
}