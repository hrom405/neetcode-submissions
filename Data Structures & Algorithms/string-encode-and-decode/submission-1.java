class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s);
            str.append(":;");
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if(str.length() == 0) return result;
        String[] st = str.split(":;", -1);
        System.out.println(str + " " + st.length);
        for(int i=0;i<st.length-1;i++){
            result.add(st[i]);
        }
        return result;
    }
}
