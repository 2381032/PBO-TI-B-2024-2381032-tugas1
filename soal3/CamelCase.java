package soal3;

public class CamelCase {
    public static void main(String[] args) {
        String kata = "udinAbdulUcokJarwo";
        int uppercount = 0;

        for (char i : kata.toCharArray()) {
            if (Character.isUpperCase(i)) {
                uppercount++;
            }
        }

        int hasil = uppercount + 1;
        System.out.println("Jumlah Kata yang digabung dalam format camelCase adalah : " + hasil);
    }
}
