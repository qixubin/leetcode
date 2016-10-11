import java.util.HashMap;

/**
 * Created by qixubin on 2016/6/12.
 */
public class Test4 {

    static long[] cache = new long[1000];

    public long getFib_iter(int n){
        long[] init= new long[1000];
        init[0] =1;
        init[1] =1;

        if(n <2){
            return init[n];
        }

        for (int i =2; i <=n; i++){
            init[i] = init[i-1] + init[i-2];
        }

        return init[n];
    }

    public long getFib_Rec(int n){
        if (n ==0 || n==1)
            return 1;

        if (cache[n] >0){

        }else{
            cache[n] = getFib_Rec(n-1)+getFib_Rec(n-2);
        }

        return cache[n];
    }

    public static void main(String[] argc){
//        String a = "a";
//        String b = "b";
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//
//        HashMap hm = new HashMap();
//        hm.put(null, 1);
//        hm.put(null, "abc");
//
//        System.out.println(hm.get(null));

        Test4 t = new Test4();
        System.out.println(t.getFib_iter(100));

        System.out.println(t.getFib_Rec(100));

    }
}
