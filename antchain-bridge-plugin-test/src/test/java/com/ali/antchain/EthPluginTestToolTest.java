package com.ali.antchain;


import com.alipay.antchain.bridge.commons.bbc.AbstractBBCContext;
import com.alipay.antchain.bridge.commons.bbc.DefaultBBCContext;

import com.alipay.antchain.bridge.plugins.ethereum.EthereumBBCService;
import com.alipay.antchain.bridge.plugins.spi.bbc.AbstractBBCService;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class EthPluginTestToolTest extends TestCase {

    // 测试入参
    AbstractBBCContext inContext;
    AbstractBBCService bbcService;

    // 测试主体结构
    EthPluginTestTool ethTestTool;
    String product;
    String url = "http://127.0.0.1:8545";
    String key = "0xef56b373888bae5e370852bfc8a0e7b98bc4a75d32f7428eca76c2bd7e8a2a56";
    long gasPrice = 2300000000L;
    long gasLimit = 3000000;

    String testConfig = "{\"gasLimit\":"+gasLimit+",\"gasPrice\":"+gasPrice+",\"privateKey\":\""+key+"\",\"url\":\""+url+"\"}";

    @Before
    public void setUp() throws Exception {
        inContext = new DefaultBBCContext();
        inContext.setConfForBlockchainClient(testConfig.getBytes());
        bbcService = new EthereumBBCService();

        ethTestTool = new EthPluginTestTool(inContext, bbcService);
    }

    public void testStartupTest() {
        ethTestTool.startupTest();
    }

    public void testShutdownTest() {
        ethTestTool.shutdownTest();
    }

    public void testGetcontextTest() {
        ethTestTool.getcontextTest();
    }

    public void testSetupamcontractTest() {
        ethTestTool.setupamcontractTest();
    }

    public void testSetupsdpcontractTest() {
        ethTestTool.setupsdpcontractTest();
    }

    @Test
    public void testSetprotocolTest() throws Exception {
        ethTestTool.setprotocolTest();
    }
@Test
    public void testQuerysdpmessageseqTest() {
        ethTestTool.querysdpmessageseqTest();
    }

    public void testSetamcontractandlocaldomainTest() {
        ethTestTool.setamcontractandlocaldomainTest();
    }

    public void testReadcrosschainmessagereceiptTest() {
        ethTestTool.readcrosschainmessagereceiptTest();
    }

    public void testReadcrosschainmessagebyheightTest() {
        ethTestTool.readcrosschainmessagebyheightTest();
    }

    public void testRelayauthmessageTest() {
        ethTestTool.relayauthmessageTest();
    }
}