public class Matrix {
    int[][] m;
    int r, c;

    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        m = new int[r][c];
    }

    Matrix(int[][] data) {
        m = data;
        r = data.length;
        c = data[0].length;
    }

    Matrix transpose() {
        Matrix t = new Matrix(c, r);
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t.m[j][i] = m[i][j];
        return t;
    }

    Matrix multiply(Matrix b) {
        Matrix res = new Matrix(r, b.c);
        for (int i = 0; i < r; i++)
            for (int j = 0; j < b.c; j++)
                for (int k = 0; k < c; k++)
                    res.m[i][j] += m[i][k] * b.m[k][j];
        return res;
    }

    void print() {
        for (int[] row : m) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix a = new Matrix(new int[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix b = new Matrix(new int[][]{{7, 8}, {9, 10}, {11, 12}});
        System.out.println("A:");
        a.print();
        System.out.println("Transpose of A:");
        a.transpose().print();
        System.out.println("A x B:");
        a.multiply(b).print();
    }
}
