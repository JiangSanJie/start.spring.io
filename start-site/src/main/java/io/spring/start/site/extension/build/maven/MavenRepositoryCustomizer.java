/*
 * Copyright 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.start.site.extension.build.maven;

import io.spring.initializr.generator.buildsystem.MavenRepository;
import io.spring.initializr.generator.buildsystem.maven.MavenBuild;
import io.spring.initializr.generator.project.ProjectDescription;
import io.spring.initializr.generator.spring.build.BuildCustomizer;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
public class MavenRepositoryCustomizer implements BuildCustomizer<MavenBuild> {

    private final ProjectDescription description;

    public MavenRepositoryCustomizer(ProjectDescription description) {
        this.description = description;
    }

    @Override
    public void customize(MavenBuild build) {

        build.repositories().add(new MavenRepository.Builder("nexus", "http://nexus.inner.focus.cn/nexus/content/groups/public/"));
    }
}
