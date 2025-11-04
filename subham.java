class solution{
    public int countCandies(int[] marks){
      int[] candies = new int[marks.length];
      int totalCandies=0;
      for(int i=0;i<marks.length;i++){
        candies[i]=1;
      }
      for(int i=1;i<marks.length;i++){
       if(marks[i]>marks[i-1]){
        candies[i]++;
      }else if(marks[i]<marks[i-1]){
        candies[i-1]++;
      }
    }
    for(int i=0;i<candies.length;i++){
        totalCandies+=candies[i];
    }

        return totalCandies;
    }
}


public class subham {
    public static void main(String[] args) {
        int[] arr={7,10,9,10};
        solution s=new solution();
        int res=s.countCandies(arr);
        System.out.println(res);
    }
}
