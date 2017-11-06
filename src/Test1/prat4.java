package Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prat4 {
    public static void main(String args[]) throws IOException {
        int x,y;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        x = (new Integer(BR.readLine()));
        y = (new Integer(BR.readLine()));
        if (x == y){
            System.out.print(x);

        }
    }
}
