package Es1;

/* Java visualizer (usa piccoli esempi x memoria limitata):
 * https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Queues+%7B%0A++++private+Node+head,+tail%3B%0A++++private+int+size+%3D+0%3B%0A%0A++++public+Node+getHead()+%7B%0A++++++++return+head%3B%0A++++%7D%0A%0A++++public+int+getSize()+%7B%0A++++++++return+size%3B%0A++++%7D%0A%0A++++public+void+enqueue(Node+n)+%7B%0A++++++++if+(n+%3D%3D+null)+return%3B%0A%0A++++++++if+(head+%3D%3D+null)+%7B%0A++++++++++++head+%3D+n%3B%0A++++++++++++tail+%3D+n%3B%0A++++++++%7D+else+%7B%0A++++++++++++tail.setNext(n)%3B%0A++++++++++++tail+%3D+tail.getNext()%3B%0A++++++++%7D%0A++++++++size%2B%2B%3B%0A++++%7D%0A%0A++++public+int+dequeue()+%7B%0A++++++++if+(head+%3D%3D+null)+return+Integer.MIN_VALUE%3B%0A%0A++++++++int+elem+%3D+head.getElem()%3B%0A++++++++head+%3D+head.getNext()%3B%0A%0A++++++++if+(head+%3D%3D+null)%0A++++++++++++tail+%3D+null%3B%0A%0A++++++++size--%3B%0A%0A++++++++return+elem%3B%0A++++%7D%0A%0A++++public+boolean+empty()+%7B%0A++++++++return+size+%3D%3D+0%3B%0A++++%7D%0A%0A++++public+boolean+contains(int+elem)+%7B%0A++++++++Node+check+%3D+head%3B%0A%0A++++++++while+(check+!%3D+null)+%7B%0A++++++++++++if+(check.getElem()+%3D%3D+elem)%0A++++++++++++++++return+true%3B%0A%0A++++++++++++check+%3D+check.getNext()%3B%0A++++++++%7D%0A%0A++++++++return+false%3B%0A++++%7D%0A%0A++++public+boolean+equals(Queues+q)+%7B%0A++++++++if+(this.getSize()+!%3D+q.getSize())+return+false%3B%0A%0A++++++++Node+check1+%3D+this.getHead(),+check2+%3D+q.getHead()%3B%0A++++++++while+(check1+!%3D+null)+%7B%0A++++++++++++if+(check1.getElem()+!%3D+check2.getElem())%0A++++++++++++++++return+false%3B%0A%0A++++++++++++check1+%3D+check1.getNext()%3B%0A++++++++++++check2+%3D+check2.getNext()%3B%0A++++++++%7D%0A%0A++++++++return+true%3B%0A++++%7D%0A%0A++++public+int+sum(Node+head)+%7B%0A++++++++int+total+%3D+0%3B%0A++++++++Node+current+%3D+head%3B%0A%0A++++++++while+(current+!%3D+null)+%7B%0A++++++++++++total+%2B%3D+current.getElem()%3B%0A++++++++++++current+%3D+current.getNext()%3B%0A++++++++%7D%0A%0A++++++++return+total%3B%0A++++%7D%0A%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++Queues+q1+%3D+new+Queues()%3B%0A++++++++q1.enqueue(new+Node(1,+null))%3B%0A++++++++q1.enqueue(new+Node(2,+null))%3B%0A++++++++q1.enqueue(new+Node(3,+null))%3B%0A%0A++++++++System.out.println(%22Dimensione+di+q1+%3D+%22+%2B+q1.getSize())%3B%0A++++++++System.out.println(%22Somma+di+q1+%3D+%22+%2B+q1.sum(q1.getHead()))%3B%0A++++++++System.out.println(%22q1+contiene+2%3F+%22+%2B+q1.contains(2))%3B%0A++++++++System.out.println(%22Rimuovo+un+elemento+dalla+coda%3A+%22+%2B+q1.dequeue())%3B%0A++++++++System.out.println(%22Dimensione+di+q1+%3D+%22+%2B+q1.getSize())%3B%0A++++%7D%0A%7D%0A%0Aclass+Node+%7B%0A++++private+int+elem%3B%0A++++private+Node+next%3B%0A%0A++++public+Node(int+elem,+Node+next)+%7B%0A++++++++this.elem+%3D+elem%3B%0A++++++++this.next+%3D+next%3B%0A++++%7D%0A%0A++++public+int+getElem()+%7B%0A++++++++return+elem%3B%0A++++%7D%0A%0A++++public+void+setElem(int+elem)+%7B%0A++++++++this.elem+%3D+elem%3B%0A++++%7D%0A%0A++++public+Node+getNext()+%7B%0A++++++++return+next%3B%0A++++%7D%0A%0A++++public+void+setNext(Node+next)+%7B%0A++++++++this.next+%3D+next%3B%0A++++%7D%0A%7D&mode=display&curInstr=0
 */

public class testQueues {
    public static void main(String[] args) {
        Queues q1 = new Queues(), q2 = new Queues();

        q1.enqueue(new Node(1, null));
        q1.enqueue(new Node(2, null));
        q1.enqueue(new Node(3, null));
        q1.enqueue(new Node(4, null));
        q1.enqueue(new Node(5, null));

        q2.enqueue(new Node(1, null));
        q2.enqueue(new Node(2, null));
        q2.enqueue(new Node(3, null));
        q2.enqueue(new Node(4, null));
        q2.enqueue(new Node(5, null));

        System.out.println("Dimensione di q1 = " + q1.getSize());
        System.out.println("Dimensione di q2 = " + q2.getSize());

        System.out.println("\nSomma di q1 = " + q1.sum(q1.getHead()));
        System.out.println("Somma di q2 = " + q1.sum(q1.getHead()));

        System.out.println("\nq1 == q2? " + q1.equals(q2));

        System.out.println("\nq1 contiene 0? " + q1.contains(0));

        System.out.println("\nRimuovo un elemento dalla coda: " + q1.dequeue());

        System.out.println("\nq1 == q2? " + q1.equals(q2));

        System.out.println("\nq1 e' vuota? " + q1.empty());

        System.out.println("\nRimuovo un elemento dalla coda: " + q1.dequeue());
        System.out.println("Rimuovo un elemento dalla coda: " + q1.dequeue());
        System.out.println("Rimuovo un elemento dalla coda: " + q1.dequeue());
        System.out.println("Rimuovo un elemento dalla coda: " + q1.dequeue());

        System.out.println("\nq1 e' vuota? " + q1.empty());
        System.out.println("\nRimuovo un elemento dalla coda (dovrebbe dare errore): " + q1.dequeue());
    }
}
