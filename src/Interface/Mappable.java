package Interface;

public interface Mappable {
    String ICON_PROPERTY = "property:{%s}";
    String getLabel();
    GeometryType getGeometryType();

    IconType getIconType();

    static void printProperties(Mappable mappable) {
        System.out.println(mappable.getGeometryType());
        System.out.println(mappable.getIconType());
        System.out.println(mappable.getLabel());
    }

    default void defaultMethod() {
        System.out.println("This is default Method!");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is private Method");
    }

}
