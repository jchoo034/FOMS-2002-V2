package Backend;

import Database.DataStructs.Branch_T;
import Database.DataStructs.MenuItem_T;
import Main.SharedResources;

import java.util.ArrayList;

public class Branch {
    private Branch_T branchT;
    private Staff[] myStaff;
//    private ArrayList<MenuItem_T> branchMenu;

    public Branch(Branch_T branchT) {
        this.branchT = branchT;
    }

    public static ArrayList<MenuItem_T> printMenu(Branch_T branchT, boolean show) {
        if (branchT == null) {
            System.out.println("You have no branch, unable to print menu");
            return null;
        }
        ArrayList<MenuItem_T> branchMenu = branchT.getMenuItems();
        ArrayList<MenuItem_T> filteredBranchMenu = new ArrayList<>();

        for (int i = 0; i < branchMenu.size(); i++) {
            filteredBranchMenu.add(branchMenu.get(i));
            if (show) {
                System.out.println((i + 1) + ": " + branchMenu.get(i).prettyPrint());
            }
        }

        return filteredBranchMenu;
    }

    public static int maxNormalStaff(Branch_T branchT) {
        int nBmSize = branchT.getBranchManagerArr().size();
        System.out.println(nBmSize);
        if (nBmSize < 0) return 0;
        else if (nBmSize == 1) return 4;
        else if (nBmSize == 2) return 8;
        else if (nBmSize == 3) return 15;

        return 20;
    }
}
