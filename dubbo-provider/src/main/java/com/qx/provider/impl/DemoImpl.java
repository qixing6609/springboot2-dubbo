package com.qx.provider.impl;

import com.qx.core.api.DemoApi;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoImpl implements DemoApi {

    /**
     *
     * @return
     */
    @Override
    public Map<String, Object> demo() {
        Map<String, Object> demo = new HashMap<>();
        demo.put("aaa", "aaaa");
        demo.put("bbb", "bbbb");
        demo.put("ccc", "cccc");
        return demo;
    }
}
