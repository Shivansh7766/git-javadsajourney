import java.util.*;

public class lectureonetoonehundredtwo {
        public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String args[]) {
        /*
         * //3 print z
         * System.out.println("*****");
         * System.out.println("   *");
         * System.out.println("  *");
         * System.out.println(" *");
         * System.out.println("*****");
         * //7 grading system
         * int m = 67;
         * if (m>90)
         * System.out.println(m+ "exellent"+m+"w" + m);
         * else if (m>80)
         * System.out.println("good");
         * else if (m>70)
         * System.out.println("fair");
         * else if (m>60)
         * System.out.println("meets expectations");
         * else
         * System.out.println("gg");
         * System.out.println("ggz");
         * 
         * //11 is it prime
         * Scanner sc= new Scanner(System.in);
         * int t = sc.nextInt();
         * for {int a=0;a<t;a++}{
         * int n = sc.nextInt();
         * int COUNT = 0;
         * if (n<=1)
         * System.out.println("NOT PRIME");
         * for (int i = 2 ; i*i<=n;i++){
         * if (n% i==0)
         * COUNT++;
         * break;
         * }
         * if (COUNT==0)
         * System.out.println(" primeee");
         * else
         * System.out.println("no prime");
         * }
         * 
         * //13 print all prime till N
         * Scanner sc= new Scanner(System.in);
         * int n1 = sc.nextInt();
         * int n2 = sc.nextInt();
         * for(int n=n1; n<=n2;n++){
         * int count = 0;
         * for (int i = 2 ; i*i<=n;i++){
         * if (n% i==0)
         * count++;
         * break;
         * }
         * if (count==0)
         * System.out.println(n);
         * 
         * 
         * }
         * 
         * //15 fibonacci numbers till N
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int a,b,c;
         * a=0;
         * b=1;
         * for (int i=1;i<=n;i++){
         * c=a+b;
         * System.out.println(a);
         * a=b;
         * b=c;
         * }
         * 
         * //16 count digits in a number
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int count = 0;
         * //you could take while(n>0) and do a special case later on with if n==0
         * while(true){
         * n=n/10;
         * count++;
         * if (n==0)
         * break;
         * }
         * System.out.println(count);
         * //20
         * //nvm this became ans of reverse a number that is right to left print
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int count = 0;
         * int a = n;
         * while(true){
         * n=n/10;
         * count++;
         * if (n==0)
         * break;
         * }
         * for(int i=0;i<count;i++){
         * //u can put this code inside the above code above n=n/10. just make int
         * b=n%10
         * int b = a%10;
         * System.out.println(b);
         * a=a/10;
         * }
         * 
         * //18
         * //PRINTING LEFT TO RIGHT
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int count = 1;
         * int a=n;
         * while(n>=10){
         * n=n/10;
         * count++;
         * }
         * int div = (int)Math.pow(10,count-1);
         * while (div!=0){
         * int b=a/div;
         * System.out.println(b);
         * a=a%div;
         * div=div/10;
         * }
         * //23 inverse of digit
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int count = 0;
         * int num = 0;
         * while(true){
         * count++;
         * int od = n%10;
         * 
         * num = num+count*(int)Math.pow(10, od-1);
         * n=n/10;
         * if (n==0)
         * break;
         * }
         * System.out.println(num);
        // practice redo
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int count = 0;
        while (true) {
            count++;
            int od = n % 10;
            num = num + count * (int) Math.pow(10, od - 1);
            n = n / 10;
            if (n == 0)
                break;
        }
            System.out.println(num);
                     
// 25 rotate a numbers
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int r = sc.nextInt();
int a=n;
int count = 0;
while(true){
    count++;
    n=n/10;
    if (n==0)
        break;

}
r=r%count;
if (r<0){
        r=r+count;
        
}
int mul =1;
int div =1;
for (int i = 1; i<=count;i++){
    if (i<=r)
        div=div*10;
    else
        mul=mul*10;
}
int b = a%div;
a=a/div;
a=a+b*mul;
System.out.println(a);
*/
/*
//27 HCF LCM
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2 = sc.nextInt();
if (n2==0){
System.out.println(n1+n2);
System.out.println(n2);
}
else {
   int div=n2;
  int divd=n1;
    while(divd%div !=0){
    int rem =divd%div;
   divd=div;
    div=rem;
    }
   int hcf = div;
   int lcm=n1*n2/hcf;
System.out.println(hcf);
System.out.println(lcm);
    }
}
}
//finalise with help of claud
/*if (n1 == 0 && n2 == 0) {
    System.out.println(0);
    System.out.println(0);
    return;
}

int a = n1, b = n2;

while (b != 0) {
    int rem = a % b;
    a = b;
    b = rem;
}

int hcf = a;
int lcm = (n1 * n2) / hcf;

System.out.println(hcf);
System.out.println(lcm); */
/*
   //29 PRIME FACTORIZATION
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   for (int div=2;div*div<=n;div++){
    while (n%div==0){
    n=n/div;
    System.out.println(div+ " ");
    }

   }
   if (n!=1)
    System.out.print(n);
}
}

//31 pythagoran triplets
//this my method
Scanner scn = new Scanner(System.in);
int a = scn.nextInt();
int b= scn.nextInt();
int c= scn.nextInt();
if ( a*a==b*b+c*c || b*b==a*a+c*c || c*c == a*a+b*b){
    System.out.println("true");
}
else {
    System.out.println("false");
}
}
}

//sir method
Scanner scn = new Scanner(System.in);
int a = scn.nextInt();
int b= scn.nextInt();
int c= scn.nextInt();
int max = a;
if (b>=a)
    max=b;
if (c>=b)
    max=c;
if (max==a){
    boolean flag = ((a*a)==(b*b+c*c));
    System.out.println(flag);
}
else if (max==b){
    boolean flag = ((b*b)==(a*a+c*c));
    System.out.println(flag);
}
else {
    boolean flag = ((c*c)==(b*b+a*a));
    System.out.println(flag);
}
    }
}
*/
/*
//33 benjamin bulbs
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
for (int i=1;i<=n;i++){
    int count = 0;
    for(int a=1;a<=i;a++){
        if (i%a==0){
            count++;
        }
    }
    if (count%2 !=0){
        System.out.println(i);
    }
}

    }
}
*/
/* 
//33 we just had to print perf squares to find benjamin bulbs lol bc ulb is on at odd no. of factors and only square no. have them
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
for (int i=1;i*i<=n;i++){
System.out.println(i*i);
}
    }
}
*/
// CHECK WHETHER A NO. IS PERF SQUARE OR NO
//pattern questions
/*
//35 pattern 1
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=0;i<n;i++){
    for (int j=0;j<=i;j++){
        System.out.print("*");

    }
    System.err.print("\n");
}
    }
}

// 37 pattern 2
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=n;i>=1;i--){
    for (int j=0;j<i;j++){
        System.out.print("*\t");
    }
    System.out.println();
}
    }
}
// 39 pattern 3
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i=0;i<n;i++){
for (int k=0;k<n-i;k++){
    System.out.print(" \t");
}
for (int j=0;j<i;j++){
    System.out.print("*\t");
}
System.out.println();
}
    }
}

// 41 pattern 4
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sp=0;
int st=n;
for (int i=0;i<n;i++){
for (int j=0;j<sp;j++){
    System.out.print(" \t");
}
for (int j=0;j<st;j++){
    System.out.print("*\t");
}
sp++;
st--;
System.out.println();
}
    }
}
*/
/* 
//43 pattern 5
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a=(n-1)/2;
int sp=a;
// or just sp=n/2
int st=1;
//int dir1=-1;
//int dir2=2;
for (int i=1;i<=n;i++){
    for (int j=0;j<sp;j++){
        System.out.print(" \t");
    }
    for (int j=0;j<st;j++){
        System.out.print("*\t");
        }
System.out.println();
if (i>=(n+1)/2){
    sp++;
    st-=2;
}
else {
    sp--;
    st+=2;
}*/
/*if (i==(n+1)/2){
    dir1=1;
    dir2=-2;
}
sp+=dir1;
st+=dir2;
*/
/*
}
}
}
*/
/* 
// 46 pattern 6
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int st=n/2+1;
int sp=1;
for (int i=1;i<=n;i++){
    for (int j=1;j<=st;j++){
        System.out.print("*\t");
    }
    for (int j=1;j<=sp;j++){
        System.out.print(" \t");
    }
    for (int j=1;j<=st;j++){
        System.out.print("*\t");
    }
    System.out.println();
if (i>=(n+1)/2){
    sp-=2;
    st++;
}
else {
    sp+=2;
    st--;
}
}
    }
}
*/
/* 
// 48 pattern 7
// without ij
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int st=1;
int sp=0;
for (int i=1;i<=n;i++){
   for (int j=1;j<=sp;j++){
        System.out.print(" \t");
    }
            System.out.println("*");
sp++;
    
}
    }
}
    */
   /* 
// 48 pattern 7 with ij..better
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i=1;i<=n;i++){
   for (int j=1;j<=n;j++){
    if (i==j){
            System.out.println("*");
            break;
    }
    else
            System.out.print(" \t");
    
}
    }
}
}
*/
// 50 pattern 8 
/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i=1;i<=n;i++){
   for (int j=1;j<=n;j++){
    if (i+j==n+1){
            System.out.println("*");
            break;
    }
    else
            System.out.print(" \t");
    
}
    }
}
}
*/
// 52 pattern 9
/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i=1;i<=n;i++){
   for (int j=1;j<=n;j++){
    if (i+j==n+1||i==j){
            System.out.print("*\t");
    }
    else
            System.out.print(" \t");
    
}
System.out.println();
    }
}
}
// 53 pattern 10
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int is=-1;
int os=n/2;
for (int i=1;i<=n;i++){
   for (int j=1;j<=os;j++){
   System.out.print(" \t");
}
if (is<=0){
    System.out.print("*\t");
}
else {
    System.out.print("*\t");
    for (int j=1;j<=is;j++){
        System.out.print(" \t");
    }
    System.out.print("*\t");
}

System.out.println();
if (i>=(n+1)/2){
    is-=2;
    os++;
}
else {
    is+=2;
    os--;
}
    }
}
}

