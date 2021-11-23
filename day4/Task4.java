package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int tmpMaxSum = Integer.MIN_VALUE, indexOf1=0, sumOf3;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        for (int i = 1; i < array.length-1; i++) {
            sumOf3= array[i-1]+array[i]+array[i+1];
            System.out.println(array[i-1]+" " +array[i]+" " +array[i+1]+" Сумма " + sumOf3 + " индекс " + (i));
            if (sumOf3>tmpMaxSum){
                tmpMaxSum=sumOf3;
                indexOf1=i-1;
            }
        }
        System.out.println(tmpMaxSum);
        System.out.println(indexOf1);
    }
}
