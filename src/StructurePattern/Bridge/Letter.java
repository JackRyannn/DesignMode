package StructurePattern.Bridge;

public class Letter extends AbstractThing {
    public Letter(IPost post) {
        super(post);
        name = "信件";
    }
}
