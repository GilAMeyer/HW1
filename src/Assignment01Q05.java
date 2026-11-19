public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] distance = new int[m.length];
        java.util.Arrays.fill(distance, -1);
        int[] queue = new int[m.length];
        int head = 0;
        int tail = 0;
        queue[tail++] = i;
        distance[i] = 0;
        while (head < tail) {
            int vertex = queue[head++];
            if (vertex == j) {
                return distance[vertex];
            }
            for (int neighbor = 0; neighbor < m.length; neighbor++) {
                if (m[vertex][neighbor] == 1 && distance[neighbor] == -1) {
                    distance[neighbor] = distance[vertex] + 1;
                    queue[tail++] = neighbor;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
