package com.anakin.common.tool.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @description: 带分页数据VO
 * @author: anakin
 * @date 2019/4/24 11:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VOPage<T> {


    private Integer pageNum;

    private Integer pageSize;

    private Integer totalPage;

    private long totalNum;

    private List<T> dataList;

    public VOPage(Integer pageNum, Integer pageSize, Long totalNum, List<T> dataList) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalNum = totalNum;
        this.dataList = dataList;
        if (totalNum == 0) {
            totalPage = 0;
        }
        if (totalNum <= pageSize) {
            totalPage = 1;
        }
        if (totalNum > pageSize && totalNum%pageSize == 0) {
            totalPage = (int)(totalNum/pageSize);
        }
        if (totalNum > pageSize && totalNum%pageSize > 0) {
            totalPage = (int)(totalNum/pageSize) + 1;
        }
    }

    /**
     * 将SpringData分页后的list转为分页信息
     */
    public static <T> VOPage<T> restPage(Page<T> pageInfo) {
        VOPage<T> result = new VOPage<T>();
        if (null != pageInfo) {
            result.setPageNum(pageInfo.getNumber());
            result.setPageSize(pageInfo.getSize());
            result.setTotalPage(pageInfo.getTotalPages());
            result.setTotalNum(pageInfo.getTotalElements());
            result.setDataList(pageInfo.getContent());
        }
        return result;
    }




}
