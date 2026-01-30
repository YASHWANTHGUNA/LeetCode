class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String newStr = new String(arr); 
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        String newStr2 = new String(arr2);

        if(newStr.equals(newStr2)){
            return true;
        } 
        return false; 
        
        
    }
}