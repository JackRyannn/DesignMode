package StructurePattern.Bridge;

public class OneDayPost implements IPost {
    @Override
    public void post() {
        System.out.println("一日达");
    }
}
