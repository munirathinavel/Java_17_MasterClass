package Interface;

public class UtilityLine  implements Mappable{
    private GeometryType geometryType;
    private String label;
    private IconType iconType;

    public UtilityLine(String label, IconType iconType) {
        this.geometryType = GeometryType.POINT;
        this.label = label;
        this.iconType = iconType;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public GeometryType getGeometryType() {
        return geometryType;
    }

    @Override
    public IconType getIconType() {
        return iconType;
    }

    public void printProperties() {
        Mappable.printProperties(this);

        Mappable.super.defaultMethod();
    }
}
