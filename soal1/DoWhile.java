package soal1;

public class DoWhile {
    public static void main(String[] args) {
        int[] array = {5, 6, 7};
        int total = 0;
        int count = 0;

        if (array.length > 0) {
            do {
                total += array[count];
                count++;
            }while (count < array.length);
        }

        System.out.println("Jumlah elemen adalah : " + total);
    }
}
