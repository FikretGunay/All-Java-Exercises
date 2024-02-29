package KendiCalismalarim;
//recursion to add all numbers up to 10
public class w3Recursion {
    public static int sum (int k){
        if(k>0){
            return k+sum(k-1);
        } else{
            return 0;
        }
    }

    //use recursion to add all of the numbers between 10 and 20

    public static int summ(int start, int end){
        if(end>start){
            return end+summ(start,end-1);
        }else{
            return end;
        }
    }
    public static void main(String[] args) {
        int res=summ(10,20);
        System.out.println(res);
        int result=sum(10);
        System.out.println(result);

    }
}
