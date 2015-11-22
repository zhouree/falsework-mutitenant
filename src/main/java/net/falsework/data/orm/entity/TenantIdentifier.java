package net.falsework.data.orm.entity;

import java.io.Serializable;

/**
 * 多租户系统中租户标识接口
 * @param <T> 租户标识数据类型
 */
public interface TenantIdentifier<T extends Serializable> {
	
	/**
	 * 获取租户唯一标识
	 * @return
	 */
	T getTenantId();

}
