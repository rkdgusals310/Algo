class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        List<String> listSort=new ArrayList<>();

        //정렬된 문자열 리스트 만들기
        for(int i=0;i<strs.length;i++){
            String str[]=strs[i].split("");
            Arrays.sort(str);
            String temp="";
            for(int j=0;j<str.length;j++){
                temp+=str[j];
            }
            if(!listSort.contains(temp))listSort.add(temp);
        }
        for(int i=0;i<listSort.size();i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<strs.length;i++){
            String str[]=strs[i].split("");
            Arrays.sort(str);
            String temp="";
            for(int j=0;j<str.length;j++){
                temp+=str[j];
            }

            list.get(listSort.indexOf(temp)).add(strs[i]);
        }

        return list;

    }
}