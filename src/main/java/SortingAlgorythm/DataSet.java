package SortingAlgorythm;

import java.util.Arrays;

public class DataSet {
    private int[] data;

    public DataSet(int n) {
        this.data = new int[n];
    }

    public DataSet(DataSet proxy) {
        this.data = proxy.data;
    }

    public int  get(int x){

        return data[x];
    }

    public void set(int x, int  value){
    data[x] = value;
    }

    public int getSize(){

        return data.length;
    }

    public void swap(int x,int y){
    int tmp = data[x];
    data[x] = data[y];
    data[y] = tmp;
    }

    public void print(){
        System.out.println(Arrays.toString(data));
    }

}
