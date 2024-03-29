package com.example.demo.model;

import java.io.Serializable;

public class RolePermission implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role_permission.rid
	 * @mbg.generated
	 */
	private Integer rid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role_permission.pid
	 * @mbg.generated
	 */
	private Integer pid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table role_permission
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role_permission.rid
	 * @return  the value of role_permission.rid
	 * @mbg.generated
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role_permission.rid
	 * @param rid  the value for role_permission.rid
	 * @mbg.generated
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role_permission.pid
	 * @return  the value of role_permission.pid
	 * @mbg.generated
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role_permission.pid
	 * @param pid  the value for role_permission.pid
	 * @mbg.generated
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_permission
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", rid=").append(rid);
		sb.append(", pid=").append(pid);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}