// 55 pattern 11
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int a=1;
for (int i=0;i<n;i++){
   
    for (int j=0;j<=i;j++){
    System.out.print(a+"\t");
    a++;
    
    }
    System.out.println();
    
}
    }
}

// 57 pattern 12
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int a=0;
int b=1;
for (int i=0;i<n;i++){
   
    for (int j=0;j<=i;j++){
    System.out.print(a+"\t");
    int c=a+b;
    a=b;
    b=c;
    
    }
    System.out.println();
    
}
    }
}

//59 pattern 13 passcals triangle..
//theres like powers of 11 pattern or just pnc pattern
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();

for (int i=0;i<n;i++){
   int val=1;
    for (int j=0;j<=i;j++){
            System.out.print(val +"\t");
           val=(val*(i-j))/(j+1);
    }
    System.out.println();
}
    }
}

//61 pattern 14
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();

for (int i=1;i<=10;i++){
   
        System.out.println(n+" * "+i+" = "+ n*i);
 
}
}
}

//63 pattern 15
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int sp= n/2;
int st=1;
int v=1;
for (int i=1;i<=n;i++){
    int b =v;
        for (int a=1;a<=sp;a++){
            System.out.print(" \t");
        }
        for (int a=1;a<=st;a++){
        
            System.out.print(b+"\t");
            if (a<(st+1)/2){
                b++;
            }
            else {
                b--;
            }
    }
    // if (i<=n/2) work and is cleaner
    if (i<(n+1)/2){
        sp--;
        st+=2;
        v++;
    }
    else {
        sp++;
        st-=2;
        v--;
    }
    System.out.println();
   
}
}
}

