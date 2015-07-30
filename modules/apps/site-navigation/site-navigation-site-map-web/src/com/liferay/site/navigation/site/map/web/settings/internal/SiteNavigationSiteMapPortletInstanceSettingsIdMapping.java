/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.site.navigation.site.map.web.settings.internal;

import com.liferay.portal.kernel.settings.definition.ConfigurationPidMapping;
import com.liferay.site.navigation.site.map.web.configuration.SiteNavigationSiteMapPortletInstanceConfiguration;
import com.liferay.site.navigation.site.map.web.constants.SiteNavigationSiteMapPortletKeys;

import org.osgi.service.component.annotations.Component;

/**
 * @author Juergen Kappler
 */
@Component
public class SiteNavigationSiteMapPortletInstanceSettingsIdMapping
	implements ConfigurationPidMapping {

	@Override
	public Class<?> getConfigurationBeanClass() {
		return SiteNavigationSiteMapPortletInstanceConfiguration.class;
	}

	@Override
	public String getSettingsId() {
		return SiteNavigationSiteMapPortletKeys.SITE_NAVIGATION_SITE_MAP;
	}

}