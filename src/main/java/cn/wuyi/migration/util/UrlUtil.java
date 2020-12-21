package cn.wuyi.migration.util;

/**
 * @program: image-migration-service
 * @description: url处理相关util
 * @author: atong
 * @create: 2020-12-21 10:58
 */
public class UrlUtil {

    /**
     * @description
     * @param url: 获取url中的uuid串
     * @return java.lang.String
     * @author atong
     * @date 2020/12/21 11:06
     * @version 1.0.0.1
     */
    public static String getUrlUuid(String url) {
        //根据[/]截取url
        String[] split = url.split("/");
        //取截取的最后一段
        String oldHash = split[split.length - 1];
        //求[.]的index
        int index = oldHash.indexOf(".");
        //截取uuid
        oldHash = oldHash.substring(0, index);
        return oldHash;
    }
}
