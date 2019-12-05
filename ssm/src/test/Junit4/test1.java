package Junit4;

import org.junit.Assert;
import org.junit.Test;

public class test1 {

    @Test
    public void test(){
        Assert.assertEquals(6,test2());
        //System.out.println();
    }

    public int test2(){
        return 1;
    }
}
