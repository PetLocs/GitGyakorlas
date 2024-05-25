package gitgyakorlas;

public class GitGyakorlas {

    public static int[] tomb = new int[] {4, 2, -2, 10, 7};
    public static int min = -5;
    public static int max = 10;
    
    public static void main(String[] args) {    
        kimenet("A tömb elemei: [ ", "Összege: ", osszegzes());
        randomTomb();
        kimenet("A tömb elemei: [ ", "4-nél kisebb számok: ", kisebbMint(4));
        minKivalaszt();
    }

    private static int osszegzes() {
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            sum += tomb[i];
        }
        return sum;
    }

    private static void kimenet(String szoveg1, String szoveg2,int szam) {
        System.out.print(szoveg1);
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("]\n"+ szoveg2 + szam);
    }

    private static int kisebbMint(int szam) {
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < szam) {
                sum++;
            }
        }
        return sum;
    }

    private static void randomTomb() {
        tomb = new int[5];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] =(int)(Math.random()*(max-min) + min);
        }
    }

    private static void minKivalaszt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
