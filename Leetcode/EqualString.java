class EqualString{
    public boolean areAlmostEqual(String s1, String s2) {
        int a=-1,b=-1;
        int c=0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(a==-1) a=i;
                else if(b==-1) b=i;
            }
        }
        if(c==0) return true;
        else if(c==2 && s1.charAt(a)==s2.charAt(b) && s1.charAt(b)==s2.charAt(a)){
            return true;
        }
        return false;
    }
}