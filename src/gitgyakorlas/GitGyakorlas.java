package gitgyakorlas;

public class GitGyakorlas {

    public static int[] tomb = new int[] {4, 2, -2, 10, 7};
    public static void main(String[] args) {    
        kimenet("A tömb elemei: ", "Összege", osszegzes(tomb));
        megszamlalas();
    }

    private static int osszegzes(int [] tomb) {
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
        System.out.println("\n"+ szoveg2 + szam);
    }

    private static void megszamlalas() {
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < 4) {
                sum++;
            }
        }
    }
    
}
