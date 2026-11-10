public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() < 2) {
            return false;
        } else {
            if (x.substring(x.length()-2).equals("ly")) {
                return true;
            } else {
                return false;
            }
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.equals("") || s2.equals("")){
            return s1+s2;
        } else {
            if (s1.substring(s1.length()-1).equals(s2.substring(0,1))) {
                return s1 + s2.substring(1);
            } else {
                return ""+s1+s2;
            }
        }
    }

    public String withoutX(String s1) {
        String fs = s1;
        if (fs.substring(fs.length()-1).equals("x")) {
            fs = fs.substring(0,fs.length()-1);
        } 
        if (fs.substring(0,1).equals("x")) {
            fs = fs.substring(1);
        }
        return fs;
    }

    public String fizzString(String s1) {
        String str = "";
        if (s1.substring(0,1).equals("f")) {
            str += "Fizz";
        }
        if (s1.substring(s1.length()-1).equals("b")) {
            str += "Buzz";
        }
        return str;
    }

    public String fizzString2(int x) {
        String str = "";
        if (x%3 == 0) {
            str += "Fizz";
        }
        if (x%5 == 0) {
            str += "Buzz";
        }
        if (x%3 != 0 && x%3 != 0) {
            str += x;
        }
        return str+"!";
    }

}