// 65 pattern 16
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int sp= 2*n-3;
int st=1;
int v=1;
int a=1;
for (int i=1;i<=n;i++){
    int cv=v;
    int cb=i;
    for (int j=1;j<=st;j++){
        System.out.print(cv+"\t");
        cv++;
    }
    for (int j=1;j<=sp;j++){
        System.out.print(" \t");
    }
    if (i==n){st--;}
       for (int j=1;j<=st;j++){

        System.out.print(cb+"\t");
        cb--;
    }
    st++;
    sp-=2;
    System.out.println();
}
}


//sir method
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int sp= 2*n-3;
int st=1;
for (int i=1;i<=n;i++){
    int v=1;
    for (int j=1;j<=st;j++){
        System.out.print(v+"\t");
        v++;
    }
    for (int j=1;j<=sp;j++){
        System.out.print(" \t");
    }
    if (i==n){st--;v--;}
       for (int j=1;j<=st;j++){
        v--;
        System.out.print(v+"\t");
    }
    st++;
    sp-=2;
    System.out.println();
}
}
}
//67 pattern 17 odd input
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sp=n/2;
int st=1;
for (int i=1;i<=n;i++){
    if (i==(n+1)/2){
        for (int j=1;j<=n;j++){
        System.out.print("*\t");
        
    }
    st--;
    }
    else{
        for (int j=1;j<=sp;j++){
        System.out.print(" \t");
        }
    for (int a=1;a<=st;a++){
        System.out.print("*\t");
    }
   if (i<=(n)/2){st++;}
   else{st--;}
   
}
System.out.println();
}

}
}

