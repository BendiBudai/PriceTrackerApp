package utils;

public class xPath {
    private static final String ARUKERESO_PRODUCT_PPRICE_V1 = "/html/body/div[1]/div[2]/div[3]/div[2]/span[2]/span[1]";
    private static final String ARUKERESO_PRODUCT_PPRICE_V2 = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div";
    private static final String ARUKERESO_PRODUCT_PPRICE_V3 = "/html/body/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]";
    private static final String ARUKERESO_PRODUCT_NAME = "/html/body/div[1]/div[2]/div[3]/div[2]/h1/span[2]";
    //TODO find uniform locator "class=price" ?
    public static String getArukeresoPriceV1() {
        return ARUKERESO_PRODUCT_PPRICE_V1;
    }

    public static String getArukeresoPriceV2() {
        return ARUKERESO_PRODUCT_PPRICE_V2;
    }

    public static String getArukeresoPriceV3() {
        return ARUKERESO_PRODUCT_PPRICE_V3;
    }

    public static String getArukeresoName() {
        return ARUKERESO_PRODUCT_NAME;
    }
}
