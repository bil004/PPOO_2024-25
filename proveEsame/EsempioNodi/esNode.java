package EsempioNodi;

/* Java visualizer:
https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+esNode+%7B%0A++++public+static+boolean+inComuneIter(Node+p,+Node+q)+%7B%0A++++++++if+(p+%3D%3D+null+%7C%7C+q+%3D%3D+null)%0A++++++++++++return+false%3B%0A%0A++++++++Node+nodeP+%3D+p,+nodeQ+%3D+q%3B%0A++++++++while+(nodeP+!%3D+null+%26%26+nodeQ+!%3D+null)+%7B%0A++++++++++++if+(nodeP.getElem()%3D%3D+nodeQ.getElem())%0A++++++++++++++++return+true%3B%0A%0A++++++++++++nodeP+%3D+nodeP.getNext()%3B%0A++++++++++++nodeQ+%3D+nodeQ.getNext()%3B%0A++++++++%7D%0A%0A++++++++return+false%3B%0A++++%7D%0A%0A++++public+static+boolean+inComuneRec(Node+p,+Node+q)+%7B%0A++++++++if+(p+%3D%3D+null+%7C%7C+q+%3D%3D+null)%0A++++++++++++return+false%3B%0A++++++++return+p.getElem()+%3D%3D+q.getElem()+%3F+true+%3A+inComuneRec(p.getNext(),+q.getNext())%3B%0A++++%7D%0A%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++Node+n+%3D+new+Node(5,+null)%3B%0A++++++++n.setNext(new+Node(7,+null))%3B%0A++++++++Node+m+%3D+new+Node(7,+null)%3B%0A++++++++m.setNext(new+Node(5,+null))%3B%0A++++++++System.out.println(inComuneIter(n,+m))%3B%0A++++++++System.out.println(inComuneRec(n,+m)+%2B+%22%5Cn%22)%3B%0A++++%7D%0A%7D%0A%0Aclass+Node+%7B%0A++++private+int+elem%3B%0A++++private+Node+next%3B%0A%0A++++public+Node(int+elem,+Node+next)+%7B%0A++++++++this.elem+%3D+elem%3B%0A++++++++this.next+%3D+next%3B%0A++++%7D%0A%0A++++public+int+getElem()+%7B%0A++++++++return+elem%3B%0A++++%7D%0A%0A++++public+void+setElem(int+elem)+%7B%0A++++++++this.elem+%3D+elem%3B%0A++++%7D%0A%0A++++public+Node+getNext()+%7B%0A++++++++return+next%3B%0A++++%7D%0A%0A++++public+void+setNext(Node+next)+%7B%0A++++++++this.next+%3D+next%3B%0A++++%7D%0A%7D&mode=display&curInstr=140    
*/ 
 

public class esNode {
    public static <T> boolean inComuneIter(Node<T> p, Node<T> q) {
        if (p == null || q == null)
            return false;

        Node<T> nodeP = p, nodeQ = q;
        while (nodeP != null && nodeQ != null) {

            if (nodeP.getElem().equals(nodeQ.getElem()))
                return true;

            nodeP = nodeP.getNext();
            nodeQ = nodeQ.getNext();
        }

        return false;
    }

    public static <T> boolean inComuneRec(Node<T> p, Node<T> q) {
        if (p == null || q == null)
            return false;
        return p.getElem().equals(q.getElem()) ? true : inComuneRec(p.getNext(), q.getNext());
    }

    public static void main(String[] args) {
        Node<Integer> n = new Node<>(5, null);
        n.setNext(new Node<Integer>(7, null));
        Node<Integer> m = new Node<>(7, null);
        m.setNext(new Node<Integer>(5, null));
        System.out.println(inComuneIter(n, m));
        System.out.println(inComuneRec(n, m) + "\n");

        // Test con liste vuote
        Node<Integer> empty1 = null;
        Node<Integer> empty2 = null;
        System.out.println(inComuneIter(empty1, empty2)); // false
        System.out.println(inComuneRec(empty1, empty2) + "\n"); // false

        // Test con una lista vuota e una non vuota
        Node<Integer> single = new Node<>(10, null);
        System.out.println(inComuneIter(empty1, single)); // false
        System.out.println(inComuneRec(empty1, single) + "\n"); // false

        // Test con liste di lunghezza diversa
        Node<Integer> shortList = new Node<>(1, null);
        Node<Integer> longList = new Node<>(1, new Node<>(2, new Node<>(3, null)));
        System.out.println(inComuneIter(shortList, longList)); // true
        System.out.println(inComuneRec(shortList, longList) + "\n"); // true

        // Test con liste senza elementi in comune
        Node<Integer> noCommon1 = new Node<>(4, new Node<>(5, null));
        Node<Integer> noCommon2 = new Node<>(6, new Node<>(7, null));
        System.out.println(inComuneIter(noCommon1, noCommon2)); // false
        System.out.println(inComuneRec(noCommon1, noCommon2) + "\n"); // false
    }
}