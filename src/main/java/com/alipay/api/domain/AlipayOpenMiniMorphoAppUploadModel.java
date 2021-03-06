package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交构建应用
 *
 * @author auto create
 * @since 1.0, 2019-12-26 15:07:41
 */
public class AlipayOpenMiniMorphoAppUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3774871457611773789L;

	/**
	 * 闪蝶应用ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 闪蝶身份校验信息
	 */
	@ApiField("identity")
	private MorphoIdentity identity;

	/**
	 * 基于源码创建场景下的源码信息
	 */
	@ApiField("source")
	private MorphoSource source;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public MorphoIdentity getIdentity() {
		return this.identity;
	}
	public void setIdentity(MorphoIdentity identity) {
		this.identity = identity;
	}

	public MorphoSource getSource() {
		return this.source;
	}
	public void setSource(MorphoSource source) {
		this.source = source;
	}

}
