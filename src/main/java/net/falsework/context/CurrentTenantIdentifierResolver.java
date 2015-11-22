package net.falsework.context;

import java.io.Serializable;

public interface CurrentTenantIdentifierResolver<T extends Serializable> {
	
	/**
	 * Resolve the current tenant identifier
	 * @return The current tenant identifier.
	 */
	public T resolveCurrentTenantIdentifier();

}
