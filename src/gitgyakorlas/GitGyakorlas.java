package gitgyakorlas;

public class GitGyakorlas {

    public static int[] tomb = new int[] {4, 2, -2, 10, 7};
    public static int min = -5;
    public static int max = 10;
    
    public static void main(String[] args) {    
        feladatok();
    }

    private static void feladatok() {
        kimenet("A tömb elemei: [ ", "Összege: ", osszegzes());
        randomTomb();
        kimenet("A tömb elemei: [ ", "4-nél kisebb számok: ", kisebbMint(4));
        randomTomb();
        kimenet("A tömb elemei: [ ", "legkisebb szám: ", minKivalaszt());
        randomTomb();
        kimenet2("A tömb elemei: [ ", "Van-e páros szám? " + eldontes());
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
    
    private static void kimenet2(String szoveg1, String szoveg2) {
        System.out.print(szoveg1);
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("]\n"+ szoveg2);
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

    private static int minKivalaszt() {
        int min = tomb[0];
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
            }
        }
        return min;
    }

    private static String eldontes() {
        int oszto = 2;
        int i = 0;
        String valasz = "";
        while (i<5 && tomb[i]%oszto != 0) {
            i++;
        }
        if (i<5) {
            valasz = "Van páros szám.";
        }else{
            valasz = "Nincs páros szám.";            
        }
        return valasz;        
    }
    
}
