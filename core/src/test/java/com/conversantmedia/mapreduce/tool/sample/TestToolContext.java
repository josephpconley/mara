package com.conversantmedia.mapreduce.tool.sample;

/*
 * #%L
 * Mara Core framework
 * ~~
 * Copyright (C) 2015 Conversant
 * ~~
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
 * #L%
 */


import com.conversantmedia.mapreduce.tool.ToolContextBase;
import com.conversantmedia.mapreduce.tool.annotation.Distribute;
import com.conversantmedia.mapreduce.tool.annotation.Option;

public class TestToolContext extends ToolContextBase {

	@Option(name="myProperty", description="This is the description")
	private String propA;

	@Option
	@Distribute
	private String propB;

	public String getMyProperty() {
		return propA;
	}

	public String getPropB() {
		return propB;
	}
}