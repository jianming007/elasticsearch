/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package Elasticsearch

import VersionedProject
import includeDevelopmentBranchProjects

object Elasticsearch : VersionedProject({
    uuid = "7ec11a10-4663-40da-8b01-bb9bcc3c82c7"
    id("Elasticsearch")
    parentId("_Root")
    name = "Elasticsearch"

    includeDevelopmentBranchProjects()

    cleanup {
        baseRule {
            all(builds = 1)
        }
        keepRule {
            days(7)
            historyAndStatistics()
        }
        keepRule {
            builds(5)
            logs()
        }
    }
})