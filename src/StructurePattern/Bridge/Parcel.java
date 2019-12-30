package StructurePattern.Bridge;

public class Parcel extends AbstractThing {
    public Parcel(IPost post) {
        super(post);
        name = "包裹";
    }
}
