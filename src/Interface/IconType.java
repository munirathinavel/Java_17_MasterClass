package Interface;

public enum IconType {
    RED_STAR("Red Star"),
    GREEN_DOTTED("Green Dotted");

    String iconType;
    IconType(String iconType) {
        this.iconType = iconType;
    }

    public String getIconType() {
        return iconType;
    }
}
