// Copyright 2019 The OpenSDS Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License"); you may
// not use this file except in compliance with the License. You may obtain
// a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// License for the specific language governing permissions and limitations
// under the License.

package org.opensds.storage.vro.plugin.core;

import ch.dunes.vso.sdk.api.IPluginFactory;

public class OpenSDSStorageTriggerGenerator {
	/**
	 * strart id
	 */
	public static final String STAR_ID = "star_id";

	/**
	 * magnitude
	 */
	public static final String MAGNITUDE = "magnitude";

	/**
	 * singleton method
	 * 
	 * @param aFactory plugin factory
	 * @return OpenSDSStorage trigger generator
	 */
	public static OpenSDSStorageTriggerGenerator createScriptingSingleton(IPluginFactory aFactory) {
		return new OpenSDSStorageTriggerGenerator();
	}
}
