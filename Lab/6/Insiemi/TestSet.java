package Insiemi;

public class TestSet {
    public static void main(String[] args) {
        //INSIEMI DI Integer
        Set<Integer> is1 = new Set<>();
        Set<Integer> is2 = new Set<>();
        Set<Integer> is3 = new Set<>();
        Set<Integer> is4 = new Set<>();
        is1.add(1);
        is1.add(2);
        is1.add(3);
        is1.add(100);
        is2.add(2);
        is2.add(3);
        is2.add(4);
        is3.add(1);
        is3.add(2);
        is3.add(3);
        is3.add(4);
        is4.add(1);
        is4.add(2);
        is4.add(3);
        is4.add(3);
        is4.add(3);
        is4.add(3);
        System.out.println("\n===INSIEMI DI Integer===");

        System.out.print("Insieme is1: ");
        is1.print();
        System.out.print("Insieme is2: ");
        is2.print();
        System.out.print("Insieme is3: ");
        is3.print();
        System.out.print("Insieme is4: ");
        is4.print();

        System.out.println("is1.size(): "+is1.size());
        System.out.println("is2.size(): "+is2.size());
        System.out.println("is3.size(): "+is3.size());
        System.out.println("is4.size(): "+is4.size());
        System.out.println("(new Set<Integer>()).size(): "+(new Set<Integer>()).size());

        System.out.println("is1.empty(): "+is1.empty());
        System.out.println("(new Set<Integer>()).empty(): "+(new Set<Integer>()).empty());

        System.out.println("is1.contains(100): "+is1.contains(100));
        System.out.println("is1.remove(100): "+is1.remove(100));
        System.out.println("is1.contains(100): "+is1.contains(100));

        Set<Integer> isIntersect = is1.intersection(is2);
        System.out.print("Insieme intersezione di is1 e is2: ");
        isIntersect.print();

        Set<Integer> isUnion = is1.union(is2);
        System.out.print("Insieme unione di is1 e is2: ");
        isUnion.print();

        System.out.println("is1.subsetOf(is3): "+is1.subsetOf(is3));
        System.out.println("is3.subsetOf(is1): "+is3.subsetOf(is1));
        System.out.println("(new Set<Integer>()).subsetOf(is1): "+(new Set<Integer>()).subsetOf(is1));
        System.out.println("is1.subsetOf((new Set<Integer>())): "+is1.subsetOf((new Set<>())));

        System.out.println("is1.equalsTo(is4): "+is1.equalsTo(is4));
        System.out.println("is1.equalsTo(is2): "+is1.equalsTo(is2));
        System.out.println("(new Set<Integer>()).equalsTo(new Set<Integer>()): "+(new Set<Integer>()).equalsTo(new Set<>()));


        //INSIEMI DI Double
        Set<Double> ds1 = new Set<>();
        Set<Double> ds2 = new Set<>();
        Set<Double> ds3 = new Set<>();
        Set<Double> ds4 = new Set<>();
        ds1.add(1.0);
        ds1.add(2.0);
        ds1.add(3.0);
        ds1.add(100.0);
        ds2.add(2.0);
        ds2.add(3.0);
        ds2.add(4.0);
        ds3.add(1.0);
        ds3.add(2.0);
        ds3.add(3.0);
        ds3.add(4.0);
        ds4.add(1.0);
        ds4.add(2.0);
        ds4.add(3.0);
        ds4.add(3.0);
        ds4.add(3.0);
        ds4.add(3.0);
        System.out.println("\n===INSIEMI DI Double===");

        System.out.print("Insieme ds1: ");
        ds1.print();
        System.out.print("Insieme ds2: ");
        ds2.print();
        System.out.print("Insieme ds3: ");
        ds3.print();
        System.out.print("Insieme ds4: ");
        ds4.print();

        System.out.println("ds1.size(): "+ds1.size());
        System.out.println("ds2.size(): "+ds2.size());
        System.out.println("ds3.size(): "+ds3.size());
        System.out.println("ds4.size(): "+ds4.size());
        System.out.println("(new Set<Double>()).size(): "+(new Set<Double>()).size());

        System.out.println("ds1.empty(): "+ds1.empty());
        System.out.println("(new Set<Double>()).empty(): "+(new Set<Double>()).empty());

        System.out.println("ds1.contains(100.0): "+ds1.contains(100.0));
        System.out.println("ds1.remove(100.0): "+ds1.remove(100.0));
        System.out.println("ds1.contains(100.0): "+ds1.contains(100.0));

        Set<Double> dsIntersect = ds1.intersection(ds2);
        System.out.print("Insieme intersezione di ds1 e ds2: ");
        dsIntersect.print();

        Set<Double> dsUnion = ds1.union(ds2);
        System.out.print("Insieme unione di ds1 e ds2: ");
        dsUnion.print();

        System.out.println("ds1.subsetOf(ds3): "+ds1.subsetOf(ds3));
        System.out.println("ds3.subsetOf(ds1): "+ds3.subsetOf(ds1));
        System.out.println("(new Set<Double>()).subsetOf(ds1): "+(new Set<Double>()).subsetOf(ds1));
        System.out.println("ds1.subsetOf((new Set<Double>())): "+ds1.subsetOf((new Set<>())));

        System.out.println("ds1.equalsTo(ds4): "+ds1.equalsTo(ds4));
        System.out.println("ds1.equalsTo(ds2): "+ds1.equalsTo(ds2));
        System.out.println("(new Set<Integer>()).equalsTo(new Set<Integer>()): "+(new Set<Integer>()).equalsTo(new Set<>()));

        //INSIEMI DI String
        Set<String> ss1 = new Set<>();
        Set<String> ss2 = new Set<>();
        Set<String> ss3 = new Set<>();
        Set<String> ss4 = new Set<>();
        ss1.add("uno");
        ss1.add("due");
        ss1.add("tre");
        ss1.add("cento");
        ss2.add("due");
        ss2.add("tre");
        ss2.add("quattro");
        ss3.add("uno");
        ss3.add("due");
        ss3.add("tre");
        ss3.add("quattro");
        ss4.add("uno");
        ss4.add("due");
        ss4.add("tre");
        ss4.add("tre");
        ss4.add("tre");
        ss4.add("tre");
        System.out.println("\n===INSIEMI DI String===");

        System.out.print("Insieme ss1: ");
        ss1.print();
        System.out.print("Insieme ss2: ");
        ss2.print();
        System.out.print("Insieme ss3: ");
        ss3.print();
        System.out.print("Insieme ss4: ");
        ss4.print();

        System.out.println("ss1.size(): "+ss1.size());
        System.out.println("ss2.size(): "+ss2.size());
        System.out.println("ss3.size(): "+ss3.size());
        System.out.println("ss4.size(): "+ss4.size());
        System.out.println("(new Set<String>()).size(): "+(new Set<String>()).size());

        System.out.println("ss1.empty(): "+ss1.empty());
        System.out.println("(new Set<String>()).empty(): "+(new Set<String>()).empty());

        System.out.println("ss1.contains(\"cento\"): "+ss1.contains("cento"));
        System.out.println("ss1.remove(\"cento\"): "+ss1.remove("cento"));
        System.out.println("ss1.contains(\"cento\"): "+ss1.contains("cento"));

        Set<String> ssIntersect = ss1.intersection(ss2);
        System.out.print("Insieme intersezione di ss1 e ss2: ");
        ssIntersect.print();

        Set<String> ssUnion = ss1.union(ss2);
        System.out.print("Insieme unione di ss1 e ss2: ");
        ssUnion.print();

        System.out.println("ss1.subsetOf(ss3): "+ss1.subsetOf(ss3));
        System.out.println("ss3.subsetOf(ss1): "+ss3.subsetOf(ss1));
        System.out.println("(new Set<String>()).subsetOf(ss1): "+(new Set<String>()).subsetOf(ss1));
        System.out.println("ss1.subsetOf((new Set<String>())): "+ss1.subsetOf((new Set<>())));

        System.out.println("ss1.equalsTo(ss4): "+ss1.equalsTo(ss4));
        System.out.println("ss1.equalsTo(ss2): "+ss1.equalsTo(ss2));
        System.out.println("(new Set<String>()).equalsTo(new Set<String>()): "+(new Set<String>()).equalsTo(new Set<>()));
    }
}
