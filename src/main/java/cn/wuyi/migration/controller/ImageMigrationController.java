package cn.wuyi.migration.controller;

import cn.wuyi.migration.pojo.entity.ImageTemp;
import cn.wuyi.migration.service.ImageTempService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description  controller
 * @author atong
 * @date 15:22 2020/12/19
 * @version 1.0.0.1
 **/
@RestController
public class ImageMigrationController {

    @Autowired
    ImageTempService imageTempService;

    @GetMapping("/imageTemp/{id}")
    public ImageTemp getImageTemp(@PathVariable Integer id) {
        ImageTemp imageTemp = imageTempService.getImageTempByPrimaryKey(id);
        return imageTemp;
    }

    @GetMapping("/imageTempa/{id}")
    public String getImageTempa(@PathVariable Integer id) {
        ImageTemp imageTemp = imageTempService.getImageTempByPrimaryKey(id);
        return JSON.toJSONString(imageTemp);
    }

    @GetMapping("insert")
    public Integer insertImageTemp() {
        ImageTemp imageTemp = new ImageTemp();
        imageTemp.setOldUrl("www.omo.jpg");
        imageTemp.setOldHash("adg");
        imageTemp.setNewUrl("www.old.jpg");
        imageTemp.setNewHash("goe");
        Integer integer = imageTempService.insertImageTemp(imageTemp);
        return integer;
    }

    @GetMapping("migration")
    public String migration(String url) {
        return imageTempService.migration(url);
    }
}
