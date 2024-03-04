

public class Main {
    public static void main(String[] args) {
        int [] list = {10,20,20,10,10,20,5,20};
        int n = list.length;
        boolean [] isFrekans = new boolean[n];

        for (int i = 0; i < n; i++){
            if (isFrekans [i])
                continue;

            int frekans = 0;
            for (int j = i+1; j < n; j++){
                if (list[i] == list[j]){
                    frekans++;
                    isFrekans[j] = true;
                }
            }
            System.out.println(list[i] + " Sayısı " + frekans + " kere tekrar etti.");
        }

    }
}