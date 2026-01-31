class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char currentcharacter=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==currentcharacter){
                count++;
                i++;
            }
            chars[index++]=currentcharacter;
            if(count>1){
                String string=String.valueOf(count);
                for(char c:string.toCharArray()){
                    chars[index++]=c;
                }
            }
        }
        return index;
    }
}