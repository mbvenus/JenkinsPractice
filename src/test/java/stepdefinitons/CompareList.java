package stepdefinitons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareList {

    public static void main(String[] args) {

        List<String> orginalList = new ArrayList<>();
        orginalList.add("ali");
        orginalList.add("mehmet");
        orginalList.add("baba");
        orginalList.add("serhat");
        orginalList.add("cihan");
        orginalList.add("kemal");
        System.out.println("orginalList = " + orginalList);
        List<String> orderedList= orginalList;
        System.out.println(" before orderedList = " + orderedList);
        Collections.sort(orderedList);
        System.out.println("after orderedList = " + orderedList);
         if (orginalList.toString().equals(orderedList.toString())){
             System.out.println("goood");
         }else{
             System.out.println("bad");
         }

    }
}
