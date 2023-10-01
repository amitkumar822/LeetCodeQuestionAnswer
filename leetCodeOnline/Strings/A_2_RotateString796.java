package leetCodeOnline.Strings;

public class A_2_RotateString796 {
    static boolean isCycle(String s, String goal){
//        //1st method
//        return s.length()==goal.length() && (s+s).contains(goal);
//        //end 1st method

        //2nd method
        if(s.length()==goal.length()) return true;
        int res = (goal+goal).indexOf(s);
        if(res==-1||s.length()==goal.length()) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println("Final Result is Here: ");
        System.out.println(isCycle(s,goal));
    }
}
