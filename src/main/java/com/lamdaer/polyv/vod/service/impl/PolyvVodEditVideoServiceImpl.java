package com.lamdaer.polyv.vod.service.impl;

import com.lamdaer.polyv.vod.bean.request.editVideo.BatchModifyTheVideoAuthorizationMethodRequest;
import com.lamdaer.polyv.vod.bean.request.editVideo.PolyvVodBulkEditAuthorizationStateRequest;
import com.lamdaer.polyv.vod.bean.result.PLVodCommonResult;
import com.lamdaer.polyv.vod.constant.ApiConstants;
import com.lamdaer.polyv.vod.service.PLVodRequestAbstractService;
import com.lamdaer.polyv.vod.service.PolyvVodEditVideoService;

/**
 * 编辑视频 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/13
 */
public class PolyvVodEditVideoServiceImpl extends PLVodRequestAbstractService implements PolyvVodEditVideoService {

    /**
     * 根据vid批量修改视频的授权播放开关状态
     * @param request
     * @return
     */
    @Override
    public PLVodCommonResult bulkEditAuthorizationState(PolyvVodBulkEditAuthorizationStateRequest request) {
        PLVodCommonResult result = postRequest(ApiConstants.BULK_EDIT_AUTHORIZATION_STATE.replace("{userid}", request.getUserId()), request.getParams());
        return result;
    }

    /**
     * 批量修改视频的授权方式
     * @param request
     * @return
     */
    @Override
    public PLVodCommonResult batchModifyTheVideoAuthorizationMethod(BatchModifyTheVideoAuthorizationMethodRequest request) {
        PLVodCommonResult result = postRequest(ApiConstants.BATCH_MODIFY_THE_VIDEO_AUTHORIZATION_METHOD.replace("{userid}", request.getUserId()), request.getParams());
        return result;
    }
}
