package SortingAlgorythm;

import java.util.Arrays;

public class DataSet {
    private int[] data = {4,8,10,47,9,3,2,16};

    public DataSet() {
    }

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
    int tmp = data[y];
    data[y] = data[x];
    data[x] = tmp;
    }

    public void print(){
        System.out.println(Arrays.toString(data));
    }

}
