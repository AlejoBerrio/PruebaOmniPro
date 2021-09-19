package co.com.linio.test.utils.enums;

public enum URLEnum {
    URLBase("https://www.linio.com.co/");

    private String value;

    public String getValue() {
        return value;
    }

    URLEnum(String value) {
        this.value = value;
    }
}
