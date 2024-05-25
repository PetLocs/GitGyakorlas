package gitgyakorlas;

public class GitGyakorlas {

    public static int[] tomb = new int[] {4, 2, -2, 10, 7};
    public static void main(String[] args) {    
        kimenet(osszegzes(tomb));
    }

    private static int osszegzes(int [] tomb) {
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            sum += tomb[i];
        }
        return sum;
    }

    private static void kimenet(int szam) {
        System.out.print("A tömb elemei: ");
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("\n Összege: " + szam);
    }
    
}
