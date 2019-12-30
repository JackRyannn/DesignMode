package StructurePattern.Bridge;

public abstract class AbstractThing{
    IPost obj;
    String name;

    public AbstractThing(IPost post) {
        this.obj = post;
    }

    public void post(){
        System.out.print(name+" ");
        obj.post();
    }

}
