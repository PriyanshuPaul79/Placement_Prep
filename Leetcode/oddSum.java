public class odd {
        public int numOfSubarrays(int[] arr) {
            long cnt =0, sum =0;
            for(int i : arr){
                sum+=i;
                cnt += sum%2;
            }
            cnt += (arr.length-cnt)*cnt;
            return (int)(cnt%1_000_000_007);
        }
    }
