package gitgyakorlas;

public class GitGyakorlas {

    public static void main(String[] args) {
        int[] tomb = new int[] {4, 2, -2, 10, 7};
        
        osszegzes(tomb);
    }

    private static int osszegzes(int [] tomb) {
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            sum += tomb[i];
        }
        return sum;
    }
    
}
