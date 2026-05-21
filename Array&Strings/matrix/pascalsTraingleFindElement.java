public int nCr(int n, int r){

    long res = 1;

    for(int i = 0; i < r; i++){
        res = res * (n - i);
        res = res / (i + 1);
    }

    return (int)res;
}

public int findElement(int row, int col){

    return nCr(row - 1, col - 1);
}