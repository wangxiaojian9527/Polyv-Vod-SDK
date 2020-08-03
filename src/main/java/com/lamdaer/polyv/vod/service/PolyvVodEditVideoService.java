package com.lamdaer.polyv.vod.service;

import com.lamdaer.polyv.vod.bean.request.editVideo.BatchModifyTheVideoAuthorizationMethodRequest;
import com.lamdaer.polyv.vod.bean.request.editVideo.PolyvVodBulkEditAuthorizationStateRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;

/**
 * 编辑视频 Service
 * http://dev.polyv.net/category/videoproduct/v-api/v-api-vmanage/v-api-vmanage-edit/
 *
 * @author lamdaer
 * createTime 2020/5/13
 */
public interface PolyvVodEditVideoService {

    /**
     * 根据vid批量修改视频的授权播放开关状态
     * http://dev.polyv.net/2017/videoproduct/v-api/v-api-vmanage/v-api-vmanage-edit/set-authplay/
     *
     * @param request
     * @return 修改后的结果
     */
    PLVodCommonResult bulkEditAuthorizationState(PolyvVodBulkEditAuthorizationStateRequest request);

    /**
     * 批量修改视频的授权方式
     * http://api.polyv.net/v2/config/{userid}/hlslevel
     * @param request
     * @return
     */
    PLVodCommonResult batchModifyTheVideoAuthorizationMethod(BatchModifyTheVideoAuthorizationMethodRequest request);
}
