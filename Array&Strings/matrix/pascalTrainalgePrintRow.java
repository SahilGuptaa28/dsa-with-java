// Pascal Triangle Print Row
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add(1);
        for(int i=1;i<=rowIndex;i++){
            ans = ans* (rowIndex-i+1) / i;
            list.add((int)ans);
        }
        return list;
    }
}
// using nCr
public static int nCr(int n, int r){

    long res = 1;

    for(int i = 0; i < r; i++){
        res = res * (n - i);
        res = res / (i + 1);
    }

    return (int)res;
}

public static void printNthRow(int n){

    for(int c = 0; c < n; c++){
        System.out.print(nCr(n - 1, c) + " ");
    }
}