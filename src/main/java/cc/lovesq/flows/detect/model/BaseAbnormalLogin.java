package cc.lovesq.flows.detect.model;

import cc.lovesq.flows.definitions.DetectDO;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description TODO
 * @Date 2021/4/7 9:09 下午
 * @Created by qinshu
 */
@Setter
@Getter
public class BaseAbnormalLogin implements DetectDO {

    private Long id;
    private Integer agentGroup;
    private Integer createTime;
}
