package org.mfh144.dtog.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class DtogConfigInquirer implements ConfigInquirer {

	private Map<String, Object> configMap;

	public DtogConfigInquirer() {
		this.configMap = new HashMap<String, Object>();
	}

	@Override
	public void setConfigMap(Map<String, Object> configMap) {
		this.configMap = configMap;
	}

	/**
	 * <p>
	 * Sample config key: dtog-config.jdbc.url
	 * </p>
	 * <p>
	 * The configuration is internal strucuture is baked by nested map object.
	 * dtog-config key provides jdbc map object. jdbc key provides the object or url
	 * map which provides the value of url.
	 * </p>
	 * <p>
	 * Therefore, the start key is dtog-config and end key is url.
	 * </p>
	 * <p>
	 * We will iterate until jdbc key. The jdbc key returns url map object. Use the
	 * end key url to get the value of the url.
	 * </p>
	 * <p>
	 * The total size is 3. 0=dtog-config 1=jdbc 2=url
	 * </p>
	 * <p>
	 * Now, iterate until to 2. 0=dtog-config 1=jdbc
	 * </p>
	 * <p>
	 * Get the end key name url (index=3-1) and get value of the url.
	 * </p>
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getValue(String key) {

		Map<String, Object> tempConfigMap = new HashMap<String, Object>(configMap);
		List<String> delimitedConfigKeys = Arrays.asList(StringUtils.split(key, "."));

		int keySize = delimitedConfigKeys.size();

		int lengthOfMapObjKeys = keySize - 1;

		for (int i = 0; i < lengthOfMapObjKeys; i++) {
			String k = delimitedConfigKeys.get(i);
			Map<String, Object> map = tempConfigMap;
			tempConfigMap = (Map<String, Object>) map.get(k);
		}

		String endKey = delimitedConfigKeys.get(keySize - 1);
		Object valueObj = tempConfigMap.get(endKey);
		T value = (T) valueObj;

		return value;
	}

}
