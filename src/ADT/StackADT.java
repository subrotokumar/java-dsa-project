package DSA.ADT;
import java.util.*;
public class StackADT {
    public static void main(String... args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean value = bb(str);
        System.out.print(value);


    }

    public static boolean bb(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']') {
                if (ch == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (st.peek() == '[') {
                        //System.out.print("false");
                        st.pop();
                    } else {
                        //System.out.print("f");
                        return false;
                    }
                }
            }
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
        }
        //System.out.print(st.peek());
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
//}
//[6:54 pm, 31/03/2022] Shashank: package shashank;
//        import java.util.*;
//public class subroto
//{
//    public static void main(String... args) throws Exception
//    {
//
//
//        try (Scanner scn = new Scanner (System.in)) {
//            String str = scn.nextLine();
//            boolean value = bb(str);
//            System.out.print(value);
//        }
//
//
//
//    }
//    public static boolean bb(String str)
//    {
//        Stack<Character> st = new Stack<>();
//        for(int i=0;i<str.length();i++)
//        {
//            Character ch = str.charAt(i);
//            if(ch==')'||ch=='}'||ch == ']')
//            {
//                if(ch == ')')
//                {
//                    if(st.peek() == '(')
//                    {
//                        st.pop();
//                    }
//                    else
//                    {
//                        return false;
//                    }
//                }
//                if(ch == '}')
//                {
//                    if(st.peek() == '{')
//                    {
//                        st.pop();
//                    }
//                    else
//                    {
//                        return false;
//                    }
//                }
//                if(ch == ']')
//                {
//                    if(st.peek() == '[')
//                    {
//                        //System.out.print("false");
//                        st.pop();
//                    }
//                    else
//                    {
//                        //System.out.print("f");
//                        return false;
//                    }
//                }
//            }
//            if(ch=='('||ch=='{'||ch == '[')
//            {
//                st.push(ch);
//            }
//        }
//        //System.out.print(st.peek());
//        if(st.size()==0)
//        {
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//}