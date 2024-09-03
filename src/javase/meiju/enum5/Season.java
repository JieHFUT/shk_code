package javase.meiju.enum5;

// jdk 5.0
public class Season {

    private final String seasonName;
    private final String seasonDsec;
    // 1. 私有化的构造器
    private Season(String seasonName, String seasonDsec) {
        this.seasonName = seasonName;
        this.seasonDsec = seasonDsec;
    }

    public String getSeasonDsec() {
        return seasonDsec;
    }

    public String getSeasonName() {
        return seasonName;
    }

    // 创建
    public static final Season spring = new Season("Spring", "sp");
    public static final Season summer = new Season("summer", "su");
    public static final Season autumn = new Season("autumn", "au");
    public static final Season winter = new Season("winter", "wi");


}