//sir method
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sp=n/2;
int st=1;
for (int i=1;i<=n;i++){
        for (int j=1;j<=sp;j++){
            if (i==(n)/2+1){
        
        System.out.print("*\t");
            }
    else {
        System.out.print(" \t");
        }
    }
    for (int a=1;a<=st;a++){
        System.out.print("*\t");
    }
   if (i<=(n)/2){st++;}
   else{st--;}
   

System.out.println();
}

}
}

//69 PATTERN 18 odd inp
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sp=0;
int st=n;
int is=st-2;
for (int i=1;i<=n;i++){
    for (int j=1;j<=sp;j++){
        System.out.print(" \t");
    }
    if (i<=n/2 && i!=1){
        System.out.print("*\t");
        for (int j =1;j<=is;j++){
            System.out.print(" \t");
        }
        System.out.print("*");
    }
    else {
    for (int j=1;j<=st;j++){
        System.out.print("* \t");
    }
}
    if (i<=n/2){
        st-=2;
        sp++;
        is=st-2;
    }
    else {
        st+=2;
        sp--;
    }
    System.out.println();
}
    }
}
    
   // sir meth
   Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sp=0;
int st=n;
int is=st-2;
for (int i=1;i<=n;i++){
    for (int j=1;j<=sp;j++){
        System.out.print(" \t");
    }
        for (int j =1;j<=st;j++){
            if (i<=n/2 && i!=1 && j>1 && j<st)
            System.out.print(" \t");
        else
        System.out.print("* \t");
    
    }
    if (i<=n/2){
        st-=2;
        sp++;
       
    }
    else {
        st+=2;
        sp--;
    }
    System.out.println();
}
    }
}
//71 pattern 19
   Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i=1;i<=n;i++){
    for (int j=1;j<=n;j++){
        if (i==1){
                    if (j>n/2+1 && j!=n)
                        System.out.print(" \t");
                    else
                        System.out.print("*\t");
        }
        else if(i<=n/2 && i!=1){
            if (j==n/2+1||j==n)
                System.out.print("*\t");
        
             else
            System.out.print(" \t");
            }
        else if (i==n/2+1){
                System.out.print("*\t");
        }
        else if (i>n/2+1 && i!=n){
            if (j==n/2+1||j==1)
                System.out.print("*\t");
        
                else
            System.out.print(" \t");
        }
        else if (i==n){
            if (j<=n/2 && j!=1)
                System.out.print(" \t");
        
             else
            System.out.print("*\t");
        }
        }
        System.out.println();
    }
}
}

