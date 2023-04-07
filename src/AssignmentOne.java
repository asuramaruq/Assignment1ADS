public class AssignmentOne {
    private AssignmentOne(){}
    public static void getMinimum(int n, int[] arr){
        getMin(n,arr,1,arr[0]);
    }
    private static void getMin(int n, int[] arr, int i, int min){
        if(i==n){
            System.out.println(min);
            return;
        }
        if(min>arr[i]){
            min=arr[i];
        }
        getMin(n,arr,i+1,min);
    }
    public static void getAverage(int n, int[] arr){
        getAvg(n,arr,0,0);
    }
    private static void getAvg(int n, int[] arr, int i, double sum){
        if(i==n){
            System.out.println(sum/n);
            return;
        }
        sum+=arr[i];
        getAvg(n,arr,i+1,sum);
    }
    public static void checkPrime(int n){
        if(checkPr(n,2)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
    private static Boolean checkPr(int n, int i){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return checkPr(n,i+1);
    }
    public static int getFactorial(int n){
        return getFct(n,1,1);
    }
    private static int getFct(int n, int i, int res){
        if(i==n+1){
            return res;
        }
        res*=i;
        return getFct(n,i+1,res);
    }
    public static int getFibonacci(int n){
        if(n<2){
            return n;
        }
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
    public static int getPower(int a, int n){
        return getPow(a,n,0,1);
    }
    private static int getPow(int a, int n, int i,int res){
        if(i==n){
            return res;
        }
        res*=a;
        return getPow(a,n,i+1,res);
    }
    public static void getPermutations(String m){
        int n=m.length();
        char[] ch=m.toCharArray();
        getPerm(ch,n,0);
    }
    private static void getPerm(char[] ch, int n, int i){
        char temp;
        if(i==n){
            System.out.println(new String(ch));
            return;
        }
        for(int k=i;k<n;k++){
            temp=ch[i];
            ch[i]=ch[k];
            ch[k]=temp;
            getPerm(ch,n,i+1);
            temp=ch[i];
            ch[i]=ch[k];
            ch[k]=temp;
        }
    }
    public static void isDigit(String s){
        int n=s.length();
        char[] ch=s.toCharArray();
        if(isDigits(ch,n,0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    private static Boolean isDigits(char[] ch, int n, int i){
        if(i==n){
            return true;
        }
        if(ch[i]>=48&&ch[i]<=57){
            return isDigits(ch,n,i+1);
        }
        else{
            return false;
        }
    }
    public static int getBinomialCoefficient(int k, int n) {
        if(k==0||k==n){
            return 1;
        }
        if(k>n){
            return 0;
        }
        return getBinomialCoefficient(k-1,n-1)+getBinomialCoefficient(k,n-1);
    }
    public static int getGCD(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return getGCD(a%b,b);
        }
        if(b>a){
            return getGCD(a,b%a);
        }
        return 0;
    }
}
