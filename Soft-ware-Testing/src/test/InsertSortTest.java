package test;

import static org.junit.Assert.*;

import org.junit.Test;

import work.InsertSort;

public class InsertSortTest
{
	@Test
    public void testLT() {
        int[] a={3,5,9,16,29,47,78,89,94};
        int key=-5;
        int[] result={-5,3,5,9,16,29,47,78,89,94};
        int[] b=InsertSort.insertSort(a,key);
        for(int i=0;i<result.length;i++){
            assertEquals(result[i],b[i]);
        }
    }
    
    @Test
    public void testGT() {
        int[] a={3,5,9,16,29,47,78,89,94};
        int key=205;
        int[] result={3,5,9,16,29,47,78,89,94,205};
        int[] b=InsertSort.insertSort(a,key);
        for(int i=0;i<result.length;i++){
            assertEquals(result[i],b[i]);
        }
    }
    
    @Test
    public void testMid() {
        int[] a={3,5,9,16,29,47,78,89,94};
        int key=50;
        int[] result={3,5,9,16,29,47,50,78,89,94};
        int[] b=InsertSort.insertSort(a,key);
        for(int i=0;i<result.length;i++){
            assertEquals(result[i],b[i]);
        }
    }
    
    @Test
    public void testEqual(){
        int[] a={3,5,9,16,29,47,78,89,94};
        int key=47;
        int[] result={3,5,9,16,29,47,47,78,89,94};
        int[] b=InsertSort.insertSort(a,key);
        for(int i=0;i<result.length;i++){
            assertEquals(result[i],b[i]);
        }
    }

}
