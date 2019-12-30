package StructurePattern.Bridge;

public class TwoDayPost implements IPost {
    @Override
    public void post() {
        System.out.println("次日达");
    }
}
