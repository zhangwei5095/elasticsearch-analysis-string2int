package org.elasticsearch.index.analysis;
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettingsService;

/**
 */
public class String2IntAnalyzerProvider extends AbstractIndexAnalyzerProvider<String2IntAnalyzer> {

    private final String2IntAnalyzer analyzer;

    @Inject
    public String2IntAnalyzerProvider(Index index, IndexSettingsService indexSettings, Environment env, @Assisted String name, @Assisted Settings settings) {
        super(index, indexSettings.getSettings(), name, settings);
        analyzer = new String2IntAnalyzer(settings);
    }

    @Override
    public String2IntAnalyzer get() {
        return this.analyzer;
    }
}
