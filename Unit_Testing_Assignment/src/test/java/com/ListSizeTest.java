package com;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListSizeTest {
	ListService l = new ListService();
    @Test
    public void testListSize() {
        List<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        int result = l.getListSize(list);
        assertEquals(3, result); 
    }
}
