package cn.wuyi.migration.consumer;

import cn.wuyi.migration.pojo.entity.ImageTemp;
import cn.wuyi.migration.service.ImageTempService;
import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: image-migration-service
 * @description: 图片迁移url处理
 * @author: atong
 * @create: 2020-12-21 09:50
 */
@Component
@RocketMQMessageListener(   consumerGroup = "migration-group",
        topic = "migration",
        consumeMode = ConsumeMode.CONCURRENTLY,//非顺序消费-并行
        messageModel = MessageModel.CLUSTERING,//集群消费
        consumeTimeout  = 60000L,//超时时间
        consumeThreadMax = 10)
public class ImageMigrationConsumer implements RocketMQListener<String> {

    @Autowired
    private ImageTempService imageTempService;

    @Override
    public void onMessage(String url) {
        //todo 根据url下载图片
        //todo 将下载的图片上传,并返回新的url
        String newUrl = "newUrl";
        //刷盘持久化
        ImageTemp imageTemp = new ImageTemp();
        imageTemp.setNewHash("newHash");
        imageTemp.setNewUrl(newUrl);
        imageTemp.setOldHash("oldHash");
        imageTemp.setOldUrl(url);
        imageTempService.insertImageTemp(imageTemp);
    }
}
