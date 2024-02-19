package src.annotations.outer;

public class Test2 {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass("test");
        outer.doTest();

        OuterClass.InnerClass innerClass =  outer.new InnerClass(345);
        innerClass.calc(12,23);
        innerClass.getValue();

        OuterClass.StaticNestedClass outer2 = new OuterClass.StaticNestedClass(12);
        outer2.getValue();

        OuterClass.StaticNestedClass.valueStatic = 200;

    }
}
