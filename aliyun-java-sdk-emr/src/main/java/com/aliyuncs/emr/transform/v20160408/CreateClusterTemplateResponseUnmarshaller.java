/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.CreateClusterTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateClusterTemplateResponseUnmarshaller {

	public static CreateClusterTemplateResponse unmarshall(CreateClusterTemplateResponse createClusterTemplateResponse, UnmarshallerContext context) {
		
		createClusterTemplateResponse.setRequestId(context.stringValue("CreateClusterTemplateResponse.RequestId"));
		createClusterTemplateResponse.setSuccess(context.stringValue("CreateClusterTemplateResponse.Success"));
		createClusterTemplateResponse.setErrCode(context.stringValue("CreateClusterTemplateResponse.ErrCode"));
		createClusterTemplateResponse.setErrMsg(context.stringValue("CreateClusterTemplateResponse.ErrMsg"));
		createClusterTemplateResponse.setClusterTemplateId(context.stringValue("CreateClusterTemplateResponse.ClusterTemplateId"));
	 
	 	return createClusterTemplateResponse;
	}
}