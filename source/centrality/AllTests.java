package centrality;

import centrality.*;

class AllTests {
    static final String NEWLINE = "\r\n";
    public static void main(String[] args) {
//        testMatrix();
//        testDegreeCentrality();
//        testEigenvectorCentrality();
//        testKatzCentrality();
//        testPagerankCentrality();
        testGraph();
        testClosenessCentrality();
    }

    static void testMatrix(){
        System.out.println(AdjacentMatrix.getLength());
        System.out.println(AdjacentMatrix.getWidth());
        for (int i=0; i<AdjacentMatrix.getLength(); i++) {
            for (int j=0; j<AdjacentMatrix.getWidth(); j++) {
                System.out.println(AdjacentMatrix.get(i,j));
            }
            System.out.println(NEWLINE);
        }
    }

    static void testDegreeCentrality(){
        for (int node = 0; node <AdjacentMatrix.getLength(); node++){
            System.out.println(DegreeCentrality.get(node));
        }
    }

    static void testEigenvectorCentrality(){
        System.out.println(EigenvectorCentrality.getLargestEigenvalueNumber());
        for (int node = 0; node <AdjacentMatrix.getLength(); node++){
            System.out.println(EigenvectorCentrality.get(node));
        }
    }

    static void testKatzCentrality(){
        for (int node = 0; node <AdjacentMatrix.getLength(); node++){
            System.out.println(KatzCentrality.get(node));
        }
    }

    static void testPagerankCentrality(){
        for(int node = 0; node < AdjacentMatrix.getLength(); node++){
            System.out.println(PagerankCentrality.get(node));
        }
    }

    static void testGraph(){
        System.out.println(Graph.getNumberOfVertexes());
            System.out.println(Graph.get().toString());
    }

    static void testClosenessCentrality(){
        for (int node = 0; node < Graph.getNumberOfVertexes(); node++){
            System.out.println(ClosenessCentrality.get(node));
        }
    }
}
