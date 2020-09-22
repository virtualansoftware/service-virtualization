/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.virtualan.model;

import java.util.List;
import java.util.Map;


public class VirtualServiceRequest {
	
	private long id;
	private String operationId;
	private String httpStatusCode;
	private String url;
	private String requestType;
	private String contentType;
	private String method;
	private Class inputObjectType;
	private String outputObjectType;
	private String input;
	private String output;
	private List<VirtualServiceKeyValue> availableParams;
	private List<VirtualServiceKeyValue> headerParams;
	//private Map<String, VirtualServiceApiResponse> responseType;
	private String excludeList;
	private String resource;
	private String desc;
	private VirtualServiceStatus mockStatus;
	private String type;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public List<VirtualServiceKeyValue> getHeaderParams() {
		return headerParams;
	}
	
	public void setHeaderParams(List<VirtualServiceKeyValue> headerParams) {
		this.headerParams = headerParams;
	}
	
	public String getResource() {
		return resource;
	}
	
	public void setResource(String resource) {
		this.resource = resource;
	}

	/*public Map<String, VirtualServiceApiResponse> getResponseType() {
		return responseType;
	}

	public void setResponseType(Map<String, VirtualServiceApiResponse> responseType) {
		this.responseType = responseType;
	}*/
	
	public String getExcludeList() {
		return excludeList;
	}
	
	public void setExcludeList(String excludeList) {
		this.excludeList = excludeList;
	}
	
	private Map<String, String> httpStatusMap;
	
	public VirtualServiceRequest(long id, String operationId, String input, String output) {
		this.id = id;
		this.operationId = operationId;
		this.input = input;
		this.output = output;
	}
	
	public Map<String, String> getHttpStatusMap() {
		return httpStatusMap;
	}
	
	public void setHttpStatusMap(Map<String, String> httpStatusMap) {
		this.httpStatusMap = httpStatusMap;
	}
	
	public VirtualServiceRequest() {
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public List<VirtualServiceKeyValue> getAvailableParams() {
		return availableParams;
	}
	
	public void setAvailableParams(List<VirtualServiceKeyValue> availableParams) {
		this.availableParams = availableParams;
	}
	
	public String getOperationId() {
		return operationId;
	}
	
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	public String getHttpStatusCode() {
		return httpStatusCode;
	}
	
	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	
	public Class getInputObjectType() {
		return inputObjectType;
	}
	
	public void setInputObjectType(Class inputObjectType) {
		this.inputObjectType = inputObjectType;
	}
	
	public String getOutputObjectType() {
		return outputObjectType;
	}
	
	public void setOutputObjectType(String outputObjectType) {
		this.outputObjectType = outputObjectType;
	}
	
	@Override
	public String toString() {
		return "VirtualServiceRequest [id=" + id + ", operationId=" + operationId + ", httpStatusCode=" + httpStatusCode
				+ ", url=" + url + ", method=" + method + ", inputObjectType=" + inputObjectType + ", outputObjectType="
				+ outputObjectType + ", input=" + input + ", output=" + output + ", availableParams=" + availableParams
				+ ", headerParams=" + headerParams + ", "
				//+ "responseType=" + responseType + ", "
				+ "excludeList=" + excludeList
				+ ", resource=" + resource + ", desc=" + desc + ", mockStatus=" + mockStatus + ", httpStatusMap="
				+ httpStatusMap + "]";
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public VirtualServiceStatus getMockStatus() {
		return mockStatus;
	}
	
	public void setMockStatus(VirtualServiceStatus mockStatus) {
		this.mockStatus = mockStatus;
	}
	
}