//73 pattern 20
 Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int st=n/2;
int nst=n/2+2;
int isp=1;
for (int i=1;i<=n;i++){
    for (int j=1;j<=n;j++){
        if (i<=n/2||i==n){
                    if (j==1||j==n)
                        System.out.print("*\t");
                    else
                        System.out.print(" \t");
        }
        else if (i==n/2+1){
            if (j==1||j==n||j==n/2+1)
                System.out.print("*\t");
            else 
                System.out.print(" \t");
        }
        else{
            if(j==1||j==n||j==st||j==nst)
            System.out.print("*\t");
            else 
                System.out.print(" \t");
            
        }
        }
        if (i>n/2+1){
            st--;
            nst++;
        }
        System.out.println();
    }
}
}

//sir method
 Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i=1;i<=n;i++){
    for (int j=1;j<=n;j++){
        if (j==1||j==n||i>n/2 && (j==i||i+j==n+1))
            //brackets r imp. java do > first then && then || left to right)
                 System.out.print("*\t");
        else
                        System.out.print(" \t");
                    // or  can do if (j==1||j==n) print star
                    //else if (i>n/2&&(i==j||i+j==n+1)) print star
                    //else print space
        
        }
            System.out.println();
        }
    }
}
*/
/*
// 76  digit frequency
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int d = sc.nextInt();
int a= digfreq( n,d);
System.out.println(a);
    }
public static int digfreq ( int x, int y){
int count = 0;
do {
    if (x%10==y)
        count++;
    x=x/10;
}while (x!=0);
return count;
}
}
//number system
//79 Decimal to any Base
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int b= sc.nextInt();
int f = dtb(n,b);
System.out.println(f);
    }
public static int dtb(int n,int b){
int c=0;
for (int i=0;i>-1;i++){
c=c+(n%b)*(int)Math.pow(10,i);
n=n/b;
if (n==0){
    break;
    // SIR method you could do while loop n>0 with multiplyinh the n%b by p where p=1 initially and then inside loop at end p=p*10
}
}
return c;
}
    }
    
   //81 any base to decimal
   Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int b= sc.nextInt();
int a=btd(n,b);
System.out.println(a);
    }
    public static int btd(int n,int b){
        int c=0;
        int p=1;
        while(n>0){
        c+=(n%10)*p;
        p=p*b;
        n=n/10;
    }
        return c;
    }
}
// 83 any base to base
// in sir meth we just divide it into 2 func. any base to dec and any dec to base. we did sam ebut in same func
   Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int b1= sc.nextInt();
int b2= sc.nextInt();
int f= btb(n,b1,b2);
System.out.println(f);
    }
    public static int btb(int n, int b1, int b2){
        int c=0;
        int d=0;
        int p=1;
        int q=1;
        while (n>0) {
        c+=(n%10)*p;
        p=p*b1;
        n=n/10;
    }
    while (c>0){
        d+=(c%b2)*q;
        q*=10;
        c=c/b2;
    }
    
        return d;
    }
}
    
//85 any base addition
   Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2= sc.nextInt();
int b= sc.nextInt();
int c=anybaseadd(n1,n2,b);
System.out.println(c);
    }
    public static int anybaseadd(int n1, int n2,int b){
    int e=0;
    int p=1;
    int carry=0;
    do{
    int a =n1%10;
    int c= n2%10;
    int d=a+c+carry;
        carry=d/b;
        // tip instead of doing carry = d-b in if and else carry =0 we can just do qoutient and remainder thing
        d=d%b;
    e+=d*p;
    p*=10;
    n1=n1/10;
    n2=n2/10;} while (n1 !=0 || n2!=0 || carry !=0);
    return e;
    }
}
// 87 any base subtraction
 Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2= sc.nextInt();
int b= sc.nextInt();
int c=anybasesub(n1,n2,b);
System.out.println(c);
    }
    public static int anybasesub (int n1, int n2,int b){
        int rv=0;
        int p=1;
        
        int carry=0;
        while(n1!=0||n2!=0){
        int d1=n1%10-carry;
        int d2=n2%10;
        if (d1<d2){d1=d1+b;
             carry=1;
        }
        else
        carry=0;
        rv+=(d1-d2)*p;
        n1=n1/10;
        n2=n2/10;
        p*=10;
    }
        return rv;
    }
}

//89 any base multiplication
 Scanner scn = new Scanner(System.in);
int n1 = scn.nextInt();
int n2= scn.nextInt();
int b= scn.nextInt();
int f= finalproduct(n1, n2, b);
System.out.println(f);
    }
    public static int finalproduct (int n1,int n2,int b){
        int rv=0;
        int p=1;
while (n2!=0){
   int  dign2=n2%10;
    n2=n2/10;
    int prod = mulby1(n1,dign2,b);
rv=anybaseadd(rv,prod*p,b);
p*=10;
}
        return rv;


    }
    public static int anybaseadd(int n1, int n2,int b){
    int e=0;
    int p=1;
    int carry=0;
    do{
    int a =n1%10;
    int c= n2%10;
    int d=a+c+carry;
        carry=d/b;
        // tip instead of doing carry = d-b in if and else carry =0 we did do qoutient and remainder thing
        d=d%b;
    e+=d*p;
    p*=10;
    n1=n1/10;
    n2=n2/10;} while (n1 !=0 || n2!=0 || carry !=0);
    return e;
    }
    public static int mulby1(int n1,int dign2, int b){
        int rv=0;
        int carry=0;
        int p=1;
         while (n1!=0||carry !=0){
            int dign1=n1%10;
            int m=dign1*dign2+carry;
            carry=m/b;
            m=m%b;
             rv+=m*p;
            p*=10;
            n1=n1/10;
         }
        return rv;
    }
}

// 93 span of array
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int [] arr = new int [n];
for (int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
int max= maxmmin(arr);
System.out.println(max);
}
    public static int maxmmin(int []arr){
        int max=arr[0];
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
if (arr[i]>max) max=arr[i];       
if (arr[i]<min) min=arr[i];  
        }
        int rv=max-min;
        return rv;
    }
}
*/
/*
// 95 find an element in array
// here we found last occurance
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int e = scn.nextInt();
int [] arr= new int [n];
for (int i=0;i<arr.length;i++){
     arr[i]= scn.nextInt();
}
     */
