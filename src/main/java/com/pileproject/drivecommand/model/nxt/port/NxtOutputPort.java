/*
 * Copyright (C) 2011-2015 PILE Project, Inc. <dev@pileproject.com>
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
 *
 */

package com.pileproject.drivecommand.model.nxt.port;

import com.pileproject.drivecommand.machine.device.port.OutputPort;

/**
 * Created by tatsuya on 15/09/03.
 */
public class NxtOutputPort extends OutputPort {
    public static final NxtOutputPort PORT_A = new NxtOutputPort(0);
    public static final NxtOutputPort PORT_B = new NxtOutputPort(1);
    public static final NxtOutputPort PORT_C = new NxtOutputPort(2);
    private final int mPort;

    private NxtOutputPort(int port) {
        mPort = port;
    }

    @Override
    public int getRaw() {
        return mPort;
    }

    @Override
    public String toString() {
        return "[NXT] OUTPUT-PORT-" + (char) ('A' + mPort);
    }
}

