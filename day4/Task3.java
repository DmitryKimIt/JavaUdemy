package day4;

public class Task3 {
    public static void main(String[] args) {
    int m =12, n=8, indexMax=0, sumValueLine, sumMaxLine=Integer.MIN_VALUE;

    int[][] array = new int[m][n];
        for (int i = 0; i < array.length ; i++) {
            sumValueLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*50);
//                System.out.print(array[i][j] + " ");
                sumValueLine +=array[i][j];
            }
//            System.out.printf(" сумма " + sumValueLine);
//            System.out.println("");
            if (sumValueLine>sumMaxLine) {
                sumMaxLine = sumValueLine;
                indexMax = i;}
        }
        System.out.printf("Ответ: %d (индекс строки, сумма чисел в которой максимальна)",indexMax);
    }
}
