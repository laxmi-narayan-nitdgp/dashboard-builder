/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.dashboard.ui.panel;

import javax.enterprise.context.ApplicationScoped;
import javax.servlet.http.HttpSession;

import org.jboss.dashboard.workspace.PanelSession;

@ApplicationScoped
public class InvalidPanelDriver extends PanelDriver {

    public void init(PanelProvider p) {
        initSystemParameters(p);
        p.setDriver(this);
        p.setEnabled(true);
    }
    public void initPanelSession(PanelSession panelSession, HttpSession session) {
        panelSession.setCurrentPageId(PAGE_MANAGE_INVALID_DRIVER);
    }
}
