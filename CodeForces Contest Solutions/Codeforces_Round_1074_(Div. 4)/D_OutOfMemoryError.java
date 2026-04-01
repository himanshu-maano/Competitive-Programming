import java.util.*;
import java.io.*;

public class D_OutOfMemoryError {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    private static void mano() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long h = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        SegmentTree st = new SegmentTree(a);

        int[] histIdx = new int[m];
        long[] histVal = new long[m];
        int ptr = 0;

        for (int i = 0; i < m; i++) {
            int bi = sc.nextInt() - 1;
            long ci = sc.nextLong();

            a[bi] += ci;
            st.update(bi, a[bi]);

            if (st.getMax() > h) {
                a[bi] -= ci;
                st.update(bi, a[bi]);

                while (ptr > 0) {
                    ptr--;
                    int oldIdx = histIdx[ptr];
                    long oldVal = histVal[ptr];

                    a[oldIdx] -= oldVal;
                    st.update(oldIdx, a[oldIdx]);
                }
            } else {
                histIdx[ptr] = bi;
                histVal[ptr++] = ci;
            }
        }

        for(long x : a) {
            out.print(x + " ");
        }

        out.println();
    }

    static class SegmentTree {
        private class Node {
            private Node left;
            private Node right;
            private int startInterval;
            private int endInterval;
            private long maxVal;

            public Node(int startInterval, int endInterval) {
                this.startInterval = startInterval;
                this.endInterval = endInterval;
            }
        }

        private Node root;

        SegmentTree(long[] a) {
            this.root = constructTree(a, 0, a.length - 1);
        }

        private Node constructTree(long[] a, int start, int end) {
            // BASE CASE: We are at a LEAF node (Range size is 1)
            if (start == end) {
                Node leaf = new Node(start, end);
                leaf.maxVal = a[start];
                return leaf;
            }
            // CREATE NEW NODE for current range
            Node node = new Node(start, end);

            int mid = start + (end - start) / 2;

            node.left = constructTree(a, start, mid);
            node.right = constructTree(a, mid + 1, end);

            node.maxVal = Math.max(node.left.maxVal, node.right.maxVal);

            return node;
        }

        public void update(int idx, long val) {
            update(root, idx, val);
        }

        private long update(Node node, int idx, long val) {
            // Case 1: Out of bounds?
            if (node.startInterval > idx || node.endInterval < idx) {
                return node.maxVal;
            }

            // Case 2: Leaf Node? Update and return.
            if (node.startInterval == idx && node.endInterval == idx) {
                node.maxVal = val;
                return val;
            }

            node.maxVal = Math.max(update(node.left, idx, val), update(node.right, idx, val));

            return node.maxVal;
        }

        public long getMax() {
            return root.maxVal;
        }

        public long query(int sI, int eI) {
            return query(this.root, sI, eI);
        }

        private long query(Node node, int sI, int eI) {
            if (node.startInterval >= sI && node.endInterval <= eI) {
                return node.maxVal;
            } else if (node.startInterval > eI || node.endInterval < sI) {
                return 0;
            } else {
                return query(node.left, sI, eI) + query(node.right, sI, eI);
            }
        }

        // public void display() {
        // display(this.root);
        // }

        // private void display(Node node) {
        // String str = "";

        // if (node.left != null) {
        // str = str + "Interval=[" + node.left.startInterval + "-" +
        // node.left.endInterval + "] and Data: "
        // + node.left.data + " => ";
        // } else {
        // str = str + "No Left Child ";
        // }

        // str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "]
        // and Data: " + node.data
        // + " <= ";

        // if (node.right != null) {
        // str = str + "Interval=[" + node.right.startInterval + "-" +
        // node.right.endInterval + "] and Data: "
        // + node.right.data;
        // } else {
        // str = str + "No Right Child ";
        // }

        // System.out.println(str + '\n');

        // if (node.left != null) {
        // display(node.left);
        // }

        // if (node.right != null) {
        // display(node.right);
        // }
        // }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}