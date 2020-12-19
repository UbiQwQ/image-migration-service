package cn.wuyi.migration.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description  图片临时表实体类
 * @author atong
 * @date 11:53 2020/12/19
 * @version 1.0.0.1
 **/
@Data
public class ImageTemp implements Serializable {
    /** 主键id */
    private Integer id;

    /** 原图片urlHash值 */
    private String oldHash;

    /** 原图片url */
    private String oldUrl;

    /** 现图片urlHash值 */
    private String newHash;

    /** 现图片url */
    private String newUrl;

    private static final long serialVersionUID = 1L;
}
