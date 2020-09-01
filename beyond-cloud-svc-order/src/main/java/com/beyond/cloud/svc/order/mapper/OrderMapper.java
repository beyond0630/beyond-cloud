package com.beyond.cloud.svc.order.mapper;

import com.beyond.cloud.order.domain.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyVersioned(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_order
     *
     * @mbg.generated
     */
    int updateVersionedSelective(Order record);
}