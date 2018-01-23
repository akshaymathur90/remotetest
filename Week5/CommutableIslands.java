package InterviewPrepWork.Week5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by akshaymathur on 1/22/18.
 */
public class CommutableIslands {
    class Edge implements Comparable<Edge> {
        int src, dest, cost;
        public Edge(int src, int dest, int cost) {
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
    class Graph {

        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        int n;
        int arr[];
        public Graph(int n) {
            this.n = n;
        }
        private void initialize() {
            this.arr = new int[n+1];
            for(int i = 0 ; i <= n ; i++) {
                arr[i] = i;
            }
        }

        private int root(int vertice) {
            while(vertice != arr[vertice])
                vertice = arr[vertice];
            return vertice;
        }
        private void union(int vertice1 , int vertice2) {
            arr[root(vertice1)] = arr[root(vertice2)];

        }
        public int kruskal() {
            initialize();
            int minCost = 0;
            Collections.sort(this.edgeList);
            for(int i = 0 ; i < this.edgeList.size() ; i++) {
                int src = this.edgeList.get(i).src;
                int dest = this.edgeList.get(i).dest;
                if(root(src) != root(dest)) {
                    minCost += this.edgeList.get(i).cost;
                    union(src, dest);
                }
            }

            return minCost;
        }
    }

    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        Graph g = new Graph(A);

        for(int i = 0 ; i < B.size() ; i++) {
            g.edgeList.add(new Edge(B.get(i).get(0), B.get(i).get(1), B.get(i).get(2)));
        }

        return g.kruskal();
    }
}
