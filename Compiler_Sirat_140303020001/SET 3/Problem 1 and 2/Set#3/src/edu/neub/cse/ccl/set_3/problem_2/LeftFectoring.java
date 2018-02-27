package edu.neub.cse.ccl.set_3.problem_2;

import java.util.*;


public class LeftFectoring {

    public static String cfg = "A : a B1 | a B2";

    public ArrayList<String> list = new ArrayList<String>();
    public ArrayList<String> outputList = new ArrayList<String>();

    public void splitingMethod() {
        String temp = cfg;
        for (String tmp : temp.split(":")) {
            list.add(tmp.trim());
        }

        temp = list.get(1).toString().trim();
        list.remove(1);
        for (String tmp : temp.split("\\|")) {
            list.add(tmp.trim());
        }
    }

    public void splitWithSpace(String temp) {
        int ind = list.indexOf(temp);
        list.remove(ind);

        for (String tmp : temp.split(" ")) {
            list.add(ind++, tmp.trim());
        }
    }

    public boolean isLeftFactor() {
        if (list.get(1).toString().startsWith(list.get(2).toString().charAt(0) + "")) {
            return true;
        }
        return false;
    }

    public void removeLeftFactor() {
        outputList.add(list.get(0));
        outputList.add(":");
        outputList.add(list.get(1));
        outputList.add("Ap");
        outputList.add("br");
        outputList.add("Ap");
        outputList.add(":");
        outputList.add(list.get(2));
        outputList.add("|");
        outputList.add(list.get(4));

        for (int i = 0; i < outputList.size(); i++) {

            if (outputList.get(i).toString().trim().equals("br")) {
                System.out.println("");
                continue;
            }
            System.out.print(outputList.get(i) + " ");
        }
        System.out.println("\n");

    }

    public void fectoringMethod() {
        splitingMethod();

        if (isLeftFactor()) {
            String temp1 = list.get(1).toString().trim();
            String temp2 = list.get(2).toString().trim();

            splitWithSpace(temp1);
            splitWithSpace(temp2);

            removeLeftFactor();
        } else {
            System.out.println("There is no left Factor...!!!");
        }
    }

    public static void main(String[] args) {

        LeftFectoring fectoring = new LeftFectoring();
        fectoring.fectoringMethod();
    }
}
