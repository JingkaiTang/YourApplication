package com.tangjingkai.android.yourapplication;

import com.tangjingkai.android.yourapplication.lib.Tux;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jingkai Tang on 6/12/16.
 */
public class TuxTest {
    public static String info = "I'm Tux!";

    @Test
    public void testTux() throws Exception {
        assertEquals(info, Tux.getTux_info());

        String name = "Andy";
        int age = 12;
        Tux tux = new Tux(name, age);
        assertEquals(name, tux.getName());
        assertEquals(age, tux.getAge());

        name += " Alpha";
        age += 22;
        tux.setName(name);
        tux.setAge(age);

        assertEquals(Tux.getTuxString(name, age), tux.toString());
    }

    @Test
    public void testFailure() throws Exception {
        assertEquals(1, 2);
    }

    @Before
    public void beforeTux() {
        Tux.setTux_info(info);
    }
}
