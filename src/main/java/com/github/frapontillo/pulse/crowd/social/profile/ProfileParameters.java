/*
 * Copyright 2015 Francesco Pontillo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.frapontillo.pulse.crowd.social.profile;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.github.frapontillo.pulse.spi.IPluginConfig;
import com.github.frapontillo.pulse.spi.PluginConfigHelper;
import com.google.gson.JsonElement;

import java.util.List;

/**
 * @author Francesco Pontillo
 */
@Parameters(separators = "=") public class ProfileParameters
        implements IPluginConfig<ProfileParameters> {
    @Parameter(names = "-source", description = "Source for extraction") private String source;

    @Parameter(names = "-profiles",
            description = "Profile names to fetch information from") private List<String> profiles;

    @Parameter(names = "-tags", description = "Tags to add to profiles") private List<String> tags;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<String> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<String> profiles) {
        this.profiles = profiles;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override public ProfileParameters buildFromJsonElement(JsonElement json) {
        return PluginConfigHelper.buildFromJson(json, ProfileParameters.class);
    }
}
