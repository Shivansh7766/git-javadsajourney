import java.util.*;

public class stacks {
                public static void main(String args[]) {
                    /*
                    // 104 duplicate brackets
                    Scanner sc = new Scanner(System.in);
                    String str = sc.nextLine();
                    
                    Stack <Character> st = new Stack<>();
                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);
                        if (ch==')'){
                            if (st.peek()=='('){
                                System.out.println(true);
                                return;
                            }
                            else {
                                while (st.peek()!='('){
                                    st.pop();
                                }
                                st.pop();
                            }
                        }
                        else {
                            st.push(ch);
                        }
                       
                    }
                    System.out.println(false);
                    sc.close();

// 106 balanced brackets
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
Stack <Character> st = new Stack<>();
for (int i = 0; i < str.length(); i++) {
    char ch=str.charAt(i);
    if (ch==')') {
        while (st.peek()!='('){
            if (st.peek()=='{'||st.peek()=='['){
                System.out.println(false);
                return;
            }
            st.pop();
        }
        st.pop();
    }
    else if (ch==']') {
        while (st.peek()!='['){
            if (st.peek()=='{'||st.peek()=='('){
                System.out.println(false);
                return;
            }
            st.pop();
        }
        st.pop();
    }
    else if  (ch=='}') {
        while (st.peek()!='{'){
            if (st.peek()=='('||st.peek()=='['){
                System.out.println(false);
                return;
            }
            st.pop();
        }
        st.pop();
    }
    else {
        st.push(ch);
    }
}

if (st.size()!=0)
        System.out.println(false);
    else
    System.out.println(true);
}
}

// optimised soln 
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
Stack <Character> st = new Stack<>();
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (ch=='['||ch=='{'||ch=='('){
        st.push(ch);
    }
   else if (ch==')'){
        if (st.size()!=0 && st.peek()=='('){
            st.pop();
        }
        else {
            System.out.println();
            return;
        }
    } 
    else if (ch==']'){
        if (st.size()!=0 && st.peek()=='['){
            st.pop();
        }
        else {
            System.out.println(false);
            return;
        }
    }
    else if (ch=='}'){
        if (st.size()!=0 && st.peek()=='{'){
            st.pop();
        }
        else {
            System.out.println(false);
            return;
        }
    }
        
    }
    if (st.size()!=0)
        System.out.println(false);
    else
    System.out.println(true);
}
                }

                // we can also make a function 
                Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
Stack <Character> st = new Stack<>();
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (ch=='['||ch=='{'||ch=='('){
        st.push(ch);
    }
   else if (ch==')'){
        boolean val = balancedB(st, '(');
        if (val==false) {System.out.println(false);
            return;
            
        } 
    } 
    else if (ch==']'){
      boolean val = balancedB(st, '[');
        if (val==false) {System.out.println(false);
            return;
            
        } 
    }
    else if (ch=='}'){
      boolean val = balancedB(st, '{');
        if (val==false) {System.out.println(false);
            return;
            
        } 
    }
        
    }
    if (st.size()!=0)
        System.out.println(false);
    else
    System.out.println(true);
}
                
                public static boolean balancedB( Stack <Character> st,char cooresC){
if (st.size()!=0 && st.peek()== cooresC){
            st.pop();
            return true;
        }
        else {
                         return false;
        }
                }
}

//108 
// greatest element to right with O(n) time complexity
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int [] arr = new int [n];
Stack <Integer> st = new Stack<>();
for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
             }
for (int i = arr.length-1; i >= 0; i--) {
                st.push(arr[i]);
            }
            greatestRight(st, arr);
        }
    public static void greatestRight(Stack <Integer> st,int [] arr){
for (int i = 0; i < arr.length; i++) {
    Stack<Integer> st1 = new Stack<>();

for (Integer x : st) {
    st1.push(x);
}
for (int j=0;j<=i;j++){
st1.pop();}
while (st1.size()!=0 && st1.peek()<=arr[i]){
    st1.pop();
}
if (st1.size()!=0){
    System.out.println("next greatest right of"+arr[i]+" is "+ st1.peek());
}
else  System.out.println("next greatest right of"+arr[i]+" is "+ -1);


}
            }
}
            */
           // above one is not O(n)
           // approach we do it from right to left and dleete lements not needed
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int [] arr = new int [n];
for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
             }
            greatestRight(arr);
        }
    public static void greatestRight(int [] arr){
        int [] ans = new int[arr.length];
        Stack <Integer> st = new Stack<>();

for (int j= arr.length-1; j >=0; j--) {

    while (st.size()!=0 && st.peek()<=arr[j]){
     st.pop(); 
    }
    if (st.size()==0){
    ans[j]=-1;
    st.push(arr[j]);
}
else {
    ans[j]=st.peek();
    st.push(arr[j]);
}


}
for (int i = 0; i < ans.length; i++) {
    System.out.println(arr[i]+" " + ans[i]);
}
            }
        }

    