// for last occurance,just bbreak loop for first occurance
/* int r = finder(arr, e);
if (r==-1) 
    System.out.println("not found");
else
System.out.println(r);
    }

public static int finder(int [] arr,int e){
    int rv=-1;
for (int i=0;i<arr.length;i++){
    if (arr[i]==e) 
        rv=i;
}
return rv;
}
}*/
//to find all occurances
/*
finders(arr, e);
    }
public static void finders(int [] arr,int e){
    boolean f = false;
for (int i=0;i<arr.length;i++){
    
    if (arr[i]==e){
        System.out.println("it is at index"+ i);
f=true;
}
}
if (!f) System.out.println("not found");
}
}
 */
/*
// 97 bar chart here we have to make stars verticallly equal to the no. in array [i]
//approach i found that print space if lower then max if notthen star hile reducing max by 1 every new line
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int [] arr = new int [n];
for (int index = 0; index < arr.length; index++) {
arr[index]=sc.nextInt();

}
int m = maxm(arr);
int mm=m;
for (int i=0;i<m;i++) {
    //sir approach was for(int floor=m;floor>0;floor--) instead of our i. this eliminates the need of mm as we can just use floor instead of mm.its also getting reduced per loop anyway
    for (int j=0;j<n;j++){
        if (arr[j]>=mm) System.out.print( "*\t");
        else System.out.print(" \t");
        
    }
    mm--;
    System.out.println();
}
    }
public static int maxm(int []arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
if (arr[i]>max) max=arr[i];       
        }
        int rv=max;
        return rv;
    }
}
*/
/* 
//99 sum of two array
// i accidenally did while (a!=0||b!=0) which became infinite loop bc suppose a and b are 3 and 4. a becomes 0 b become 1. then a become -1 b 0. then a-2 b-1. it runs infinite as one of them is non zero. so cond should be a>0 || b>0
Scanner sc= new Scanner(System.in);
int n1 = sc.nextInt();
int [] arr1= new int [n1];
for (int i = 0; i < arr1.length; i++) {
    arr1[i]=sc.nextInt();
}
int n2 = sc.nextInt();
int [] arr2= new int [n2];
for (int i = 0; i < arr2.length; i++) {
    arr2[i]=sc.nextInt();
}
sum(arr1,arr2);
    }
    public static void sum(int []arr1, int []arr2){
        int a=arr1.length;
        int carry=0;
        int b=arr2.length;
        int[] sumarr;
        /*if (a>b)   sumarr=new int[a];
        else  sumarr=new int[b];*/
        //optimized
         // sumarr=new int [Math.max(a,b)];
         /*ooooosumarr=new int [a>b?a:b];
    int l=sumarr.length;
        while (a>0||b>0) {
            int s1=0;
            int s2=0;
            if (a>0) 
                // could do --a here.
                s1=arr1[a-1];
                //--b
            if (b>0) s2=arr2[b-1];
int s=s1+s2+carry;
carry=s/10;
/*
sir approach
s=c
btw here a and b were their length-1
if (a>=0) s+=arr1[a] 
same with b*/
 /*oooooooooos=s%10;
sumarr[l-1]=s;
l--;
            a--;
            b--;
        }
        if (carry!=0)System.out.println(carry);
    for (int i : sumarr) {
       System.out.println(i);
    }
       /*  for (int i=0;i<sumarr.length;i++){
            System.out.println(sumarr[i]);
        } */
 /*ooooooo  }
}
*/
//101 difference of 2 arrays given array2 is greater
Scanner sc= new Scanner(System.in);
int n1 = sc.nextInt();
int [] arr1= new int [n1];
for (int i = 0; i < arr1.length; i++) {
    arr1[i]=sc.nextInt();
}
int n2 = sc.nextInt();
int [] arr2= new int [n2];
for (int i = 0; i < arr2.length; i++) {
    arr2[i]=sc.nextInt();
}
diff(arr1,arr2);
    }
    public static void diff(int []arr1, int []arr2){
    int nonZero=-1;
    int n1=arr1.length;
    int n2=arr2.length;
    int c=0;
    int [] arr3= new int [n2];
while (n2>0) {
    int d2=0;
    int d1=0;
if (n2>0) d2=arr2[n2-1]-c;
if (n1>0) d1=arr1[--n1];
if (d1>d2){
    c=1;
    d2=d2+10;
}
else c= 0;
    int d=d2-d1;
    arr3[n2-1]=d;
    n1--;
    n2--;
}
for (int i = 0; i < arr3.length; i++) {
    if (arr3[i]!=0) {
        nonZero=i;
        break;
    }
}
if (nonZero==-1) {
    System.out.println(0);
}
else   
    for (int i = nonZero; i < arr3.length; i++) {
        System.out.println(arr3[i]);
    }
    }
}