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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MarkAuditContentRequest extends RpcAcsRequest<MarkAuditContentResponse> {
	
	public MarkAuditContentRequest() {
		super("Green", "2017-08-23", "MarkAuditContent", "green");
	}

	private String auditIllegalReasons;

	private String sourceIp;

	private String auditResult;

	private String ids;

	public String getAuditIllegalReasons() {
		return this.auditIllegalReasons;
	}

	public void setAuditIllegalReasons(String auditIllegalReasons) {
		this.auditIllegalReasons = auditIllegalReasons;
		if(auditIllegalReasons != null){
			putQueryParameter("AuditIllegalReasons", auditIllegalReasons);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getAuditResult() {
		return this.auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
		if(auditResult != null){
			putQueryParameter("AuditResult", auditResult);
		}
	}

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("Ids", ids);
		}
	}

	@Override
	public Class<MarkAuditContentResponse> getResponseClass() {
		return MarkAuditContentResponse.class;
	}

}
