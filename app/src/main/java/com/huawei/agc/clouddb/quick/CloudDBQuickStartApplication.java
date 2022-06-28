/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.agc.clouddb.quick;

import android.app.Application;

import com.huawei.agc.clouddb.quick.model.CloudDBZoneWrapper;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.cloud.database.AGConnectCloudDB;

public class CloudDBQuickStartApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //AGConnectCloudDB.initialize(this);
        CloudDBZoneWrapper.initAGConnectCloudDB(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    private static AGCRoutePolicy regionRoutePolicy = AGCRoutePolicy.SINGAPORE; // Set default region policy

    public static AGCRoutePolicy getRegionRoutePolicy() {
        return regionRoutePolicy;
    }

    public static void setRegionRoutePolicy(AGCRoutePolicy regionRoutePolicy) {
        CloudDBQuickStartApplication.regionRoutePolicy = regionRoutePolicy;
    }
}
