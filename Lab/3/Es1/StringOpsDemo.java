package Es1;

import Es1.StringOps;

public class StringOpsDemo {
    public static void main(String[] args) {
        System.out.println("longest = " + StringOps.longest(args) + " ");
        System.out.println("concatAll = " + StringOps.concatAll(args) + " ");
        
        assert args != null && args.length > 0 && args[0] != null && args[0].length() > 0 
            : "Argomenti non sufficienti o primo argomento vuoto per trim()";
        System.out.println("trim(args[0]) = " + StringOps.trim(args[0]) + " ");
    }
}