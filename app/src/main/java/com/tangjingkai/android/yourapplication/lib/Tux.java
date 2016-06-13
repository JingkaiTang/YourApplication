package com.tangjingkai.android.yourapplication.lib;

/**
 * Created by Jingkai Tang on 6/9/16.
 */
public class Tux {
    public static String getTux_info() {
        return tux_info;
    }

    public static void setTux_info(String tux_info) {
        Tux.tux_info = tux_info;
    }

    private static String tux_info;

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tux(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tux{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static public String getTuxString(String name, int age) {
        return "Tux{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tux tux = (Tux) o;

        if (age != tux.age) return false;
        return name.equals(tux.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
