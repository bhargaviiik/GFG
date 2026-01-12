class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> list= new ArrayList<>();
        
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i)list.add(n/i);
            }
        }
        
        while(list.size()!=0){
            System.out.print(list.remove(list.size()-1)+" ");
        }
    }
}
