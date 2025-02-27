package Arrays;

public class LetterBWithStars {
    public static void main(String[] args) {

        String[][] letter = new String[7][4];

        for (int i=0;i<letter.length;i++){
            for (int j=0;j<letter[i].length;j++){
                if (j==0){
                    letter[i][j]=" * ";
                }else {
                    letter[i][j]="   ";
                }
                letter[0][1]=" * ";
                letter[0][2]=" * ";
                letter[1][3]=" * ";
                letter[2][3]=" * ";
                letter[3][1]=" * ";
                letter[3][2]=" * ";
                letter[4][3]=" * ";
                letter[5][3]=" * ";
                letter[6][1]=" * ";
                letter[6][2]=" * ";
            }
        }
        for (String[] row:letter){
            for (String col:row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
