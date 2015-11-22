package net.falsework.tenant;

import java.io.Serializable;

/**
 * 租户接口
 */
public interface Tenant {

	<T extends Serializable> T getId();

	void setId(Serializable id);
}
