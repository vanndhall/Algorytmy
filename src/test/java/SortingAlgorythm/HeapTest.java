package SortingAlgorythm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    @Test
    public void parentTest()
    {

        Heap heap = new Heap();
        assertEquals(0,heap.parent2(1));
        assertEquals(0,heap.parent2(2));
        assertEquals(1,heap.parent2(3));
        assertEquals(1,heap.parent2(4));
        assertEquals(2,heap.parent2(5));
        assertEquals(2,heap.parent2(6));
        //heap.parent()
    }


}