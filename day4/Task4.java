package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int tmpMaxSum = Integer.MIN_VALUE, indexOf1=0, sumOf3;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        for (int i = 1; i < array.length-1; i++) {
            //sumOf3= array[i-1]+array[i]+array[i+1]; // суммировать в цикле..
            sumOf3 = 0;
            for (int j = i-1; j <=i+1 ; j++) { //суммируем в цикле диапазона 3х индексов
                sumOf3+=array[j];
            }
            //System.out.println(array[i-1]+" " +array[i]+" " +array[i+1]+" Сумма " + sumOf3 + " индекс " + (i-1));
            if (sumOf3>tmpMaxSum){
                tmpMaxSum=sumOf3;
                indexOf1=i-1;
            }
        }
        System.out.println(tmpMaxSum);
        System.out.println(indexOf1);
    }
}
