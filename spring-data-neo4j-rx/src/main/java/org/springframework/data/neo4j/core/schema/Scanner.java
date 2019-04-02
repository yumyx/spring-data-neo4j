/*
 * Copyright (c) 2019 "Neo4j,"
 * Neo4j Sweden AB [https://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.core.schema;

import java.util.Collection;

import org.apiguardian.api.API;

/**
 * A scanner produces an instance of schema. The default scanner is based on all the information we can get from
 * a Spring Mapping context (in our case, the {@link org.springframework.data.neo4j.core.mapping.Neo4jMappingContext}.
 *
 * @author Michael J. Simons
 */
@API(status = API.Status.STABLE, since = "1.0")
public interface Scanner {

	/**
	 * Scans the relevant classes and creates a schema.
	 *
	 * @param persistentClasses The classes to scan
	 * @return The new schema.
	 */
	Schema scan(Collection<Class<?>> persistentClasses);
}
