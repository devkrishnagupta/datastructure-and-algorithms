package backtracking;

public class NQueensONChessBoard {
    static int count;
    public static void main(String[] args) {
        int N=6;
        int[][] mat=new int[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                mat[i][j]=0;
            }
        }
        NQueens(mat, 0, N);
        System.out.println("Total possibles: "+count);
    }

    private static void NQueens(int[][] mat, int row, int N) {
        if (row==N){//printing matrix
            for (int i=0; i<N; i++){
                for (int j=0; j<N; j++){
                    if (mat[i][j] == 1)
                        System.out.print("Q ");
                    else
                        System.out.print("_ ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            count++;
            return;
        }
        //backtracking
        for (int c=0; c<N; c++){//for each column for a given rwo
            if(isValid(mat, row, c, N)){//if it is valid
                mat[row][c]=1;
                NQueens(mat, row+1, N);
                mat[row][c]=0;
            }
        }
    }

    private static boolean isValid(int[][] mat, int i, int j, int N) {
        //No need to check row
        int x=i,y=j;
        while(x>=0){
            int kk=0;
            if(mat[x][y]==1){
                return false;
            }
            x--;
        }
        x=i;
        y=j;
        //check left diagonal in V shape
        while ((x>=0) && (y>=0)){
            if (mat[x][y]==1)
                return false;
            x--;
            y--;
        }
        //check right diagonal in v shape
        x=i;
        y=j;
        while ((x>=0) && (y<N)){
            if (mat[x][y]==1)
                return false;
            x--;
            y++;
        }
        //no need to check downward of v shape because we haven't reached yet until
        return true;
    }
}
