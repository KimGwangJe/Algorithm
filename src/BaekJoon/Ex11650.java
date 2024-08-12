package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point>{
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int compareTo(Point o){
        if(this.x != o.x){
            return this.x - o.x;
        } else {
            return this.y - o.y;
        }
    }
}

public class Ex11650 {
    public static ArrayList<Point> points = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x,y));
        }
        Collections.sort(points);

        for(Point p : points){
            bw.write(p.x + " "+ p.y + "\n");
        }
        bw.flush();
    }
}
