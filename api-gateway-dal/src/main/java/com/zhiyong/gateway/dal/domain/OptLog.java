package com.zhiyong.gateway.dal.domain;

import java.util.Date;

public class OptLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opt_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opt_log.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opt_log.operator_id
     *
     * @mbggenerated
     */
    private Integer operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opt_log.operator
     *
     * @mbggenerated
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opt_log.action
     *
     * @mbggenerated
     */
    private String action;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opt_log.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opt_log.result
     *
     * @mbggenerated
     */
    private Integer result;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opt_log.id
     *
     * @return the value of opt_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opt_log.id
     *
     * @param id the value for opt_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opt_log.create_time
     *
     * @return the value of opt_log.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opt_log.create_time
     *
     * @param createTime the value for opt_log.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opt_log.operator_id
     *
     * @return the value of opt_log.operator_id
     *
     * @mbggenerated
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opt_log.operator_id
     *
     * @param operatorId the value for opt_log.operator_id
     *
     * @mbggenerated
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opt_log.operator
     *
     * @return the value of opt_log.operator
     *
     * @mbggenerated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opt_log.operator
     *
     * @param operator the value for opt_log.operator
     *
     * @mbggenerated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opt_log.action
     *
     * @return the value of opt_log.action
     *
     * @mbggenerated
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opt_log.action
     *
     * @param action the value for opt_log.action
     *
     * @mbggenerated
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opt_log.content
     *
     * @return the value of opt_log.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opt_log.content
     *
     * @param content the value for opt_log.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opt_log.result
     *
     * @return the value of opt_log.result
     *
     * @mbggenerated
     */
    public Integer getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opt_log.result
     *
     * @param result the value for opt_log.result
     *
     * @mbggenerated
     */
    public void setResult(Integer result) {
        this.result = result;
    }
}