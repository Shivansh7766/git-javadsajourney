import java.util.*;

public class stacks {
                public static void main(String args[]) {
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
                            st.pop();
                            if (st.peek()=='('){
                                System.out.println(true);
                                return;
                            }
                            else {
                                while (ch!='('){
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

}
}
