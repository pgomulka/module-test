package main.module.test;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("Hello world!");
        Hidden h1 = loadHidden("ok.submodule.MainSubHidden");
        h1.x();
        Hidden h2 = loadHidden("wrong.submodule.SubHidden");
        h2.x();
    }

    private static Hidden loadHidden(String classname) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName(classname);
        return (Hidden) aClass.newInstance();
    }
}