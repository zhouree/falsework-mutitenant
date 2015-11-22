package net.falsework.data.orm.entity;

import net.falsework.context.TenantContext;

/**
 * 多租户实体对象基类，添加了租户标识 tenantId
 */
public class MutiTenantEntity extends BaseEntity implements TenantIdentifier<Long> {
	
	private static final long serialVersionUID = 1L;
	
	private final Long tenantId;
	
	public MutiTenantEntity() {
		super();
		this.tenantId = TenantContext.getCurrentTenantId();
	}
	public MutiTenantEntity(Long id) {
		super(id);
		this.tenantId = TenantContext.getCurrentTenantId();
	}
	

	public Long getTenantId() {
		return tenantId;
	}

}
