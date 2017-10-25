/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.modulization;

/**
 * @author wu-sheng
 */
public class BaseModuleA extends Module {
    @Override public String name() {
        return "BaseA";
    }

    @Override public Class<? extends Service>[] services() {
        return new Class[] {ServiceABusiness1.class, ServiceABusiness2.class};
    }

    public interface ServiceABusiness1 extends Service {

    }

    public interface ServiceABusiness2 extends Service {

    }
}
