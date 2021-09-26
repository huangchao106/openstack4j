package org.openstack4j.model.network;

import org.openstack4j.model.ModelEntity;
import org.openstack4j.openstack.networking.domain.ExternalFixedIps;

import java.util.List;

/**
 * Configurable external gateway modes extension model.  By default, when a gateway is attached to a router using the Neutron L3 extension,
 * Network Address Translation (NAT) is enabled for traffic generated by subnets attached to the router. With this extension, the user will 
 * have the option of choosing whether SNAT should be enabled or not on a router basis.
 * 
 * @author Jeremy Unruh
 * @see http://docs.openstack.org/api/openstack-network/2.0/content/extgwmodes-ext.html
 */
public interface ExternalGateway extends ModelEntity {

	/**
	 * @return the network identifier
	 */
	String getNetworkId();

	List<ExternalFixedIps> getExternalFixedIps();
	
	/**
	 * SNAT can be enabled or disabled at any time on a Neutron router regardless of the current status of floating IPs. 
	 * Floating IPs will continue working even when SNAT is disabled. 
	 * 
	 * NOTE: The default setting is True to ensure backward compatibility for plugins supporting this extension.
	 * 
	 * @return true if SNAT is enabled
	 */
	boolean isEnableSnat();
	
}
