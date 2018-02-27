package edu.neub.cse.ccl.set_3.problem_1;
import java.util.*;
public class LeftRescurssionElemenation {

    public String str;      // ="E:E+T";
    public static ArrayList<String> list = new ArrayList<String>();
    public static ArrayList<String> outputList = new ArrayList<String>();

    public void splitEqual() {
        String temp = str.trim();
        for (String tmp : temp.split(":")) {
            list.add(tmp);
        }
    }

    public void splitPlus() {
        String temp = (list.get(1)).toString().trim();
        int ind = 1;
        list.remove(1);
        for (String tmp : temp.split("\\+")) {
            list.add(ind++, tmp);
        }
        list.add(1, ":");
        list.add(3, "+");
    }

    public boolean isAmbiguousCFG() {
        if (((list.get(0)).toString().trim()).
                equals((list.get(2)).toString().trim())) {
            return true;
        }
        return false;
    }

    public void leftRescElemeAlgo() {
        if (isAmbiguousCFG()) {
            outputList.add(list.get(0));    //0
            outputList.add(list.get(1));    //1
            outputList.add(list.get(4));    //2
            outputList.add("temp");         //3
            outputList.add("br");
            outputList.add("temp");
            outputList.add(list.get(1));
            outputList.add(list.get(3));
            outputList.add(list.get(4));
            outputList.add("temp");
            outputList.add("| null");

            for (int i = 0; i < outputList.size(); i++) {
                if (outputList.get(i).toString().equals("br")) {
                    System.out.println("");
                } else {
                    System.out.print(outputList.get(i).toString() + " ");
                }
            }
            System.out.println("");

        } else {
            System.out.println("The Grammer is not Ambiguous");
        }
    }

    public void getIntput() {
        Scanner in = new Scanner(System.in);

        str = in.nextLine();
    }

    public static void main(String[] args) {

        LeftRescurssionElemenation elemenation = new LeftRescurssionElemenation();

        elemenation.getIntput();
        elemenation.splitEqual();
        elemenation.splitPlus();
        elemenation.leftRescElemeAlgo();
    }
}
