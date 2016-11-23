/*
 *
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */
package com.wso2telco.dep.mediator.internal;

import com.wso2telco.dep.mediator.unmarshaler.GroupEventUnmarshaller;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.utils.ConfigurationContextService;

import javax.xml.bind.JAXBException;

 
// TODO: Auto-generated Javadoc

/**
 * The Class RealmServices.
 */
public class RealmServices {
    
    /** The config context service. */
    private static ConfigurationContextService configContextService = null;

    /**
     * Activate.
     *
     * @param context the context
     */
    protected void activate(ComponentContext context) throws JAXBException{
        BundleContext bundleContext = context.getBundleContext();       
      //  bundleContext.registerService(ApplicationManagementService.class.getName(), mgtService, null);       
        GroupEventUnmarshaller.startGroupEventUnmarshaller();
    }

    /**
     * Deactivate.
     *
     * @param context the context
     */
    protected void deactivate(ComponentContext context) {
         
    }

    /**
     * Sets the realm service.
     *
     * @param realmService the new realm service
     */
    protected void setRealmService(RealmService realmService) {

        Util.setRealmService(realmService);
    }

    /**
     * Unset realm service.
     *
     * @param realmService the realm service
     */
    protected void unsetRealmService(RealmService realmService) {
        Util.setRealmService(null);
    }

}