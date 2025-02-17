public class leetcode {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        return result(0,arr);
    }
    public int result(int start, char[] arr){
        if(start==arr.length) return 0;
        int ans =0;
        for(int i=start;i<arr.length;i++){
            if(!ans(start,i-1,arr[i],arr)){
                swap(start,i,arr);
                ans+= 1+result(start+1,arr);
                swap(start,i,arr);
            }
        }
        return ans;
    }
    public boolean ans(int i , int j , char ch, char[] arr){
        while(i<=j)
        if(arr[i++]==ch) return true;
        return false;
    }
    public void swap(int i, int j, char[] arr){
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
