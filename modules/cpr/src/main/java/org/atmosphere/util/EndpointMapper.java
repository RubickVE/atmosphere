/*
 * Copyright 2012 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.util;

import org.atmosphere.cpr.AtmosphereRequest;

import java.util.Map;

/**
 * This class is responsible for mapping request to handler like {@link org.atmosphere.cpr.AtmosphereHandler}
 * or {@link org.atmosphere.websocket.WebSocketHandler}
 *
 * @param <U>
 */
public interface EndpointMapper<U> {

    /**
     * Mape the request to its associated endpoint.
     * @param path
     * @param handlers
     * @return
     */
    U map(String path, Map<String, U> handlers);

}
